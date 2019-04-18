/**
 * Last name: Kazmi 
 * First name: Ali 
 * Student ID: 12106808
 * Period: 2
 * This class does some generic string parsing of a String one character at a time
 * For each character, the appropriate method of the StringHandler interface is called.
 *
 */
public class StringParser {
	StringHandler sth; 
	//Instance variable goes here
	/**
	 * Constructor initializes the handler
	 * @param h - an object that implements the StringHandler interface
	 */
	public StringParser(StringHandler h) {
		//Your code goes here
		sth=h; 
	}
	/**
	 * Parses the string one character at a time. Calls the appropriate
	 * method if the character is a digit, letter, or neither
	 * @param s - string to parse
	 */
	public void parse(String s) {
		//Your code goes here
		int l=s.length(); 
		for(int i=0; i<l; i++){
		   //for every letter 
		   if(Character.isLetter(s.charAt(i))){
		     sth.processLetter(s.charAt(i)); 
		   }
		   else if(Character.isDigit(s.charAt(i))){
		      sth.processDigit(s.charAt(i)); 
		   }
		   else{
		      sth.processOther(s.charAt(i)); 
		   }
		   
		}
		
	}
}
