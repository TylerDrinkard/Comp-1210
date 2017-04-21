import org.junit.Assert;
import org.junit.Test;

/**
 * @author Tyler Drinkard
 * @version 4/20/2017
 */
public class PriceComparatorTest {

   /** 
    * A test for price compare method when b1.price() = b2.price().
    * @throws Exception throws an exception if no file found.
    */
   @Test public void priceTestEqual() {
      PriceComparator priceCompare = new PriceComparator();
      BakedItem b1 = new Cookie("Cookie", "Chocolate", 1, "flour", "sugar", 
                                "dark chocolate chips", 
                                "butter", "baking soda", "salt");
      BakedItem b2 = new Cookie("Cookie", "Chocolate", 1, "flour", "sugar", 
                                "dark chocolate chips", 
                                "butter", "baking soda", "salt");
      Assert.assertEquals(0, priceCompare.compare(b1, b2));
   }
   
   /** 
    * A test for price compare method when b1.price() > b2.price().
    * @throws Exception throws an exception if no file found.
    */
   @Test public void priceTestGreaterThan() {
      PriceComparator priceCompare = new PriceComparator();
      BakedItem b1 = new Cookie("Cookie", "Chocolate", 2, "flour", "sugar", 
                                "dark chocolate chips", 
                                "butter", "baking soda", "salt");
      BakedItem b2 = new Cookie("Cookie", "Chocolate", 1, "flour", "sugar", 
                                "dark chocolate chips", 
                                "butter", "baking soda", "salt");
      Assert.assertEquals(1, priceCompare.compare(b1, b2));
   }
  
   /** 
    * A test for price compare method when b1.price() < b2.price().
    * @throws Exception throws an exception if no file found.
    */
   @Test public void priceTestLessThan() {
      PriceComparator priceCompare = new PriceComparator();
      BakedItem b1 = new Cookie("Cookie", "Chocolate", 1, "flour", "sugar", 
                                "dark chocolate chips", 
                                "butter", "baking soda", "salt");
      BakedItem b2 = new Cookie("Cookie", "Chocolate", 2, "flour", "sugar", 
                                "dark chocolate chips", 
                                "butter", "baking soda", "salt");
      Assert.assertEquals(-1, priceCompare.compare(b1, b2));
   }
}