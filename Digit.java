/**
 * this is the class that lets us have a single digit with a given base
 * @author Ali Kazmi 
 * period 2 
 * 12106808
 * */
public class Digit
{
    int value;
    int base;
    
    /**
     * Default constructor to initialize the value
     * to zero and base to 10
     */
    public Digit()
    {
      	// Your code goes here
      	value=0; 
      	base=10; 
    }
    /**
     * Constructor to initialize the value and 
     * base of this Digit to the given values
     * @param val initial value
     * @param b base
     */
    public Digit(int val, int b)
    {
      	// Your code goes here
      	value=val; 
      	base=b; 
    }
    /**
     * Method to return the digit as a string for
     * printing
     * @return a string of the digit
     */
    public String toString()
    {
        // Your code goes here
         if(base<=10){
            //if its decimal or lower, it wont need letters
            String temp="";
            temp+=value;
            return temp;
         }
         else if(value<10){
            //if it doesnt use those extra digits, it wont need letters either
            String temp="";
            temp+=value;
            return temp;
         }
         else{
            //we need letters for stuff like hex but anything above base 10
            int x='A'+value-10; 
            String temp="";
            temp+=(char)x;
            return temp;
         }
	
    }
    /**
     * Method to increment the digit by 1
     * @return true if there is carry, false otherwise
     */
    public boolean increment()
    {
      	// Your code goes here
	   if(value+1>=base){
	      return true;
	   }
	   else{
	      return false; 
	   }
    }
    
    
}