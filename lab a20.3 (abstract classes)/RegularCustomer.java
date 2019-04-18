/**
 * Last name: Kazmi 
 * First name: Ali 
 * Student ID: 12106808
 * Period 2
 */
public class RegularCustomer extends Customer {
	//Add your methods along with documentation here
	/**
	 * Creates regular customer with name, no member type, service discount rate
	 * @param n name 
	 */
    public RegularCustomer(String n){
        super(n);
        memberType="Not a member";
    }
	
}