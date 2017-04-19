/**
*@author Tyler Drinkard
*@version 4/19/17
*/
public class Division
{
   /**
   *@return the value.
   *@param numerator (not used).
   *@param denominator (not used).
   */
   public static int intDivide(int numerator, int denominator)
   {
      try {
         return numerator / denominator;
      }
      catch (ArithmeticException error) {
         return 0;
      }
   }
   
   
   /**
   *@return the decimal value
   *@param numerator (not used).
   *@param denom (not used).
   */
   public static double decimalDivide(int numerator, int denom)
   {
      if (denom == 0)
      {
         throw new IllegalArgumentException("The denominator "
            + "cannot be zero.");
      }
      return ((double) numerator / denom);
       
   }
}