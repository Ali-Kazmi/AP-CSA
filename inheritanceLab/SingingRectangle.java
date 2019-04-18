
/**
 * 
 * Last name: Kazmi 
 * First name: Ali 
 * Student ID: 12106808
 * Period 2
 *
 */
public class SingingRectangle extends Rectangle{
	/**
	 * @param l is the length 
	 * @param w is the width 
	 * */ 
	public SingingRectangle(double l, double w){
	   super(l,w);
	}
	
	/**
	 * @return String that is the rectangle song after the rectangle details 
	 * */ 
	public String toString(){
	   return super.toString()+"Rectangle Song: \n   I'm a rectangle. \n    You can see. \n      I have four sides. \n   Count with me \n  2 are short and 2 are long. \n   Come along and sing my song.\n";
	}
}
