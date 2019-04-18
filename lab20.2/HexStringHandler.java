/**
 * Last Name: Kazmi 
 * First Name: Ali 
 * Student ID: 12106808
 * Period: 2
 * Implements the StringParser interface to parse
 * a string that contains a hex number into its
 * decimal equivalent
 * Implements the Validator interface to determine
 * validity of the string
 */
//Your code goes here
/**
 * this is the class that handles hex 
 * */
public class HexStringHandler implements StringHandler,Validator{
   boolean validHex;
   int decimalValue; 
   
   /**
    * default const. 
    * */ 
   public HexStringHandler(){
      validHex=true;
      decimalValue=0; 
   }
    /**
    * @return boolean that says if it is valid hex 
    * */ 
   public boolean isValid(){
      return validHex;
   }
   
    /**
    * @param c is the char to process
    * */ 
   public void processLetter(char c){
      if(c>=65&&c<=70){
         decimalValue=16*decimalValue+(c-55); 
      }
      else{
         validHex=false; 
      }
   }
   /**
    * @param c is the char to process
    * */ 
   public void processDigit(char c){
     decimalValue=16*decimalValue+(c-48);
   }
   
   /**
    * @param c is the char to process
    * */ 
   public void processOther(char c){
      validHex=false; 
   }
   /**
    * @return int the decimal value 
    * */ 
   public int getDecimalValue(){
      if(validHex){
         return decimalValue; 
      }
      else{
         return -1; 
      }
      }
}

