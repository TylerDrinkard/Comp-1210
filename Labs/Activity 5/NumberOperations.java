   /**
 * Demonstrates the NumberOperations class.
 *
 *@author Tyler Drinkard
 *@version 2/19/17
 */
public class NumberOperations
{
   private int number;
      
   /**
   *
   *@param numberIn (not used).
   */
   public NumberOperations(int numberIn)
   {
      number = numberIn;
   }
   /**
   *
   *@return number
   */  
   public int getValue()
   {
      
      return number;
      
   }
   /**
   *
   *@return output
   */ 
   public String oddsUnder()
   {
      String output = "";
      int i = 0;
      while (i < number)
      {
      
         if (i % 2 != 0)
         {
            output += i + "\t";
         }
      
         i++;
      }
      
      return output;
   }
   /**
   *
   *@return output
   */
   public String powersTwoUnder()
   {
      String output = "";
      int powers = 1;
      while (powers < number) {
         output += powers + "\t";
         powers = powers * 2;
      }
      return output;
   }
   /**
   *
   *@return compareNumber (not used).
   *@param compareNumber (not used).1
   */
   public int isGreater(int compareNumber)
   {
      if (number > compareNumber) {
         return 1;
      }
      else if (number < compareNumber) {
         return -1;
      }
      else {
         return 0;
      }
   }
   /**
   *
   *@return number
   */
   public String toString()
   {
      return number + "";
   }
   
   
   
}