
import java.util.Scanner;
/**
 * Last name: Kazmi
 * First name: Ali 
 * Student ID: 12106808
 * Period:2
 *
 */
public class Correlation {
	private double avgX;
	private double avgY;
	private double stdDevX;
	private double stdDevY;
	private double globalCountX;
	private double globalCountY;
	/**
	 * this method makes it so you have the average of x and the average of y 
	 * it will store these values into global variables for use in other modules of the program 
	 * @param sc is the scanner with the data 
	 */
   public void average(Scanner sc){
     double countX=0;
	  double sumX=0; 
	  double countY=0;
	  double sumY=0;
	  int rotator=0;
      while(sc.hasNext()) {
    	  if(rotator==0){
    	  	countX=countX+=1;
    	  	sumX=sumX+=sc.nextInt();
    	  	rotator++;
    	  }
    	  else if(rotator==1){
    		  countY=countY+=1;
      	  	sumY=sumY+=sc.nextInt();
      	  	rotator--;
    	  }
    	  }
      System.out.print("Average of x variable = ");
      System.out.printf("%.2f\n", sumX/countX);
      avgX=sumX/countX;
      System.out.print("Average of y variable = ");
      System.out.printf("%.2f\n", sumY/countY);
      avgY=sumY/countY;
      globalCountX=countX;
      globalCountY=countY;
      
   }
   
   /**
    * this method (intended to be called after the average method for proper use) will calculate the standard Deviation of x and y 
    * it will then store the values into global variables for later use 
    * @param sc is the scanner with the data 
    */
   public void standardDeviation(Scanner sc){
	   double part1X=1/(globalCountX-1);
	   double part1Y=1/(globalCountY-1);
	   int rotator=0;
	   double varianceX=0;
	   double varianceY=0;
	   while(sc.hasNext()){
		   if(rotator==0){
			varianceX+=Math.pow((sc.nextInt()-avgX),2);
	     	rotator++;
	    	  }
	    	  else if(rotator==1){
	    		varianceY+=Math.pow((sc.nextInt()-avgY),2);
	      	  	rotator--;
	    	  }
	   }
	   varianceX*=part1X;
	   varianceY*=part1Y;
	   stdDevX=Math.sqrt(varianceX);
	   stdDevY=Math.sqrt(varianceY);
	   System.out.print("Standard Deviation of x variable = ");
	   System.out.printf("%.2f\n", stdDevX);
	   System.out.print("Standard Deviation of y variable = ");
	   System.out.printf("%.2f\n", stdDevY);

   }
  /** 
   * This method (assumes that the 
   * average method and standardDeviation method have already been called) calculates the 
   * correlation coefficient 
   * @param sc is the scanner with data 
   * @return r the correlation coefficient (states how correlated x and y are assuming linearity) 
   */
   public double correlationCoefficient(Scanner sc){
      double r=0;
      double part1=1/(globalCountX-1);
      double part2=0;
      int tempx=0;
      int tempy=0;
      while(sc.hasNext()){
		  tempx=sc.nextInt();
		  tempy=sc.nextInt();
    	  part2+=((tempx-avgX)/stdDevX)*((tempy-avgY)/stdDevY);
	   }
      r=part1*part2;
	  return r; 
   }

	}
