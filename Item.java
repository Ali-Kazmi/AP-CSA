/**
 * 
 * @author last name: Kazmi 
 * first name: Ali 
 * student ID: 12106808
 * period #2
 */
 
public class Item{
  //YOur code goes here
  int id; 
  int inv; 
  
  /**
   * makes an item as a default item
   * */ 
  public Item(){
     id=0;
     inv=0; 
  }
  
  /**
   * makes an item with passed in values 
   * @param idval is the id value to pass in 
   * @param invval is the inventory value to pass in 
   * */ 
  public Item(int idval, int invval){
     id=idval; 
     inv=invval; 
  }
  
  
  /**
   * returns the id of this item 
   * @return id of the item
   * */
  public int getId(){
     return id;
  }
  
  /**
   * returns the inventory of this item
   * @return the inventory of the item 
   * */
  public int getInv(){
     return inv; 
  }
  
  /**
   * compares 2 items  
   * @param i to compare with
   * @return an int signalling which one is bigger
   * */
  public int compareTo(Item i){
    return getId()-i.getId();
  }
  
  /**
   * checks if this item is equal to a passed in item  
   * @return if the items are equal or not 
   * @param other to compare
   * */
  public boolean equals(Item other){
        if(compareTo(other) == 0){
            return true;
        }
        else{
            return false;
        }
    } 

  
  /**
   *makes this item into a string 
   * @return that string 
   */
  public String toString(){
     String s="";
     s+=id+" "+inv; 
     return s; 
  }
  
}
