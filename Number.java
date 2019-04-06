
import java.util.ArrayList;
import java.util.*;

/**
 * This is the class that holds an arraylist of digits 
 * @author ali kazmi
 * period 2 
 * 12106808
 * */
public class Number
{
    int value;
    int base;
    ArrayList<Digit> digits = new ArrayList<Digit>();
    
    /**
     * Default constructor to initialize the value to 
     * zero and the base to 10
     * Also initializes the digits
     */
    public Number()
    {
        //Your code goes here
        value=0; 
        base=10; 
        setuparraylist(); 
    }
    /**
     * Constructor to initialize the value and base of the number
     * to the given value and base. Also initializes the digits
     * @param val value
     * @param b base
     */
    public Number(int val, int b)
    {
        // Your code goes here
        value=val;
        base=b; 
        setuparraylist(); 
    }
    
    /**
     * Method to return the digitsList as String
     * @return String containing the digits of the number
     * 			in the given base
     */
    public String toString()
    {
        // Your code goes here
        setuparraylist(); 
        String a="";
        for(Digit d:digits){
            a+=d.toString();
        }
        if(a.equals("")){
        	return "0";
        }
        else{
        	return a;
    }
    }
	
    /**
     * Method to increment the number by 1
     */
    public void increment()
    {
        // Your code goes here
        value++; 
        //just incrementing value is enough! I let my other methods handle the dirty work of conversions 
      
        
    }
    
    /**
     * This is to put the value and base into account when writing the number in the arraylist 
     * it ends with a fully written arraylist number 
     * */ 
    public void setuparraylist(){
      int t=value;
    	for(int i=0; value!=0; i++){
    		int s=digits.size(); 
    		if(i>=s){
    			digits.add(0,new Digit());
    		}
    		digits.set(i, new Digit(value%base, base));
        	digits.get(0).increment();
    		value/=base;
    	}
    	value=t;
    	for(int i=0,j=digits.size()-1;i<j;i++){
    		digits.add(i, digits.remove(j));
    	}
    }
    
    }