import java.util.ArrayList;
/**
 * 
 * Last name: Kazmi
 * First name: Ali 
 * Student ID: 12106808
 * Period 2
 *
 */
   /**
	 * the class to drive everything 
	 * */ 
public class MeasurableDriver {
	
	/**
	 * the main method
	 * @param args is the starting thing of the main method 
	 * */ 
	public static void main(String[] args) {
		//Your code goes here
		ArrayList <Measurable> al=new ArrayList <Measurable>(); 
		al.add(new Circle(1));
		al.add(new Rectangle(1,1));
		al.add(new Triangle(3,4,5)); 
		al.add(new SingingRectangle(2,2));
		al.add(new Circle(1.5));
		al.add(new Rectangle(1.0, 1.5)); 
		al.add(new Triangle(7,24,25));
		al.add(new Circle(2.0));
		al.add(new Rectangle(2.0,3.0));
		al.add(new Triangle(11,60,61));
		for(int i=0; i<al.size(); i++){
		   System.out.println(al.get(i));
		}
	}

}


