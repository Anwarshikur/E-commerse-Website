/**
 * @author Anwar Shikur
 * @version 15 may 2024
 * This is a sub class called shoe1
 */
public class Shoe1 extends Product1 {
    //Attributes
    private int size;
    private char gender;
    private String brand;
    private String type;
    //constructors
    public Shoe1(String description, int quantity, double price, int size, char gender, String brand,
                String type) {
        super(description, quantity, price);
        this.size = size;
        this.gender = gender;
        this.brand = brand;
        this.type = type;
    }
    //default constructors
    public Shoe1() {
        this.size = 0;
        this.gender = ' ';
        this.brand = "";
        this.type = "";
    }

    // Getters and setters
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    // Custom methods
    @Override
    public double CalculateDiscount() {
        return 0.70 * getPrice();
    }

    @Override
    public double CalculatePrice() {
        return getPrice() * getQuantity();
    }
    
    // toString
    @Override
    public String toString() {
        return String.format("%s%nSize: %d%nGender: %c%nBrand: %s%nType: %s%n",
                super.toString(), size, gender, brand, type);
    }
    //nested class for shoe combinations
    public class OutfitChooser {

        String[] sneaker = {"T-shirt with jeans", "T-shirt with Shorts", "Jacket with joggers", "Sweatshirt with casual pants", "Polo shirt with chinos"};
        String[] crocs = {"T-shirt with Shorts", "Jacket with joggers", "Tank top with leggings", "Hoodie with jeans"};
        String[] dressShoe = {"Button-up shirt with chinos", "Blazer with jeans", "Sweater with casual pants", "Collared shirt with shorts"};
        String[] sandals = {"T-shirt with shorts", "Tank top with skirt", "Casual dress"};
        String[] boots = {"Flannel shirt with jeans", "Sweater with leggings", "Button-up shirt with casual pants"};
        
        public String[] chooseStyle(String shoeType) {
            switch (shoeType) {
                case "sneaker":
                    return sneaker;
                case "crocs":
                    return crocs;
                case "dressShoe":
                    return dressShoe;
                case "sandals":
                    return sandals;
                case "boots":
                    return boots;
                default:
                    return new String[0]; // Default return if shoe type not recognized
            }
        }
    }
}