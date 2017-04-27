import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 * Created by Tyler Drinkard on 4/24/2017.
 */
public class BakeryPart3Test {
   /**
    *
    * @throws Exception throws exception because it might
    */
   @Before
   public void setUp() throws Exception {
      BakedItemList.resetListCount();
   }

   /**
    *
    * @throws Exception throws exception because it might
    */
   @Test
   public void main1() throws Exception {
      BakeryPart3 app = new BakeryPart3();
      String[] args = {null};
      BakeryPart3.main(args);
      Assert.assertEquals(0, BakedItemList.getListCount());
   }

   /**
    *
    * @throws Exception throws exception because it might
    */
   @Test
   public void main2() throws Exception {
      BakeryPart3 app = new BakeryPart3();
      String[] args = {"baked_item_data2.csv"};
      BakeryPart3.main(args);
      Assert.assertEquals(1, BakedItemList.getListCount());
   }

   /**
    *
    * @throws Exception throws exception because it might
    */
   @Test
   public void main3() throws Exception {
      BakeryPart3 app = new BakeryPart3();
      String[] args = {""};
      BakeryPart3.main(args);
      Assert.assertEquals(0, BakedItemList.getListCount());
   }

   /**
    *
    * @throws Exception throws exception because it might
    */
   @Test
   public void main4() throws Exception {
      BakeryPart3 app = new BakeryPart3();
      String[] args = {null};
      BakeryPart3.main(args);
      Assert.assertEquals(0, BakedItemList.getListCount());
   }
}
