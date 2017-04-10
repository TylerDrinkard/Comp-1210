import java.util.Scanner;
  
/** 
 * Prints age statistics. 
 *
 * @author Tyler Drinkard
 * @version 1/23/17
 */
public class AgeStatistics
{  
   /**
    * Prints statistics for age to standard output.
    *
    * @param args Command line arguments (not used).
    */
   public static void main(String[] args) 
   {
      String name;
      int ageInYears;
      int gender = 0;
      double maxHeartRate = 0;
      
      Scanner userInput = new Scanner(System.in);
      System.out.print("Enter your name: Tyler ");
      name = userInput.nextLine();
      
      System.out.print("Enter your age in years:20 ");
      ageInYears = userInput.nextInt();
      
      System.out.print("Enter your gender:0 ");
      gender = userInput.nextByte();
      
      System.out.println("\t Your age in minutes is "
                          + ageInYears * 525600 + " minutes.");
                                                     
      System.out.println("\t Your age in centuries is "
                          + (double) ageInYears / 100 + " centuries.");
                                                     
      System.out.print("Your max heart rate is ");
      
      if (gender == 1) {
         maxHeartRate = 209 - (0.7 * ageInYears);
         System.out.println(maxHeartRate
            
                                                     + " beats per minute.");
      }
      else {
         maxHeartRate = 214 - (0.8 * ageInYears);
         System.out.println(maxHeartRate
                                                     + " beats per minute.");
      }
      
   }
}