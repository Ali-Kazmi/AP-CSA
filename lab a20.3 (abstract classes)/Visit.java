import java.util.Date;
/**
 * Last name: Kazmi 
 * First name: Ali 
 * Student ID: 12106808
 * Period 2
 */
public class Visit {
	private Customer customer;
	private Date date;
	private double serviceExpense;//expense after discount
	private double productExpense;//expense after discount
	//Do not add any more fields
	//Add your methods along with documentation here
	/**
	 * paramater constructor for a visit 
	 * @param c customer
	 * @param d date of visit
	 * @param sExpense service expense before discount
	 * @param pExpense product expense before discount
	 */
	public Visit(Customer c, Date d, double sExpense, double pExpense){
		customer=c;
		date=d;
		serviceExpense=sExpense*(1-customer.getServiceDiscountRate());
		productExpense=pExpense*(1-customer.getProductDiscountRate());
	}
	
	/**
	 * @param s the service expense before discount
	 */
	public void setServiceExpense(double s){
		serviceExpense=s*(1-customer.getServiceDiscountRate());
	}
	
	/**
	 * @return service expense after discount
	 */
	public double getServiceExpense(){
		return serviceExpense;
	}
	
	/**
	 * @param pExpense product expense before discount
	 */
	public void setProductExpense(double pExpense){
		productExpense=pExpense*(1-customer.getProductDiscountRate());
	}
	
	/**
	 * @return product expense after discount
	 */
	public double getProductExpense(){
		return productExpense;
	}
	
	/**
	 * @return total expense after discounts
	 */
	public double getTotalExpense(){
		return serviceExpense+productExpense;
	}
	
	/**
	 * @return String of the visit
	 */
	public String toString(){
		String temp="Date: "+date.toString()+"\n";
		//below is the string to print it the way codecheck wants 
		temp+="Invoice for customer: "+customer.getName();
		temp+="\nMembership type: "+customer.getMemberType();
		temp+=String.format("\nService charge (with %.1f%% discount): $%.2f",customer.getServiceDiscountRate()*100,serviceExpense);
		temp+=String.format("\nProduct charge (with %.1f%% discount): $%.2f\n",customer.getProductDiscountRate()*100,productExpense);
		temp+=String.format("Total: $%.2f\n",getTotalExpense());
		return temp;
	}
}