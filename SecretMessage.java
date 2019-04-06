/**
 * @Name Ali Kazmi 
 * period #2
 */
import java.io.File;
import java.util.Scanner;

/**
 * this decodes the message
 * */ 
public class SecretMessage {
	private char[][] message;
	private char[][] cover;
	private final int maxColumns = 80;
	private int startRow;
	private int startCol;
	//Do not add any other instance variables
	
	/**
	 * Constructor to read the plain text messages and the cover 
	 * messages from the given file.
	 * Calls getSecretMessage to reveal the secret message from under
	 * the cover. Then prints the secret message 
	 * @param fname - file name
	 */
	public SecretMessage(String fname){
		//Your code goes here
		Scanner sc; 
		try{
		   sc=new Scanner(new File(fname));
		   int t=sc.nextInt(); //the number of texts to do
		   for(int i=0; i<t; i++){
		   int m=sc.nextInt();// number of lines in the message 
		   message=new char[m][maxColumns]; //create matrix
		   // read in the message into the matrix 
		   
		   for(int rows=0; rows<m+1; rows++){
		      String s=sc.nextLine(); 
		      for(int col=0; col<maxColumns; col++){
		         if(col<s.length()){
		            message[rows-1][col]=s.charAt(col);
		           // System.out.print("loop executed");(it executed)
		           // System.out.print(message[rows-1][col]);
		         } 
		      } //System.out.println(); 
		   }
		   //now the messages matrix is complete, as checked above 
		   //make the cover message 
		   
		   startRow=sc.nextInt(); 
		   startCol=sc.nextInt(); 
		   int numlines=sc.nextInt(); 
		   cover=new char[numlines][maxColumns];
		    for(int row=0; row<numlines+1; row++){
		      String s=sc.nextLine(); 
		      for(int cols=0; cols<maxColumns; cols++){
		         if(cols<s.length()){
		            cover[row-1][cols]=s.charAt(cols);
		           // System.out.print("loop executed");(it executed)
		           //System.out.print(cover[row-1][cols]);
		         } 
		      } //System.out.println(); 
		   }
		   System.out.println(getSecretMessage()); 
		  //System.out.println("the second char of the cover is: "+ cover[0][1]);
		   // above the cover matrix is created :) 
		   }
		}
		catch(Exception e){
		   System.out.println(e.getMessage());
		}
		
	}
	/**
	 * Method that extracts the secret message from under the cover
	 * cover is placed at startRow and startCol. If the element in cover
	 * is 'O', the corresponding letter in the message is extracted
	 * @return the secret message
	 */
	public String getSecretMessage(){
		//Your code goes here
		String secret="";
		for(int i=0; i<cover.length; i++){
		   for(int g=0; g<cover[i].length; g++){
		      if(cover[i][g]=='O'){
		         secret+=message[startRow+i][startCol+g];
		      }
		   }
		}
		// iterate through the ---00--- matrix, and if it is O then add the 
		//value to a string that I return 
		return secret;
	}
}

