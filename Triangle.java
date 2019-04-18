/**
 * 
 * Last name: Kazmi 
 * First name: Ali 
 * Student ID: 12106808
 * Period 2
 *
 */
public class Triangle implements Measurable{
	//Your code goes here
	private double sideOne; 
	private double sideTwo;
	private double sideThree;

   /**
	 *the default constructor  
	 * */ 
	public Triangle(){
	   sideOne=1;
	   sideTwo=1;
	   sideThree=1; 
	}
	
	/**
	 * @param s is the first side 
	 * @param stwo is the second side 
	 * @param sthree is the third side 
	 * */ 
	public Triangle(double s, double stwo, double sthree){
	   sideOne=s;
	   sideTwo=stwo;
	   sideThree=sthree; 
	}
	
	/**
	 * @return double the perimeter 
	 * */ 
	 public double getPerimeter(){
	    return sideOne+sideTwo+sideThree; 
	 } 
    /**
	 * @return double the area 
	 * */ 
    public double getArea(){
       double area; 
       double p=getPerimeter()/2; 
       area=Math.sqrt(p*(p-sideOne)*(p-sideTwo)*(p-sideThree));
       return area; 
    } 
    /**
     * @return String returns the dimensions, perimeter, and area as a String 
     * */
    public String toString(){
      return "Triangle:\n   side1 = "+sideOne+"\n   side2 = "+sideTwo+"\n   side3 = "+sideThree+"\n   perimeter = "+getPerimeter()+"\n   area = "+getArea()+"\n";
    } 
}

