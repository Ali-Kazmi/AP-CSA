import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * last name: Kazmi 
 * first name: Ali 
 * Student ID: 12106808
 * period: 2
 */
	public class CountWords {
	   private ArrayList <Word> al=new ArrayList <Word>(); 
	   private String filename; 
	   private int count=0; 
	   
		// Your code goes here
		/**
		 * this is the paramater constructor
		 * @param fname is the name of the string of the file 
		 * */ 
		public CountWords(String fname){
		  loadFile(fname);
		  filename=fname; 
		}
		
		/**
		 * this loads the file 
		 * @param filename is the name of the file to load 
		 * */ 
		public void loadFile(String filename){
		Scanner sc; 
		System.out.println("File: "+filename);
      try{
         sc=new Scanner(new File(filename));
         while(sc.hasNext()){
               String temp=trim(sc.next().toLowerCase().trim()); 
               if(temp.equals("")){
                  continue; 
               }
               else{
               count++;
               Word b=new Word(temp);
               sort();
               if(wordinlist(b,0,al.size()-1)>=0){
                  al.get(wordinlist(b,0,al.size()-1)).incrementCount(); 
               }
               else{
                  al.add(b);
               }
               
               
               }
               }
         }
      catch(Exception e){
         System.out.println("Error: "+e.getMessage());
      }		
	}
	
	/**
	 * this is the one that binary searches
	 * @param w is the word to look for 
	 * @param f is the first spot
	 * @param l is the last spot 
	 * @return an int that is the index for the word 
	 * */ 
		public int wordinlist(Word w, int f, int l){
         if(al.size()==0){
            return -1; 
         }
         //binary search here
         int ind=(l+f)/2;
         if(al.get(ind).compareTo(w)!=0&&(f==l)){
            return -1; //not found (base case of recursion)
         }
         else if(l-f==1){
            if(al.get(ind).compareTo(w)==0){
               return f; 
            }
            else if(al.get(l).compareTo(w)==0){
               return l; 
            }
            else{
               return -1;
            }
         }
         else if(al.get(ind).compareTo(w)==0){
            return ind; 
         }
         else if(al.get(ind).compareTo(w)<0){
            return wordinlist(w,ind,l);
         }
         else{
            return wordinlist(w,f,ind);
         }
         
         
		}
		
		/**
		 * this trims the string to the problems specifications 
		 * @param s is the string to trim 
		 * */ 
		private String trim(String s){
		if (s.length()==0){
			return "";
		}else if (!allow(s.toLowerCase().charAt(0))){
			return trim(s.substring(1));
		}else if (!allow(s.toLowerCase().charAt(s.length()-1))){
			return trim(s.substring(0,s.length()-1));
		}else{
			return s;
		}
	}
	
	/**
	 * this checks if the character is allowed
	 * @param a is the char to check 
	 * */ 
	private boolean allow(char a){
		if ((a>='a'&&a<='z')||(a>='0'&&a<='9')||a=='\''){
			return true;
		}
		return false;
	}

/**
 * this prints the stats 
 **/ 
		public void printStats(){
		   insertionsort(al);
		   System.out.println("Total number of unique words used in the file: "+al.size()); 
		   System.out.println("Total number of words in file: "+count);
		   //then need to implement the printing of stuff 
		   System.out.println("Top 30 words are: ");
		   String t="";
		   for (int i=0; i<al.size()&&i<30; i++)
			t+=String.format("%2d   %3d   %7s\n",i,al.get(i).getCount(),
					al.get(i).getString());
		   System.out.print(t);
		}
		
		/** 
		 * initiates the mergesort 
		 * */ 
		public void sort(){
		   mergeSort(al,0,al.size()-1); 
		}
	
		
	/**
    * takes the whole array and merges the two halves
    * @param a is the arraylist to sort
    * @param first is what it sounds like
    * @param mid is the middle value 
    * @param last is the last value to sort 
    * */ 
   
   private void merge(ArrayList <Word> a, int first, int mid, int last){
      int i = mid - first + 1;
	   int j = last - mid;
	   int k = 0;
	   int u = 0;
	   int l = first;
	   ArrayList <Word> sublist1 = new ArrayList <Word>();
	   ArrayList <Word> sublist2 = new ArrayList <Word>();
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
   public void mergeSort(ArrayList <Word> a, int first, int last){ 
      if(first == last){
	   //do nothing! :) 
	}
	else if(a.size()<=2){
	   //nothing
	}
	else{
	   int mid = (first + last) / 2;
	   mergeSort(a, first, mid);
      mergeSort(a, mid + 1, last);
	   
	   merge(a, first, mid, last);
	   
	}
	
	
   }
   
   /** 
    * this insertion sorts the array 
    * @param list is the arraylist to sort 
    * */ 
   public void insertionsort(ArrayList<Word> list){
      for (int o=1; o<list.size(); o++){
				int p=o;
				Word k=list.get(p);
				while (p>0&&list.get(p-1).getCount()<k.getCount()){
					list.set(p,list.get(p-1));
					p--;
				}
				list.set(p,k);
			}
   }
		
	}
	
