
	/** 
	 * class: Taxes- This class demonstrates the construction of a class
	 * including constructors, methods, and instance variables 
	 * @author KazmiAli6808
	 * @version 1.1
	 */

public class Taxes {
	/**
	 * holds the hours worked 
	 *///declare instance variables
	private double hoursWorked; 
	/** 
	 * holds the hourly rate
	 */
	private double hourlyRate;
	//Your code goes here

	//declare constants
final double FEDERAL_TAX_RATE=0.15;
final double FICA_RATE=0.0765;
final double STATE_TAX_RATE=0.04;


	/** 
		 * @param hours done
		 * @param rate of payment
		 * This constructs an object when used that can then perform the calculations using the other methods 
		 */
public Taxes(double hours, double rate)
	{
		hoursWorked=hours;
		hourlyRate=rate;
		//Your code goes here

	}// end constructor
	
		/**
		 * this returns the hours worked (its an accessor method) 
		 * @return hoursWorked
		 */
	public double getHoursWorked()
	{
		
		return hoursWorked;
		//Your code goes here
	}// end method
	
	/** 
	 * returns the hourly rate. This is an accessor method 
	 * @return hourlyRate
	 */
	public double getHourlyRate()
	{
		return hourlyRate;
		//Your code goes here
	}// end method
	
	/**
	 * accessor method that returns the federal tax rate
	 * @return FEDERAL_TAX_RATE
	 */
	public double getFedTaxRate()
	{
		return FEDERAL_TAX_RATE;
		//Your code goes here

	}// end method
		
	/**
	 * accessor method that returns the social security tax rate
	 * @return FICA_RATE
	 */
	public double getSocSecurityRate()
	{
		//Your code goes here (still need to make a method to calc this) 
		return FICA_RATE;
	}// end method
		
	/**
	 * accessor method that returns the state tax rate
	 * @return STATE_TAX_RATE
	 */
	public double getStateTaxRate()
	{
		return STATE_TAX_RATE;
		//Your code goes here

	}// end method
	
	/**
	 * method that computes the gross pay
	 * @return grossPay
	 */
	public double computeGrossPay()
	{
		double grossPay;
		grossPay=hoursWorked*hourlyRate;
		return grossPay;
		//Your code goes here

	}// end method
	
	/**
	 * method that computes the federal tax on the amount of money made
	 * @return Fed tax amount
	 */
	public double computeFedTax()
	{
		double x=computeGrossPay();
		return FEDERAL_TAX_RATE*x;
	}//end method
	
	/**
	 * method that computes the social security on the amount of money made
	 * @return social security amount
	 */
	public double computeSocSecurity()
	{
		double x=computeGrossPay();
		return FICA_RATE*x;
		//Your code goes here
	
	}//end method
	
	/**
	 * method that computes the state tax on the given incomes for that object
	 * @return state tax amount
	 */
	public double computeStateTax()
	{
		double x=computeGrossPay();
		return STATE_TAX_RATE*x;
		//Your code goes here

	}//end method
	
	/**
	 * method that computes the total tax
	 * @return total tax amount 
	 */
	private double computeTotalTax()
	{
		double x=computeGrossPay();
		double totalTax=0;
		totalTax=totalTax+computeStateTax();
		totalTax=totalTax+computeFedTax();
		totalTax=totalTax+computeSocSecurity();
		//Your code goes here
		return totalTax;
	}//end method
	
	/**
	 * method that computes the net pay
	 * @return net pay
	 */
	public double computeNetPay()
	{
		double x=computeGrossPay();
		double y=computeTotalTax();
		return x-y;
		//Your code goes here

	}//end method
	
}

