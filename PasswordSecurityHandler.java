/**
 * Last name:Kazmi 
 * First name:Ali 
 * Student ID:12106808
 * Period:2
 * Implements methods of the StringHandler interface to parse a String
 * containing a password
 *
 */
//Your code goes here
/**
 * the class to handle passwords
 * */ 
public class PasswordSecurityHandler implements StringHandler{
   int length; 
   boolean otherCharacter; 
   boolean digit;
   
   /**
    * this is the default constructor 
    * */ 
   public PasswordSecurityHandler(){
      length=0; 
      otherCharacter=false; 
      digit=false; 
   }
   
  // public PasswordSecurityHandler(String s){
 //     length=s.length(); 
   //   otherCharacter=false;
   //   digit=false; 
  // }
   /**
    * @param c is the char to process
    * */ 
   public void processLetter(char c){
      length++; 
   }
   /**
    * @param c is the char to process
    * */ 
   public void processDigit(char c){
      length++;
      digit=true; 
   }
   /**
    * @param c is the char to process
    * */ 
   public void processOther(char c){
      length++; 
      otherCharacter=true; 
   }
   /**
    * @return String that is the security level 
    * */ 
   public String securityLevel(){
      if(length<6){
         return "weak";
      }
      else{
         if(otherCharacter&&digit){
            return "strong";
         }
         else{
            return "medium";
         }
      }
   }
}

