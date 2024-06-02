/**
 * @author Anwar Shikur
 * @version 15 may 2024
 * This is a sub class called clothing1
 */
public class Clothing1 extends Product1 {
    //Attributes
    private String material;
    private char size;
    private String color;
    private String type;
    private boolean isWaterproof;
    
    //constructors
    public Clothing1(String description, int quantity, double price, String material, char size,
                    String color, String type,boolean isWaterproof) {
        super( description, quantity, price);
        this.material = material;
        this.size = size;
        this.color = color;
        this.type = type;
        this.isWaterproof = isWaterproof;
    }
    //default constructor
    public Clothing1() {
        // Default values for fields
        this.material = "";
        this.size = ' ';
        this.color = "";
        this.type = "";
        this.isWaterproof = false;
    }

    // Getters and setters
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isWaterproof() {
        return isWaterproof;
    }

    public void setWaterproof(boolean waterproof) {
        isWaterproof = waterproof;
    }


   // Custom methods
   @Override
   public double CalculateDiscount() {
       // Implement discount calculation for clothing
       return 0.50 * getPrice();
   }

   @Override
   public double CalculatePrice() {
       return getPrice() * getQuantity();
   }
   

   // Nested class for color combinations
   private static class ColorCombo {

       private static final String[] black = {"grey", "white", "red", "blue", "green", "yellow", "purple"};
       private static final String[] brown = {"white", "cream", "beige", "green", "orange", "yellow"};
       private static final String[] blue = {"white", "black", "grey", "beige", "navy", "light blue", "dark green"};
       private static final String[] red = {"white", "black", "grey", "navy", "cream", "khaki", "light blue"};
       private static final String[] green = {"white", "black", "grey", "brown", "navy", "khaki", "olive"};
       private static final String[] grey = {"white", "black", "navy", "burgundy", "olive", "camel", "light blue"};
       private static final String[] white = {"black", "grey", "navy", "camel", "khaki", "light blue", "pink"};

       public static String[] matchingColors(String color) {
           switch (color.toLowerCase()) {
               case "black":
                   return black;
               case "brown":
                   return brown;
               case "blue":
                   return blue;
               case "red":
                   return red;
               case "green":
                   return green;
               case "grey":
                   return grey;
               case "white":
                   return white;
               default:
                   return new String[0]; // Default return if color not recognized
           }
       }
   }

     // toString
     @Override
     public String toString() {
         return String.format("%s%nMaterial: %s%nSize: %c%nColor: %s%nType: %s%nIs Waterproof: %b%nAvailable color combinations: %s%n",
                 super.toString(), material, size, color, type,isWaterproof,String.join(", ", ColorCombo.matchingColors(color)));
     }
}