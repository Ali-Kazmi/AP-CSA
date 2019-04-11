import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * @author last name: Kazmi 
 * first name: Ali 
 * student ID: 12106808
 * period #2
 */
public class Store{

	//Your code goes here
	private ArrayList <Item> myStore = new ArrayList <Item> (); 
	private String filename;
	
	/** 
	 * constructor that takes a filename and loads that file 
	 * @param fName is the name of the file to load
	 * */ 
   public Store(String fName){
      filename=fName;
      loadFile(); 
   } 
    
    /** 
     * default constructor 
     * */
   public Store(){
      filename="file50.txt";
   } 
   
   /**
    * loads the file stored in the string filename
    * */ 
   private void loadFile(){
      Scanner sc; 
      try{
         sc=new Scanner(new File(filename)); 
         int newid=0;
         int newinv=0; 
         while(sc.hasNext()){
               newid=sc.nextInt(); 
               newinv=sc.nextInt(); 
               Item a=new Item(newid, newinv);
               myStore.add(a);
         }
      }
      catch(Exception e){
         System.out.print("file not found "+e.getMessage());
      }
      
   } 
   
   /**
    * prints the store
    * */ 
   public void displayStore(){
      System.out.println("       Id       Inv");
      System.out.println(); 
      for(int i=0; i<myStore.size(); i++){
         int j=i+1; 
         if(j<10){
            System.out.print(j+"      ");
         }
         else{
            System.out.print(j+"     ");
         }
         System.out.println(myStore.get(i)); 
         if(j%10==0){
            System.out.println(); 
         }
      }
   } 
   
   
   /**
    * puts the store into a string 
    * @return the string that we made
    * */
   public String toString(){
      
      String s="";
      for(int i=0; i<myStore.size(); i++){
         s+=myStore.get(i).toString(); 
         if(i==10){
            //no need 
         }
      }
      return s; 
   } 
   
   /**
    * gets the recursive sort going 
    * */ 
   public void sort(){
      mergeSort(myStore, 0, myStore.size()-1); 
   }
   
   /**
    * takes the whole array and merges the two halves
    * @param a is the arraylist to sort
    * @param first is what it sounds like
    * @param mid is the middle value 
    * @param last is the last value to sort 
    * */ 
   private void merge(ArrayList <Item> a, int first, int mid, int last){
      int i = mid - first + 1;
	   int j = last - mid;
	   int k = 0;
	   int u = 0;
	   int l = first;
	   ArrayList <Item> sublist1 = new ArrayList <Item>();
	   ArrayList <Item> sublist2 = new ArrayList <Item>();
	   // Sets First half into sublist1
	
	for(int x = 0; x < i; x++){
	   sublist1.add(x, a.get(first + x));
	}
	
	// Sets second half into sublist2
	for(int y = 0; y < j; y++){
	   sublist2.add(y, a.get(mid + 1 + y));
	}
	// Compares two sublist and places elements back into real ArrayList
	
	while(k < i && u < j){
	   if(sublist1.get(k).compareTo(sublist2.get(u)) < 0){
	      a.set(l, sublist1.get(k));
	      k++;
	   }
	   else{
	      a.set(l, sublist2.get(u));
	      u++;
	   }
	   l++;
	}
	// Places excess elements into real ArrayList

	while(k < i){
	   a.set(l, sublist1.get(k));
	   k++;
	   l++;
	}
	
	while(u < j){
	   a.set(l, sublist2.get(u));
	   u++;
	   l++;
	}

   } 
   
   /** 
    * mergesorts the arraylist recursively
    * @param a is the arraylist to mergesort
    * @param first is where to start sorting 
    * @param last is where to stop sorting 
    * */ 
   public void mergeSort(ArrayList <Item> a, int first, int last){ 
      if(first == last){
	   //do nothing! :) 
	}
	else{
	   int mid = (first + last) / 2;
	   mergeSort(a, first, mid);
	   
	   mergeSort(a, mid + 1, last);
	   
	   merge(a, first, mid, last);
	   
	}
   }
   
       /**
     * method to run the binary search and print out results
     */
    public void testSearch(){ 
    	   int idToFind; 
           int invReturn; 
           int index; 
           Scanner in = new Scanner(System.in); 

           System.out.println("Testing search algorithm\n"); 
           do{ 
               System.out.println(); 
               System.out.print("Enter Id value to search for (-1 to quit) --> "); 
               idToFind = in.nextInt(); 
               if (idToFind >= 0) { 
                  //index = bsearch(new Item(idToFind, 0)); 
                  //recursive version call 
                  index = bsearch (new Item(idToFind, 0), 0, myStore.size()-1); 
                  System.out.print("Id # " + idToFind + ":"); 
                  if (index == -1){ 
                       System.out.println(" No such part in stock"); 
                   }else{ 
                       System.out.println(" Inventory = " + myStore.get(index).getInv()); 
                   } 
               } 
           } while (idToFind >= 0); 
    } 
    /** 
    * Searches the myStore ArrayList of Item Objects for the specified 
    * item object using a iterative binary search algorithm 
    * 
    * @param idToSearch Item object containing id value being searched for 
    * @return index of Item if found, -1 if not found 
    */ 

    private int bsearch(Item idToSearch){
    	int mid = myStore.size()/2;
    	int first = 0;
    	int last = myStore.size()-1;
    	do{
    		if(idToSearch.compareTo(myStore.get(mid))>0){
    			first = mid;
    			mid = (last + mid)/2;
    		}else{
    			last = mid;
    			mid = (first + mid)/2;
    		}
    	}while(last-first>1);
    	if(myStore.get(mid).equals(idToSearch)){
    		return mid;
    	}else{
    		return -1;
    	}
    } 
    /** 
    * Searches the specified ArrayList of Item Objects for the specified 
    * id using a recursive binary search algorithm 
    * 
    * @param idToSearch Id value being search for 
    * @param first Starting index of search range 
    * @param last Ending index of search range 
    * @return index of Item if found, -1 if not found 
    */ 

    private int bsearch(Item idToSearch, int first, int last){ 
    	if(last-first==1){
    		if(myStore.get(first).equals(idToSearch)){
    			return first;
    		}else if(myStore.get(last).equals(idToSearch)){
    			return last;
    		}else{
    			return -1;
    		}
    	}
    	Item mid = myStore.get((first+last)/2);
    	if(mid.compareTo(idToSearch)>0){
    		return bsearch(idToSearch, first, (first+last)/2);
    	}else{
    		return bsearch(idToSearch,(first+last)/2,last);
    	}
    } 
}
  


