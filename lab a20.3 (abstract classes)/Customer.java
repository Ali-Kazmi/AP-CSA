/**
 * Last name: Kazmi 
 * First name: Ali 
 * Student ID: 12106808
 * Period 2
 */
public abstract class Customer {
	private String name;
	protected boolean member;
	protected String memberType = "";
	private final double PRODUCT_DISCOUNT_RATE = 0.1;
	protected double serviceDiscountRate;
	//Do not add any more fields
	//Add all your methods along with their documentation here
	/**
     * paramater constructor that makes a customer 
     * @param n name
     */
    public Customer(String n){
        name=n;
    }
    
    /**
     * @return name of the customer
     */
    public String getName(){
        return name;
    }
    
    /**
     * @return if the customer is a member
     */
    public boolean isMember(){
        return member;
    }
    
    /**
     * @param b whetherif the customer is a member
     */
    public void setMember(boolean b){
        member=b;
    }
    
    /**
     * @return the member type
     */
    public String getMemberType(){
        return memberType;
    }
    
    /**
     * Sets member type
     * @param t member type
     */
    public void setMemberType(String t){
        memberType=t;
    }
    
    /**
     * @return product discount rate
     */
    public double getProductDiscountRate(){
        return PRODUCT_DISCOUNT_RATE;
    }
    
    /**
     * @param price the price of one product
     * @return amount discounted
     */
    public double getProductDiscount(double price){
        return price*PRODUCT_DISCOUNT_RATE;
    }
    
    /**
     * @return service discount rate
     */
    public double getServiceDiscountRate(){
        return serviceDiscountRate;
    }
    /**
     * @param price price of the service
     * @return amount discounted from the service
     */
    public double getServiceDiscount(double price){
        return price*serviceDiscountRate;
    }
    
    /**
     * @return String that is the customer's data 
     */
    public String toString(){
    	String temp="customer: "+name;
    	temp+="\nMembership type: "+memberType+"\n";
    	return temp;
    }
}