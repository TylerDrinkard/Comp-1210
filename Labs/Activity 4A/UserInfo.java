/**
* Creates and test UserInfo class.
*
* @author Tyler Drinkard
* @version 2/4/2017
*/
public class UserInfo
{
// instance variables
   private String firstName;
   private String lastName;
   private String location;
   private int age;
   private int status;
   private static final int OFFLINE = 0, ONLINE = 1;
   // constructor
   /**
   *Creates contructors.
   *
   *@param firstNameIn (not used). 
   *@param lastNameIn (not used).
   */
   public UserInfo(String firstNameIn, String lastNameIn)
   {
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not Specified";
      age = 0;
      status = OFFLINE;
   }
   // methods
   /**
   *Creates methods.
   *
   *@return args Command line (not used).
   */
   public String toString() {
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE) {
         output += "Offline";
      } 
      else {
         output += "Online";
      }
      return output;
   }
   /**
   *Creates location.
   *
   *@param locationIn (not used).
   */
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   /**
   *Creates age.
   *
   *@return ageIn (not used).
   *@param ageIn (not used).
   */
   public boolean setAge(int ageIn) {
      boolean isSet = false;
      if (ageIn > 0) {
         age = ageIn;
         isSet = true;
      }
      return isSet;
   }
   /**
   *Creates age.
   *
   *@return age (not used).
   */
   public int getAge() {
      return age;
   }
   /**
   *Creates location.
   *
   *@return location (not used).
   */
   public String getLocation()
   {
      return location;
   }
   /**
   *Creates statusOFF.
   *
   *@param status.
   */
   public void logOff() {
      status = OFFLINE;
   }
   /**
   *Creates statusON.
   *
   *@param status.
   */
   public void logOn() {
      status = ONLINE;
   }
}