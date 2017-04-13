import org.junit.Assert;
import org.junit.Test;

/**
 *
 */
public class BakeryPart1Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Test public void countTest() {
   
      //covers the default constructor
      BakeryPart1 bp1 = new BakeryPart1();
      
      //checks class variable count
      BakedItem.resetCount();
      BakeryPart1.main(null);
      
      Assert.assertEquals("BakedItem.count should be 6. ",
                           6, BakedItem.getCount());
   
   }
}