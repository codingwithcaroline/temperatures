import java.util.ArrayList;
/**
*This program holds a set.
*of integer values representing
*daily temperatures.
*@author Caroline Kirkconnell
*@version 2/17/2020
*/
public class Temperatures {
   private ArrayList<Integer> temperatures;
   
/**
*Takes an ArrayList of integer values.
*@param temperaturesIn - used.
*/
   public Temperatures(ArrayList<Integer> temperaturesIn) {
      temperatures = temperaturesIn;
   }

/**
*Returns 0 if ArrayList isEmpty.
*Iterates through entire list and
*locates lowest temperature.
*Returns lowest temperature.
*@return - used.
*/
   public int getLowTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int low = temperatures.get(0);
      for (int i = 1; i < temperatures.size(); i++) {
         if (temperatures.get(i) < low) {
            low = temperatures.get(i);
         }
      }
      return low;
   }

/**
*Returns 0 if ArrayList isEmpty.
*Iterates through entire list and
*locates highest temperature.
*Returns highest temperature.
*@return - used.
*/
   public int getHighTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int high = temperatures.get(0);
      for (Integer temp : temperatures) {
         if (temp > high) {
            high = temp;
         }
      }
      return high;
   } 
/**
*Returns a string containing.
*the low and high temperatures.
*@return - used.
*/
   public String toString() {
      return "\tTemperatures: " + temperatures
         + "\n\tLow: " + getLowTemp()
         + "\n\tHigh: " + getHighTemp();
   }

/**
*Takes an int value and returns.
*the parameter if it is lower than the
*value returned by getLowTemp. Otherwise,
*it returns the return of getLowTemp.
*@return - used.
*@param lowIn - used.
*/
   public int lowerMinimum(int lowIn) {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }

/**
*Takes an int value and returns.
*the parameter if it is greater than the
*value returned by getHighTemp. Otherwise,
*it returns the return of getHighTemp.
*@return - used.
*@param highIn - used.
*/
   public int higherMaximum(int highIn) {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }
}
