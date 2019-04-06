import java.util.*;
import java.io.*;


/**
 * Chapter AB23 - Two-Dimensional Arrays Exercises
 * 
 * @author Ali Kazmi 
 * @author Period 2
 * @author Assignment - MatrixManipulator
 */
public class MatrixManipulator
{
    /**
     * Put Description here
     * @param data takes the array input 
     * @return int that is the sum of all array elements 
     */
    public int sumOfAllArrayElements( int[][] data )
    {

        // declare the sum
        int sum=0; 

        // compute the sum
       for(int i=0; i<data.length; i++){
          for(int j=0; j<data[i].length; j++){
             sum+=data[i][j];
       } //dont name the second one i2, it doesn't work 
        }
    
    	
        return sum;
    }


    /**
     * Put Description here
     * @param data an int array that we use to do the stuff
     * @return int[] that holds the sum of each row 
     */
    public int[] sumOfEachRow( int[][] data )
    {
        // declare the row sum array
        int[] rowSums=new int[data.length];
         
        // compute the sums for each row
        for ( int row = 0; row < data.length; row++ ){
            // initialize the sum
            int sumofrow=0;
            for(int i=0; i<data[row].length; i++){
                  sumofrow+=data[row][i];   
            }
            rowSums[row]=sumofrow;
            // compute the sum for this row
            
            
        }

        return rowSums;
    }


    /**
     * Put Description here
     * @param data an int array that we use to do the stuff
     * @return int[] that holds the sum of each column
     */
    public int[] sumOfEachColumn( int[][] data ){
        // compute the sums for each col
        int maxrow=0 ; 
        for ( int row = 0; row < data.length; row++ ){
            // initialize the sum
           if(data[row].length>maxrow){
              maxrow=data[row].length; 
           }
        
           
        }
        
     int[] colSums=new int[maxrow];
         
        // compute the sums for each row
        for ( int row= 0; row < data.length; row++ ){
            // initialize the sum
            int sumofrow=0;
            for(int i=0; i<data[row].length; i++){
                  colSums[i]+=data[row][i];   
            }
        }

        return colSums;
    }

    /**
     * Put Description here
     * @param data an int array that we use to do the stuff
     * @return boolean that holds if it is magic or not 
     */
    public boolean isMagic( int[][] data ){
    	//check if the array is a magic square. This means that it must be square, 
    	//and that all row sums, all column sums, and the two diagonal-sums 
    	//must all be equal.
    	boolean colsumsequal=false; 
    	boolean rowsumsequal=false; 
    	boolean diagonalsumsequal=true; 
    	boolean square=false; 
    	
    	int[] sum=sumOfEachRow(data);
    	for(int i=0; i<sum.length; i++){
    	 if(sum[0]!=sum[i]){
    	    //nothing! 
    	 }  
    	 else{
    	    rowsumsequal=true; 
    	 }
    	}
    	
    	int[] sumc=sumOfEachColumn(data);
    	for(int i=0; i<sumc.length; i++){
    	 if(sumc[0]!=sumc[i]){
    	    //nothing! 
    	 }  
    	 else{
    	    colsumsequal=true; 
    	 }
    	}
    	
    	//now check for rectangular 
    	if(sum.length==sumc.length){
    	   square=true; 
    	}
    	else{
    	   return false; 
    	}
    	
    	//now check for diagonal
    	
    	int diagsum=0; 
    	int diagsumtwo=0; 
    	int length=sum.length-1; 
    	
    	for(int i=0; i<data.length; i++){
    	   diagsum+=data[i][i];
    	}
    	
    	for(int i=0; i<data.length; i++){
    	   diagsumtwo+=data[i][length--];
    	}
    	if(diagsum==diagsumtwo){
    	   diagonalsumsequal=true;
    	}
    	else{
    	   diagonalsumsequal=false; 
    	}
    	
    	if(colsumsequal){
    	   if(rowsumsequal){
    	      if(diagonalsumsequal){
    	         if(square){
    	            return true; 
    	         }
    	      }
    	   }
    	}
    	return false;
    }
    /**
     * Put Description here
     * @param data an int array that we use to do the stuff
     * @return int[] that holds the max and min elements of data
     */
    public int[] maxAndMinElements( int[][] data )
    {
        // declare the max and the min
        int max = data[0][0];
        int min = data[0][0];
         for(int i=0; i<data.length; i++){
          for(int j=0; j<data[i].length; j++){
             if(data[i][j]>max){
                max=data[i][j];
             }
             if(data[i][j]<min){
                min=data[i][j]; 
             }
       } //dont name the second one i2, it doesn't work 
        }
        int[] result = { max, min };
        return result;
    }


    /**
     * Put Description here
     * @param data an int array that we use to do the stuff
     * @return int[] that holds the largest elements of each row 
     */
    public int[] largestElements( int[][] data ){
        // declare the largest in row array
        int[] largestInRow = new int[data.length];
         
        // compute the sums for each row
        for ( int row = 0; row < data.length; row++ ){
            int largest=0;
            for(int i=0; i<data[row].length; i++){
                  if(data[row][i]>largest){
                     largest=data[row][i];
                  }   
            }
            largestInRow[row]=largest;
            
            
        }
        // find the largest element in each row
 

        return largestInRow;
    }


    /**
     * Put Description here
     * @param data  is the matrix with the data to reverse and print 
     */
    public void reversalOfElementsInEachRow( int[][] data ){
    	// reverse each row and print it
    for(int j = 0; j < data.length; j++){
      for(int i = data[j].length-1; i >=0; i--) {
        System.out.print(data[j][i]+" ");
    }
    System.out.println(); 
}
    }


    /**
     * Put Description here
     * @param image an int array that we use to do the stuff
     * @return int[][] that holds the smoothed image 
     */
    public int[][] imageSmootherEasy( int[][] image )
    {
        // assume a rectangular image
        int[][] smooth = new int[image.length][image[0].length];

 for(int i=1; i<image.length-1; i++){
          for(int j=1; j<image[i].length-1; j++){
             int average=0; 
             average+=image[i-1][j-1];
             average+=image[i][j-1];
             average+=image[i+1][j-1];
             average+=image[i-1][j];
             average+=image[i+1][j];
             average+=image[i][j];
             average+=image[i-1][j+1];
             average+=image[i][j+1];
             average+=image[i+1][j+1];
             average=average/9; 
             smooth[i][j]=average;
       } //dont name the second one i2, it doesn't work 
        }
        // Compute the smoothed value for
        // non-edge locations in the image.
        return smooth;
    }


    /**
     * Put Description here
     * @param image an int array that we use to do the stuff
     * @return int[][] that holds the smoothed image 
     */
    public int[][] imageSmootherHard( int[][] image )
    {
        // assume a rectangular image
        int[][] smooth = new int[image.length][image[0].length];
        int[][] copy= new int[image.length+2][image[0].length+2];
        // Compute the smoothed value for all 
        // locations in the image.
        for(int i=0; i<copy.length-1; i++){
          copy[i][0]=0; 
          copy[i][copy[i].length-1]=0; 
        }
        
        for(int j=0; j<image[0].length-1; j++){
            //set first and last row of column all to zeroes  
            copy[0][j]=0;
            copy[copy.length-1][j]=0; 
          }
        //fill up the bigger matrix with a copy of the image but 0's for the first and last row and the sides 
        for(int i=0; i<image.length-1; i++){
          for(int j=0; j<image[i].length-1; j++){
               copy[i+1][j+1]=image[i][j];
          }
        }
        
        //call the old method and run it into the smooth matrix 
        copy=imageSmootherEasy(copy);
         
         for(int i=0; i<copy.length-2; i++){
          for(int j=0; j<copy[i].length-2; j++){
               smooth[i][j]=copy[i+1][j+1];
          }
        }
        
        return smooth;
    }
}





