/**
 *@author Tyler Drinkard
 *@version 4/2/17
 */
public class Act09 {
   /**
    *
    * @param args comandline args
    */
   public static void main(String[] args) {
      InventoryItem.setTaxRate(.05);
      InventoryItem item1 = new InventoryItem("Oil change kit", 39.00);
      ElectronicsItem item2 = new ElectronicsItem("Cordless phone", 80.00, 1.8);
      OnlineArticle item3 = new OnlineArticle("Java News", 8.50);
      item3.setWordCount(700);
      OnlineBook item4 = new OnlineBook("Java for Noobs", 13.37);
      item4.setAuthor("L. G. Jones");
      System.out.println(item1.toString());
      System.out.println(item2.toString());
      System.out.println(item3.toString());
      System.out.println(item4.toString());
   }
}