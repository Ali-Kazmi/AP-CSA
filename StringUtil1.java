
/**
 * 
 * Last name: Kazmi
 * First name: Ali
 * Student ID: 12106808
 * Period: 2
 *
 */

/** Write a one sentence summary about your class
 * this class allows you to reverse strings, check palindromes, and shorthand 
 */
public class StringUtil1 
{	//Declare instance variables here
	
	
	/**
	 * Write a one sentence description of the method
	 * Describe the parameters and return values
	 * @param s is the string to reverse
	 * this reverses a string 
	 * @return a string that is the reverse of s 
	 */
	public static String reverse(String s)
	{
		//Your code goes here
		if(s.isEmpty()||s.length()==1){
		     return s;    
		    }
		    else{
		        return s.charAt(s.length()-1)+reverse(s.substring(0,s.length()-1));   
		    }
		
	}
	
	/**
	 * Write a one sentence description of the method
	 * Describe the parameters and return values
	 * @param s is the string to check  if it is a palindrome 
	 * @return true if it is a palindrome, false otherwise 
	 */
	public static boolean palindrome(String s)
	{
		//Your code goes here
		s=s.toLowerCase().trim();
    	if(s.indexOf(",")>=0){
    		s=s.substring(0, s.indexOf(","))+s.substring(s.indexOf(",")+1);
    		s=helpPalindrome(s);
    	}else if(s.indexOf(".")>=0){
    		s=s.substring(0, s.indexOf("."))+s.substring(s.indexOf(".")+1);
    		s=helpPalindrome(s);
    	}else if(s.indexOf(":")>=0){
    		s=s.substring(0, s.indexOf(":"))+s.substring(s.indexOf(":")+1);
    		s=helpPalindrome(s);
    	}else if(s.indexOf(" ")>=0){
    		s=s.substring(0, s.indexOf(" "))+s.substring(s.indexOf(" ")+1);
    		s=helpPalindrome(s);
    	}else if(s.indexOf("'")>=0){
    		s=s.substring(0, s.indexOf("'"))+s.substring(s.indexOf("'")+1);
    		s=helpPalindrome(s);
    	}else if(s.indexOf("?")>=0){
    		s=s.substring(0, s.indexOf("?"))+s.substring(s.indexOf("?")+1);
    		s=helpPalindrome(s);
    	}else if(s.indexOf("!")>=0){
    		s=s.substring(0, s.indexOf("!"))+s.substring(s.indexOf("!")+1);
    		s=helpPalindrome(s);
    	}
		 if(s.equalsIgnoreCase(reverse(s))){
		     return true;    
		    }
		 else if(s.indexOf("/")!=-1){
		            String news=s.substring(0,s.indexOf("/")-1)+s.substring(s.indexOf("/")+1);
		            s=news;
		            		if(s.equalsIgnoreCase(reverse(s))){
		                     return true;    
		                         }
		 }

		  else {
		        return false;
		    }
		return false; 
	}
	/**
	 * @param s is a string that you are cleaning of all this junk to make the palindrome function work 
	 * this method lets you clean a string of junk that gets in the way 
	 * @return string that is cleaned 
	 * */
	public static String helpPalindrome(String s){
	   s=s.toLowerCase().trim();
    	if(s.indexOf(",")>=0){
    		s=s.substring(0, s.indexOf(","))+s.substring(s.indexOf(",")+1);
    		s=helpPalindrome(s);
    	}else if(s.indexOf(".")>=0){
    		s=s.substring(0, s.indexOf("."))+s.substring(s.indexOf(".")+1);
    		s=helpPalindrome(s);
    	}else if(s.indexOf(":")>=0){
    		s=s.substring(0, s.indexOf(":"))+s.substring(s.indexOf(":")+1);
    		s=helpPalindrome(s);
    	}else if(s.indexOf(" ")>=0){
    		s=s.substring(0, s.indexOf(" "))+s.substring(s.indexOf(" ")+1);
    		s=helpPalindrome(s);
    	}else if(s.indexOf("'")>=0){
    		s=s.substring(0, s.indexOf("'"))+s.substring(s.indexOf("'")+1);
    		s=helpPalindrome(s);
    	}else if(s.indexOf("?")>=0){
    		s=s.substring(0, s.indexOf("?"))+s.substring(s.indexOf("?")+1);
    		s=helpPalindrome(s);
    	}else if(s.indexOf("!")>=0){
    		s=s.substring(0, s.indexOf("!"))+s.substring(s.indexOf("!")+1);
    		s=helpPalindrome(s);
    	}
    	return s;
    }
	
	
	
	/**
	 * Write one sentence description of the method
	 * Describe the parameters and return values
	 * @param s is the string that is being converted to shorthand 
	 * @return string that is the shorthand version of the input string 
	 */
	public static String shorthand(String s){
    	if(s.toUpperCase().indexOf("YOU")>=0){
    		s=s.substring(0, s.toUpperCase().indexOf("YOU"))+" U "+s.substring(s.toUpperCase().indexOf("YOU")+3);
    		s=shorthand(s);
    	}else if(s.toUpperCase().indexOf("FOR")>=0){
    		s=s.substring(0, s.toUpperCase().indexOf("FOR"))+" 4 "+s.substring(s.toUpperCase().indexOf("FOR")+3);
    		s=shorthand(s);
    	}else if(s.toUpperCase().indexOf("AND")>=0){
    		s=s.substring(0, s.toUpperCase().indexOf("AND"))+" & "+s.substring(s.toUpperCase().indexOf("AND")+3);
    		s=shorthand(s);
    	}else if(s.toUpperCase().indexOf("TO")>=0){
    		s=s.substring(0, s.toUpperCase().indexOf("TO"))+" 2 "+s.substring(s.toUpperCase().indexOf("TO")+3);
    		s=shorthand(s);
    	}
    	return removeVowels(s);
    }
    
    /**
     * Removes the vowels from a String
     * @param s Input String
     * @return String with its vowels removed
     */
    private static String removeVowels(String s){
    	if(s.toLowerCase().indexOf("a")>=0){
    		s=s.substring(0, s.toLowerCase().indexOf("a"))+s.substring(s.toLowerCase().indexOf("a")+1);
    		s=removeVowels(s);
    	}else if(s.toLowerCase().indexOf("e")>=0){
    		s=s.substring(0, s.toLowerCase().indexOf("e"))+s.substring(s.toLowerCase().indexOf("e")+1);
    		s=removeVowels(s);
    	}else if(s.toLowerCase().indexOf("i")>=0){
    		s=s.substring(0, s.toLowerCase().indexOf("i"))+s.substring(s.toLowerCase().indexOf("i")+1);
    		s=removeVowels(s);
    	}else if(s.toLowerCase().indexOf("o")>=0){
    		s=s.substring(0, s.toLowerCase().indexOf("o"))+s.substring(s.toLowerCase().indexOf("o")+1);
    		s=removeVowels(s);
    	}else if(s.toLowerCase().indexOf("u")>=0){
    		s=s.substring(0, s.toLowerCase().indexOf("u"))+s.substring(s.toLowerCase().indexOf("u")+1);
    		s=removeVowels(s);
    	}
    	return s;
    }
   
}


