import java.io.IOException;

/**
 * @author Tyler Drinkard
 * @version 4/20/2017
 */
public class BakeryPart2 {
   /**
    * The driver class of BakedItem part 2.
    * @param args Command line arguments.
    * @throws IOException throws an exception if no file found.
    */
   public static void main(String[] args) throws IOException {
      if (args.length != 0) {
         BakedItemList list = new BakedItemList();
         list.readItemFile(args[0]);
         System.out.println("\n" + list.generateReport());
         System.out.println(list.generateReportByClass());
         System.out.println(list.generateReportByPrice());
         System.out.println(list.generateReportByFlavor());
         System.out.println(list.generateExcludedRecordsReport());
      }
      else {
         System.out.println("File name expected as command line argument.");
         System.out.println("Program ending.");
      }
   }
}