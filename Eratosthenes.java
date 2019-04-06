/**
 * Determines the primes less than or equal to n using the 
 * Sieve of Eratosthenes
 * @author Ali Kazmi 
 * period  ##2
 *
 */
public class Eratosthenes {
	//Your fields go here
	private int[] myarray; 
	private int mycountofprimes; 
	private int N; 
	private int[] primeslist; 
	/**
	 * Constructor to initialize array of primes using the Sieve of Eratosthenes
	 * @param n - all primes are less than or equal to n
	 */
	public Eratosthenes (int n){
		myarray=new int[n+1];
		N=n; 
		for(int i=0; i<myarray.length; i++){
		   myarray[i]=i;
		}
		//above set up the array. Below I am going to be doing the sieve
		//to do the sieve i set the values that arent prime to -1 
		myarray[1]=-1; 
		int numsieves=50; 
		while(numsieves>1){ //1
		   for(int i=0; i<myarray.length; i++){
		       if((myarray[i]%numsieves==0)&&(myarray[i]!=numsieves)){
		         myarray[i]=-1;   
		       }
	      	}
		   numsieves--; 
		}
		myarray[2]=2; 
	}
	
	/** Count the number of primes
	 * @return number of primes less than or equal to n
	 */
	public int countPrimes()
	{
		//Your code goes here
		
		for(int i=0; i<myarray.length; i++){
		   if(myarray[i]!=-1){
		      mycountofprimes++; 
		      //System.out.println("entered loop");
		   }
		}
		int pos=0; 
		primeslist=new int[mycountofprimes];
		for(int i=0; i<myarray.length; i++){
		   if(myarray[i]!=-1){
		      primeslist[pos]=myarray[i]; 
		      pos++; 
		      //System.out.println("entered loop");
		   }
		}
		return mycountofprimes; 
	}
	/**
	 * returns a list of primes less than or equal to n
	 * @return a list of primes 
	 */
	public int[] listOfPrimes(){
		//Your code goes here
		/*
		int[] temp=new int[mycountofprimes];
		int posinmyarray=0; 	
			for(int i=0; i<temp.length; i++){
		      while(myarray[posinmyarray]==-1){
		         posinmyarray++; 
		    }
		    temp[i]=myarray[posinmyarray];
		    
		}
		
		return temp; 
		*/ return myarray; 
	}
	/**
	 * Returns a string containing the prime numbers and the number of prime numbers
	 * in the list
	 * @return the string 
	 */
	public String toString()
	{
		//Your code goes here
		countPrimes(); 
		String s="";
		for(int i=0; i<myarray.length; i++){
		   if(myarray[i]!=-1){
		      s+=myarray[i]+" ";
		   }
		      
		   }
		// first, add all the primes on a line 
		// then do a next line and say what is below 
		s+=("\nNumber of primes less than or equal to "+N+" = "+mycountofprimes);
		return s; 
	}
}


