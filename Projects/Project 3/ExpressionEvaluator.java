import java.util.Scanner;
import java.text.DecimalFormat;
/**
* This program calculates and evaluates an expression.
* 
* 
* @author Tyler Drinkard
* @version 2/1/2017
*/
public class ExpressionEvaluator
{
/**
* This method calculates and evaluates and expression.
*
* @param args Command line (not used).
*/
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      //declare variables
      double x;
      double result;
      String numbers;
      int numbersLeft;
      int numbersRight;
      // prompt user for x
      System.out.print("Enter a value for x: ");
      x = userInput.nextDouble();
      // calculate and print result
      result = (Math.pow(((3 * Math.pow(x, 5)) - (2 * Math.pow(x, 3))), 2)) 
         / (Math.sqrt(Math.abs(16 * Math.pow(x, 7))) + 1);
      System.out.println("Result: " + result);
      // calculate number in front of decimal
      numbers = Double.toString(result);
      int index = numbers.indexOf('.');
      String numberL = numbers.substring(0, index);
      String numberR = numbers.substring(index + 1, numbers.length());
      numbersLeft = numberL.length();
      numbersRight = numberR.length();
      DecimalFormat fmt1 = new DecimalFormat("##,##0.0####");
      System.out.println("# digits to left of decimal point: " 
         + numbersLeft);
      // calculate number behind decimal
      System.out.println("# digits to right of decimal point: " 
         + numbersRight);
      // round result to four decimal places
      System.out.println("Formatted Result: " + fmt1.format(result));
      
   }
}