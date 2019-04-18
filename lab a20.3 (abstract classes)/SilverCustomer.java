/**
 * Last name: Kazmi 
 * First name: Ali 
 * Student ID: 12106808
 * Period 2
 */
public class SilverCustomer extends Customer {
	final double serviceDiscountRate = 0.10;
	//Do not add any more fields
	//Add your methods along with documentation here
	/**
	 * Creates Silver customer with name, silver member type, service discount rate
	 * @param n name
	 */
    public SilverCustomer(String n){
        super(n);
        memberType="Silver";
        super.serviceDiscountRate=this.serviceDiscountRate; 
    }
	
}