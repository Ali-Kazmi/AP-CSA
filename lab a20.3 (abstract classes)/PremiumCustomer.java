/**
 * Last name: Kazmi 
 * First name: Ali 
 * Student ID: 12106808
 * Period 2
 */
public class PremiumCustomer extends Customer {
	final double serviceDiscountRate = 0.2;
	//Do not add any more fields
	//Add your methods along with documentation here
	
	/**
	 * Creates premium customer with name, premium member type, service discount rate
	 * @param n name 
	 */
    public PremiumCustomer(String n){
        super(n);
        memberType="Premium";
        super.member=true; 
        super.serviceDiscountRate=this.serviceDiscountRate; 
    }
}