/**
 * 
 * Last name: Kazmi 
 * First name: Ali 
 * Student ID: 12106808
 * Period 2
 *
 */
public class Rectangle implements Measurable{
	//Your code goes here
	private double length;
	private double width; 
	
	/**
	 * default constructor 
	 * */ 
	public Rectangle(){
	   length=1;
	   width=1; 
	}
	/**
	 * @param l is the length 
	 * @param w is the width 
	 * */ 
	public Rectangle(double l, double w){
	   length=l; 
	   width=w; 
	}
	
	/**
	 * @return double that is the perimeter 
	 * */ 
	 public double getPerimeter(){
	    return 2*length+2*width; 
	 } 
    /**
	 * @return double that is the area of the rectangle 
	 * */ 
    public double getArea(){
       return length*width; 
    } 
    /** 
     * @return String returns the dimensions, perimeter, and area as a String 
     * */
    public String toString(){
       return "Rectangle:\n   length = "+length+"\n   width = "+width+"\n   perimeter = "+getPerimeter()+"\n   area = "+getArea()+"\n";
    } 
}
