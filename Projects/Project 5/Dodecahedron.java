import java.text.DecimalFormat;
/**
 * @author Tyler Drinkard
 * @version 3/26/2017
 */
public class Dodecahedron {
/**
 * Dodecahedron.
 * @param args Commandline arguments - not used.
 */
   private String label = "";
   private String color = "";
   private double edge = 0;
   private static int count = 0;
   /**
    * @param labelIn the input label.
    * @param colorIn the input color.
    * @param edgeIn the input edge.
    */
   public Dodecahedron(String labelIn, String colorIn, double edgeIn) {
      setLabel(labelIn);
      setColor(colorIn);
      setEdge(edgeIn);
      count++;
   }
   /**
    * @param labelIn the label.
    * @return true if applied, otherwise false.
    */
   public boolean setLabel(String labelIn) {
      if (labelIn == null) {
         return false;
      }
      else {
         label = labelIn.trim();
         return true;
      }
   }
   /**
    * @param colorIn the color.
    * @return true if applied, otherwise false.
    */
   public boolean setColor(String colorIn) {
      if (colorIn == null) {
         return false;
      }
      else {
         color = colorIn.trim();
         return true;
      }
   }
   /**
    * @param edgeIn the edge.
    * @return true if appled, otherwise false.
    */   
   public boolean setEdge(double edgeIn) {
      if (edgeIn <= 0) {
         return false;
      }
      else {
         edge = edgeIn;
         return true;
      }
   }
   /**
    * @return label.
    */
   public String getLabel() {
      return label;
   }
   /**
    * @return color.
    */
   public String getColor() {
      return color;
   }
   /**
    * @return edge.
    */
   public double getEdge() {
      return edge;
   }
   /**
    * @return the value of the surface area.
    */
   public double surfaceArea() {
      double surfaceArea = 3 * Math.sqrt(10 * Math.sqrt(5) + 25) * edge * edge;
      return surfaceArea;
   }
   /**
    * @return the value of the volume.
    */
   public double volume() {
      double volume =  Math.pow(edge, 3) * (15 + 7 * Math.sqrt(5)) / 4;
      return volume;
   }
   /**
    * @return the surface to volume ratio.
    */
   public double surfaceToVolumeRatio() {
      double surfaceToVolumeRatio = surfaceArea() / volume();
      return surfaceToVolumeRatio;
   }
   /**
    * @return the string.
    */
   public String toString() {
      DecimalFormat fmt = new DecimalFormat("#,##0.0##");
      String output = "Dodecahedron " + "\"" + label.trim() + "\" is \""
         + color.trim() + "\" with 30 edges of length " + edge 
         + " units.";
      output += "\n\tsurface area = " + fmt.format(surfaceArea())
               + " square units";
      output += "\n\tvolume = " + fmt.format(volume()) + " cubic units";
      output += "\n\tsurface/volume ratio = ";
      output += fmt.format(surfaceToVolumeRatio());
      return output;
   }
   /**
    * @return count.
    */
   public static int getCount() {
      return count;
   }
   /**
    * Reset the count.
    */
   public static void resetCount() {
      count = 0;
   }
   /**
    * @param obj the object.
    * @return true if it is a dodecahedron.
    */
   public boolean equals(Object obj) {
      if (!(obj instanceof Dodecahedron)) {
         return false;
      }
      else {
         Dodecahedron d = (Dodecahedron) obj;
         return (label.equalsIgnoreCase(d.getLabel())
                  && color.equalsIgnoreCase(d.getColor())
                  && Math.abs(edge - d.getEdge()) < .000001);
      }
   }
   /**
    * @return hashCode.
    */
   public int hashCode() {
      int hash = 0;
      return hash;
   }
}