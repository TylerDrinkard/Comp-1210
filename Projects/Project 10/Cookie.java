/**
 *@author Tyler Drinkard
 *@version 4/10/17
 */
public class Cookie extends BakedItem {
   /**
    *
    */
   public static final double BASE_RATE = 0.35;
   /**
    * @param nameIn creates the name of the object
    * @param flavorIn creates the flavor of the object
    * @param quantityIn creates the qunatity of the object
    * @param ingredientsIn creates the ingredients of the object
    */
   public Cookie(String nameIn, String flavorIn, int quantityIn, 
                                       String ... ingredientsIn) {
      super(nameIn, flavorIn, quantityIn, ingredientsIn);
   }
   
   /**
    * @return returns the price of the object
    */
   public double price() {
      return BASE_RATE * (double) quantity;
   }
}