/**
 * 
 * Last name: Kazmi 
 * First name: Ali 
 * Student ID: 12106808
 * Period 2
 *
 */
public class Circle implements Measurable{
	//Your Code goes here
	private double radius; 
	
	/**
	 * default constructor 
	 * */ 
	public Circle(){
	   radius=0; 
	}
	
	/**
	 * @param r is the radius of the circle 
	 * */ 
	public Circle(double r){
	   radius=r; 
	}
	
	/**
	 * @return the perimeter of the circle 
	 * */ 
	public double getPerimeter(){
	   return Math.PI*radius*2; 
	}
	
	
	/**
	 * @return the area of the circle 
	 * */ 
	public double getArea(){
	   return Math.PI*radius*radius; 
	}
	
	/**
	 * @return String that is the circles data 
	 * */ 
	public String toString(){
	   return "Circle:\n   radius = "+radius+"\n   circumference = "+getPerimeter()+"\n   area = "+getArea()+"\n";
	}
}




