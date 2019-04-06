import java.util.Scanner;

/** Class to simulate the game of Tic Tac Toe
 * 
 * @author Ali Kazmi 
 * period #2
 *
 */
public class TicTacToe {
	private final int BOARD_SIZE = 9;
	private char[] board = new char[BOARD_SIZE];
	private char currentPlayer; 
	boolean occupied=false; 

	/** constructor to initialize the board to '-' and myPlayer to 'X'
	 * 
	 */
	public TicTacToe() {
		//Your code goes here
		for(int i=0; i<board.length; i++){
		   board[i]='-';
		}
	}
	/**
	 * Checks if the move location is not already occupied
	 * Returns true if it is not already occupied and false otherwise
	 * @param loc - move location where X or O is to be placed on the board
	 * @return true if the location is not already occupied by X or O,
	 * 		   false otherwise
	 */
	private boolean isOccupied(int loc) {
		//Your code goes here
		if(board[loc]=='-'){
		   return true; 
		}
		else{
		   occupied=true; 
		   return false; 
		}
	}
	
	/**
	 * Perform one move for the given player if the given location is
	 * unoccupied 
	 * @param player - current player (X or O)
	 * @param loc - move location where X or O is to be placed on the board
	 * @return true if the move is made, false otherwise
	 */
	private boolean move(char player, int loc) {
		//Your code goes here
		
		try{
		if(!(isOccupied(loc))){
		  // System.out.println("Player "+player+" enter a location to place "+ player+" : "+loc);
		   System.out.println("The location selected ("+loc+") is occupied.");
		   if(currentPlayer=='X'){
		      currentPlayer='O';
		   }
		   else{
		      currentPlayer='X';
		   }
		   return false; 
		}
		else{
		   //System.out.println("Player "+player+" enter a location to place "+ player+" : "+loc);
		   board[loc]=player; 
		   return true; 
		}
	}
	catch(Exception e){
	    if(currentPlayer=='X'){
		      currentPlayer='O';
		   }
		   else{
		      currentPlayer='X';
		   }
	   //System.out.println("Player "+player+" enter a location to place "+ player+" : "+loc);
	   System.out.println("Location selected ("+loc+") is not valid. Enter a number between 0 and 8 inclusive");
	   occupied=true; 
	}
	return false; 
	 
	}
	
	/**
	 * Returns '-' if there is a '-' found on the board and 't' otherwise
	 * @return '-' if '-' is found on the board, otherwise return 't' to 
	 * 			   indicate a tie
	 */
	private char tie() {
		//Your code goes here
		boolean b=false; 
		for(int i=0; i<board.length; i++){
		   if(board[i]=='-'){
		      b=true; 
		}
		}
		if(b){
		   return '-'; 
		}
		else{
		   return 't';
		}
	}

	/**
	 * Checks to see if the game is over. If the game is over, is there a winner. 
	 * If there is a winner, returns 'X' or 'O'.
	 * If the game is over but there is no winner returns 't' indicating a tie
	 * If the game is not over, returns a '-'
	 * @return 'X' or 'O' or '-' or 't'
	 */
	private char whoWon() {
		//Your code goes here
		if(xwon()==true){
   		return 'X';
		}
		if(owon()==true){
		   
		   return 'O';
		}
		if(tie()=='t'){
		   return 't';
		}
		else{
		   return '-';
		}
	}
	
	/** checks if x won
	 * @return the boolean that says if x won or not 
	 * */ 
	  public boolean xwon(){
	     if((board[0]=='X')&&((board[1]=='X')&&board[2]=='X')){
	        return true; 
	     }
	     else if((board[0]=='X')&&((board[3]=='X')&&board[6]=='X')){
	        return true; 
	     }
	     else if((board[0]=='X')&&((board[4]=='X')&&board[8]=='X')){
	        return true; 
	     }
	     else if((board[1]=='X')&&((board[4]=='X')&&board[7]=='X')){
	        return true; 
	     }
	     else if((board[2]=='X')&&((board[4]=='X')&&board[6]=='X')){
	        return true; 
	     }
	     else if((board[3]=='X')&&((board[4]=='X')&&board[5]=='X')){
	        return true; 
	     }
	     else if((board[5]=='X')&&((board[2]=='X')&&board[8]=='X')){
	        return true; 
	     }
	     else if((board[6]=='X')&&((board[7]=='X')&&board[8]=='X')){
	        return true; 
	     }
	     else{
	        return false; //put a bunch of else ifs above 
	     }
	  }
	  /** 
	   * checks if o won 
	   * @return the boolean if o won or not 
	   * */ 
	   public boolean owon(){
	       if((board[0]=='O')&&((board[1]=='O')&&board[2]=='O')){
	        return true; 
	     }
	     else if((board[0]=='O')&&((board[3]=='O')&&board[6]=='O')){
	        return true; 
	     }
	     else if((board[0]=='O')&&((board[4]=='O')&&board[8]=='O')){
	        return true; 
	     }
	     else if((board[1]=='O')&&((board[4]=='O')&&board[7]=='O')){
	        return true; 
	     }
	     else if((board[2]=='O')&&((board[4]=='O')&&board[6]=='O')){
	        return true; 
	     }
	     else if((board[3]=='O')&&((board[4]=='O')&&board[5]=='O')){
	        return true; 
	     }
	     else if((board[5]=='O')&&((board[2]=='O')&&board[8]=='O')){
	        return true; 
	     }
	     else if((board[6]=='O')&&((board[7]=='O')&&board[8]=='O')){
	        return true; 
	     }
	     else{
	        return false; //put a bunch of else ifs above 
	     }
	  }
	/**
	 * Prints the board as a 3x3 grid
	 */
	private void printBoard() {
		//Your code goes here
		int position=0; 
	   for(int i=0; i<3; i++){
	      for(int i2=0; i2<3; i2++){
	         System.out.print(board[position]+" ");
	         position++; 
	      }
	     System.out.println(); 
	   }
	}
	
	/**
	 * Determines whose turn it is. The first player is always X
	 * @param turnNumber - number of the turn
	 * @return - 'X' or 'O' based on whose turn it is
	 */
	private char determineCurrentPlayer(int turnNumber){
		//Your code goes here
		if(turnNumber%2==1){
		   return 'X';
		}
		else{
		   return 'O';
		}
	}
	
	/**
	 * Plays the game of tic tac toe till the game is over
	 */
	public void playGame() {
		//Your code goes here
		Scanner sc=new Scanner(System.in);
		boolean xwins=false; 
		boolean owins=false; 
		boolean tiehappened=false; 
		currentPlayer='X';
		while((!(xwins))&&(!(owins||tiehappened))){
		   if(!occupied){
		      printBoard(); 
		   }
		   occupied=false; 
		   System.out.print("Player "+currentPlayer+" enter a location to place "+currentPlayer+" : ");
		   move(currentPlayer, sc.nextInt());
		   char c=whoWon(); 
		   if(c!='-'){
		      printBoard(); 
		   }
		   if(c=='X'){
		      System.out.println("Player X Won!");
		      xwins=true; 
		   }
		   if(c=='O'){
		      System.out.println("Player O Won!");
		      owins=true; 
		   }
		   if(c=='t'){
		      System.out.println("Its a tie!");
		     tiehappened=true;
		   }
		  if(currentPlayer=='X'){
		      currentPlayer='O';
		   }
		   else{
		      currentPlayer='X';
		   }
		}
}
}





