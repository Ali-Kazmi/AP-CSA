/**
 * @author Ali Kazmi
 * period #2
 */
import java.util.Scanner;

public class Roots {
	/**
	 * calculate the roots of quadratic equations
	 */
	 private double a;
	private double b;
	private double c;
	private double a2;
	private double b2;
	private double c2;
	private double a3;
	private double b3;
	private double c3;
	private double root1eq1;
	private double root2eq1;
	private double root1eq2;
	private double root2eq2;
	private double root1eq3;
	private double root2eq3;
	
	public void calculate() 
	{
		//your code goes here
System.out.print("Enter the coefficients a b and c for equation 1: ");
		Scanner myScan=new Scanner(System.in);
		a=myScan.nextDouble();
		b=myScan.nextDouble();
		c=myScan.nextDouble();
		System.out.print("Enter the coefficients a b and c for equation 2: ");
		a2=myScan.nextDouble();
		b2=myScan.nextDouble();
		c2=myScan.nextDouble();
		System.out.print("Enter the coefficients a b and c for equation 3: ");
		a3=myScan.nextDouble();
		b3=myScan.nextDouble();
		c3=myScan.nextDouble();
		// here 
		System.out.printf("%10s"," ");
		System.out.printf("%10s","a:");
		System.out.printf("%10s","b:");
		System.out.printf("%10s","c:");
		System.out.printf("%10s", "root1:");
		System.out.printf("%10s", "root2:");
		root1eq1=((-b+Math.sqrt(b*b-4*a*c))/(2*a));
		root2eq1=((-b-Math.sqrt(b*b-4*a*c))/(2*a));
		root1eq2=((-b2+Math.sqrt(b2*b2-4*a2*c2))/(2*a2));
		root2eq2=((-b2-Math.sqrt(b2*b2-4*a2*c2))/(2*a2));
		root1eq3=((-b3+Math.sqrt(b3*b3-4*a3*c3))/(2*a3));
		root2eq3=((-b3-Math.sqrt(b3*b3-4*a3*c3))/(2*a3));
		System.out.printf("\n%10s","#1");
		// after this make the column values for this row. Then 
		// do the same for the next 2. then this should be done
		System.out.printf("%10.2f",a);
		System.out.printf("%10.2f",b);
		System.out.printf("%10.2f",c);
		System.out.printf("%10.2f",root1eq1);
		System.out.printf("%10.2f",root2eq1);
		
		System.out.printf("\n%10s","#2");
		System.out.printf("%10.2f",a2);
		System.out.printf("%10.2f",b2);
		System.out.printf("%10.2f",c2);
		System.out.printf("%10.2f",root1eq2);
		System.out.printf("%10.2f",root2eq2);
		
		System.out.printf("\n%10s","#3");
		System.out.printf("%10.2f",a3);
		System.out.printf("%10.2f",b3);
		System.out.printf("%10.2f",c3);
		System.out.printf("%10.2f",root1eq3);
		System.out.printf("%10.2f\n",root2eq3);

	}
}