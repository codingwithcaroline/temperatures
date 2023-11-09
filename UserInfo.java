/**
*Provides user info.
*for a specific person.
*
*@author Caroline Kirkconnell
*@version 2/3/2020
*/
public class UserInfo {
   //instance variables
   private String firstName = "";
   private String lastName = "";
   private String location = "";
   private int age = 0;
   private int status = 0;
   private static final int OFFLINE = 0, ONLINE = 1;
   //constructor
   /**
   *@param firstNameIn - unused
   *@param lastNameIn - unused
   */
   public UserInfo(String firstNameIn, String lastNameIn) {
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   }
   //methods
   /**
   *@return - used
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
   //sets the location and age of user
   //and changes the status.
   /**
   *@param locationIn - used
   *
   */
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   //changes age if age is greater than 0, and
   //returns a boolean value (true or false) 
   //whether the age was set.
   /**
   *@param ageIn - used
   *@return isSet - used
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
   *@return age - used
   */
   public int getAge() {
      return age;
   }
   /**
   *
   *@return location - used
   */
   public String getLocation() {
      return location;
   }
   /**
   *this is for logoff.
   */
   public void logOff() {
      status = OFFLINE;
   }
   /**
   *this is for logon.
   */
   public void logOn() {
      status = ONLINE;
   }
   
}