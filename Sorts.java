import java.util.*;

/**
 *  Description of the Class
 *This is a class that has a whole bunch of sorting algorithms 
 * @author ali kazmi
 * period #2
 */
public class Sorts{
  private long steps;

  /**
   *  Description of Constructor
   *this makes a sorting object and sets steps to 0
   * 
   */
  public Sorts(){
    steps = 0;
  }

  /**
   *  Description of the Method
   *This makes the bubblesort method sort an arraylist of comparables
   * @param  list  reference to an array of integers to be sorted
   */
  public void bubbleSort(ArrayList <Comparable> list){
	for(int outer = 0; outer < list.size() -1; outer++)
	{
	   for(int inner = 0; inner < list.size()-outer-1; inner++)
	   {
	      steps += 3;
	      if(list.get(inner).compareTo(list.get(inner + 1)) > 0)
	      {
	         Comparable temp = list.get(inner);
	         list.set(inner, list.get(inner + 1));
	         list.set(inner + 1, temp);
	         steps+= 4;
	         
	      }
	      
	   }
	   
	}
	System.out.println();
	System.out.println("Bubble Sort");
	System.out.println();
     
  }

     
  

  /**
   *  Description of the Method
   *uses selectionsort on an arraylist
   * @param  list  reference to an array of integers to be sorted
   */
  public void selectionSort(ArrayList <Comparable> list){
	//Add your code here
	
	int min;
	Comparable temp;
	steps = 0;
	for(int outer = 0; outer < list.size() -1; outer++){
	   min = outer;
	   for(int inner = outer + 1; inner < list.size(); inner++){
	      steps += 3;
	   if(list.get(inner).compareTo(list.get(min)) < 0) {
	      min = inner; 
	      
	   }
	   }
	   temp = list.get(outer);
	  list.set(outer, list.get(min));
	  list.set(min, temp);
	  steps += 4;
	      
	   
	  }
	System.out.println();
	System.out.println("Selection Sort");
	System.out.println();
  }

  /**
   *  Description of the Method
   *yet another sort: insertion
   * @param  list  reference to an array of integers to be sorted
   */
  public void insertionSort(ArrayList <Comparable> list){
	   for(int outer = 1; outer < list.size(); outer++){
	      steps += 4;
	      int position = outer;
	      Comparable key = list.get(position);
	      // Shift larger values right
	      
	      while((position > 0) && (list.get(position -1).compareTo(key)>0)){
	         steps += 4;
	         list.set(position, list.get(position -1));
	         position--;
	      }
	      
	      list.set(position, key);}
	      
	System.out.println();
	System.out.println("Insertion Sort");
	System.out.println();
  }


 /**
   *  Takes in entire vector, but will merge the following sections
   *  together:  Left sublist from a[first]..a[mid], right sublist from
   *  a[mid+1]..a[last].  Precondition:  each sublist is already in
   *  ascending order
   *
   * @param  a      reference to an array of integers to be sorted
   * @param  first  starting index of range of values to be sorted
   * @param  mid    midpoint index of range of values to be sorted
   * @param  last   last index of range of values to be sorted
   */
 private void merge(ArrayList <Comparable> a, int first, int mid, int last){
	int i = mid - first + 1;
	int j = last - mid;
	int k = 0;
	int u = 0;
	int l = first;
	ArrayList <Comparable> sublist1 = new ArrayList <Comparable>();
	ArrayList <Comparable> sublist2 = new ArrayList <Comparable>();
	// Sets First half into sublist1
	
	for(int x = 0; x < i; x++){
	   steps++; 
	   sublist1.add(x, a.get(first + x));
	}
	
	// Sets second half into sublist2
	for(int y = 0; y < j; y++){
	   steps++; 
	   sublist2.add(y, a.get(mid + 1 + y));
	}
	// Compares two sublist and places elements back into real ArrayList
	
	while(k < i && u < j){
	   //steps += 1;
	   if(sublist1.get(k).compareTo(sublist2.get(u)) < 0){
	      steps += 1;
	      a.set(l, sublist1.get(k));
	      k++;
	   }
	   else{
	      steps += 1;
	      a.set(l, sublist2.get(u));
	      u++;
	   }
	   l++;
	}
	// Places excess elements into real ArrayList

	while(k < i){
	   steps += 1;
	   a.set(l, sublist1.get(k));
	   k++;
	   l++;
	}
	
	while(u < j){
	   steps += 1;
	   a.set(l, sublist2.get(u));
	   u++;
	   l++;
	}

	   
  }


  /**
   *  Recursive mergesort of an array of integers
   *
   * @param  a      reference to an array of integers to be sorted
   * @param  first  starting index of range of values to be sorted
   * @param  last   ending index of range of values to be sorted
   */
  public void mergeSort(ArrayList <Comparable> a, int first, int last){
	if(first == last){
	
	}
	else{
	   int mid = (first + last) / 2;
	   mergeSort(a, first, mid);
	   
	   mergeSort(a, mid + 1, last);
	   
	   merge(a, first, mid, last);
	   
	}

  }
  

  /**
   *  Description of the Method
   *  this quicksorts the array 
   * @param  a      reference to an array of integers to be sorted
   * @param  first  starting index of range of values to be sorted
   * @param  last   ending index of range of values to be sorted
   */
      public void quickSort(ArrayList<Comparable> a, int first, int last)
  {
        int g = first, h = last;
        int midIndex = (first + last) / 2;
        Comparable dividingValue = a.get(midIndex);
        steps += 1;
        do{
          steps += 3;
      	 while (a.get(g).compareTo(dividingValue) < 0){
      	    g++;
      	 }
      	 steps +=3;
      	 while (a.get(h).compareTo(dividingValue) > 0){
      	    h--;
      	 }
      	 if (g <= h){
      	    steps += 3;
      	    swap(a,g,h);
      	    g++;
      	    h--;
      	    }
      	 
        }while (g < h);
      	 if (h > first){
      	    quickSort (a,first,h);
      	    steps += 1;
      	 
      	 }
      	 if (g < last){
      	    quickSort (a,g,last);
      	    steps += 1;
      	   
      	 }
        }
	   
  /**
   *  Accessor method to return the current value of steps
   *@return long the number of steps 
   */
  public long getStepCount(){
    return steps;
  }
  /**
   *  Modifier method to set or reset the step count. Usually called
   *  prior to invocation of a sort method.
   *
   * @param  stepCount   value assigned to steps
   */
  public void setStepCount(long stepCount){
    steps = stepCount;
  }
 
   /**
   *  Interchanges two elements in an ArrayList
   *
   * @param  list  reference to an array of integers
   * @param  a     index of integer to be swapped
   * @param  b     index of integer to be swapped
   */
  public void swap(ArrayList <Comparable> list, int a, int b){
        //replace these lines with your code
        Comparable temp = list.get(a);
        list.set(a,list.get(b));
        list.set(b,temp);
 }
}


