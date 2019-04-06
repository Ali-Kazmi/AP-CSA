
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
public class StringUtil2 
{	//Declare instance variables here
	private static String s="";
	private static int counter;
	private static int counter2; 
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
    
    /** 
  	  * Converts a string to it piglatin form according to the following rules:
  	  * a. If there are no vowels in englishWord, then pigLatinWord is just
  	  * englishWord + "ay". (There are ten vowels: 'a', 'e', 'i', 'o',
  	  * and 'u', and their uppercase counterparts.)
  	  * b. Else, if englishWord begins with a vowel, then pigLatinWord is just
  	  * englishWord + "yay".
  	  * c. Otherwise (if englishWord has a vowel in it and yet doesn't start
  	  * with a vowel), then pigLatinWord is end + start + "ay", where end
  	  * and start are defined as follows:
  	  * 1. Let start be all of englishWord up to (but not including) its
  	  * first vowel.
  	  * 2. Let end be all of englishWord from its first vowel on.
  	  * 3. But, if englishWord is capitalized, then capitalize end and
  	  * "uncapitalize" start.
  	  *
  	  * @param text is the string to be converted 
  	  @return piglatin version of text as a String 
  	  */
  	  public static String phraseToPigLatin(String text) 
  	  {
  		  counter=0;
  		  counter2=0; 
  		  int Switch=0; 
  		  String wordpostpig; 
    		 String word; //Your code goes here
      		 while(counter<text.length()-1){
      			 while((text.charAt(counter2)!=' ')&&(counter2<text.length()-1)&&text.charAt(counter2)!=','){
            				 if(text.charAt(counter2)==','){
      				    s+=",";
      				    counter2++;
      				    counter++;
      				    Switch=1; 
      				 }
      				 counter2++; 

      			 }
      		    word=text.substring(counter, counter2);
      		  // System.out.println("word before pig ="+word);
      		    wordpostpig=wordToPigLatin(word); 
      		  //  System.out.println("word after: "+wordpostpig);
      		  if(Switch==1){
      		     s+=",";
      		  }
      		  Switch=0; 
      		    s+=wordpostpig+" "; 	
      		 //   System.out.print("counter is "+counter+"counter 2: "+counter2); 
      		 if(counter2==text.length()){
      			 return s; 
      		 }
      		 counter2++; 
      		 counter=counter2; 
  	  }  
  	  String temp=s; 
  	  s="";
  	  return temp; 
  	  // this method was broken in handling the commas.
  	  }
  	  
      /** 
  	   * @param s is the string it converts to pig latin  
  	   * @return string that is converted 
  	   * */ 
  	  public static String wordToPigLatin(String s){
  		  
  		  String pig="";
  		  if(hasVowels(s)){
  			  //check if it begins with a vowel  and acts appropriately based on cases below  
  			  if(isVowel(s.charAt(0))){
  				  pig=s+"yay"; //case of having vowel and starting upper case 
  			  }
  			  else{
  				  //the case where it has vowel that isn't first 
  				  //do part c here (just annoying code lol) 
  				  String end; 
  				  String start; 
  				  int x=indexOfFirstVowel(s);
  				  start=s.substring(0,x);
  				  end=s.substring(x, s.length());
  			if(isCapitalized(s.charAt(0))){
  			  // s=s.substring(0,1).toUpperCase()+s.substring(1);
  				// capitalize end and uncapitalize start urp 
  	  			// make sure to work with the pig string here (see Hasta example in exs) 
  	  		  }

  				  pig=end+start+"ay";
  			  }
  		  }
  		  else{
  			  pig=s+"ay";
  			  // the no vowel case 
  		  } 		  
  		  return pig;
  		  // this method was broken in 2 placees. One was the capitalization, the other was the word baby (the wrong start/end)
  	  }
  	  
  	  /** 
  	   * @param s is the string it searches 
  	   * @return boolean that says if it is has vowels 
  	   * */ 
  	  public static boolean hasVowels (String s){
  		  int index=0; 
  		  while(index<s.length()){
  			  if(isVowel(s.charAt(index))){
  				  return true; 
  			  }
  			  index++; 
  		  }
  		  return false; 
  	  }
  	  
  	  /** 
  	   * @param s is the string it searches to find first vowel  
  	   * @return int index of first vowel 
  	   * */ 
  	  public static int indexOfFirstVowel(String s){
  		  int i=0; 
  		  int index=0;
  		  int counter=0; 
  		  while(i!=s.length()){
  			  if(isVowel(s.charAt(i))&&counter!=1){
  				  index=i; 
  				  counter=1; 
  			  }
  			  i++; 
  		  }
  		  return index; 
  	  }
  	  
  	  /** 
  	   * @param s is the character it chesks is vowel 
  	   * @return boolean that says if it is vowel
  	   * */ 
  	  public static boolean isVowel(char s){
  		  if(s=='a'||s=='e'||s=='i'||s=='o'||s=='u'){;
  		  return true;
  		   		  }
  		  else{
  			  return false; 
  		  }
  	  }
  	  
  	  /** 
  	   * @param s is the character it chesks is capitalized 
  	   * @return boolean that says if it is capitalized 
  	   * */ 
  	  public static boolean isCapitalized(char s){
  		  if(s>'a'&&s<'z'){
  			  return false; 
  		  }
  		  else{
  			  return true;
  		  }
  		  
  	  }
}










