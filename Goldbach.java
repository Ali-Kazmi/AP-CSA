/**
 * Computes all primes less than N and tries to express N as a sum of two
 * primes. Goldbach's conjecture says that this is always possible if N is even
 * and greater than 2. When N is odd, these are called prime pairs.
 * 
 * @author Ali kazmi 
 
 *  period ##2
 */
public class Goldbach {
	private Eratosthenes e;
	private final int N;
	private int[] list;

	/**
	 * Constructor creates the list of primes using the class Eratosthenes and
	 * initializes N to the passed in value of n
	 * 
	 * @param n
	 *            - number to be written as a sum of two primes
	 */
	public Goldbach(int n){
		N=n;
		e=new Eratosthenes(n);
		list=e.listOfPrimes();
	}

	/**
	 * Returns a string that includes all the prime pairs that add up to N
	 * 
	 * @return string with the all the prime pairs that add up to N
	 */
	public String sumOfTwoPrimes(){
		int a=0,x=0;
		String s=N+" ";
		String temp="";
		for(int i=0;i<list.length;i++){
			for(; x<list.length;x++){
				if(list[i]+list[x]==N&&(list[i]!=0&&list[x]!=0)){
					if(i<=x){
						temp+=" = "+list[i]+" + "+list[x];
					}
					a++;
				}
			}
			x=0;
		}//ends the big for loop 
		s+=temp;
		if(a==0){
			s+=" not expressible as sum of two primes";
		}
		return s;
	}
}


