/**
*
*
*/
public class Customer implements Comparable<Customer> {
   private String name;
   private String location;
   private double balance;

/**
*
*@param nameIn (not used).
*/
   public Customer(String nameIn) {
      name = nameIn;
      location = "";
      balance = 0;
   }

/**
*
*@return returns name.
*/
   public String getName() {
      return name;
   }

/**
*
*@param locationIn (not used).
*/
   public void setLocation(String locationIn) {
      location = locationIn;
   }
 
/**
*
*@param amount (not used).
*/ 
   public void changeBalance(double amount) {
      balance += amount;
   }
   
/**
*
*@return returns location.
*/
   public String getLocation() {
      return location;
   }

/**
*
*@return returns balance.
*/
   public double getBalance() {
      return balance;
   }

/**
*@param state (not used).
*@param city (not used).
*/
   public void setLocation(String city, String state) {
      location = city + ", " + state;
   }

/**
*
*@return returns string.
*/
   public String toString() {
      return getName() + "\n" + getLocation() + "\n" + getBalance();
   }
   
/**
*@param obj (not used).
*@return returns obj.
*/
   public int compareTo(Customer obj) {
      if (Math.abs(this.balance - obj.getBalance()) < 0.000001) {
         return 0;
      } 
      else if (this.balance < obj.getBalance()) {
         return -1;
      } 
      else {
         return 1;
      }
   }
}