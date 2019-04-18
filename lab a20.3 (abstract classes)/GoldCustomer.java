/**
 * Last name: Kazmi 
 * First name: Ali 
 * Student ID: 12106808
 * Period 2
 */
public class GoldCustomer extends Customer {
	final double serviceDiscountRate = 0.15;
	//Do not add any more fields
	//Add your methods along with their documentation

	/**
	 * Creates gold customer with the name, gold member type, service discount rate
	 * @param n name of the customer
	 */
    public GoldCustomer(String n){
        super(n);
        memberType="Gold";
        super.serviceDiscountRate=this.serviceDiscountRate; 
    }

}