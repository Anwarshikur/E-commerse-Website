/**
 * @author Anwar Shikur
 * @version 15 may 2024
 * This is a parent class called product1
 */
public abstract class Product1 {
    //attributes 
    public static final String name = "Anwars-Product";
    public  String description;
    public int quantity;
    public double price;
    public static final int maxQuantity = 100;
    //constructor
    public Product1( String description, int quantity, double price) {
        //if statement to check REGEX
        if (description.matches("[a-zA-Z]+")) {
            this.description = description;
        }else{//exception
            throw new IllegalArgumentException("description must only consist of alphabets");
        }
        //if statement to check price above 0
        this.quantity = quantity;
        // Check if price is non-negative
        if (price > 0) {
            this.price = price;
        }else{
            throw new IllegalArgumentException("Price cannot be negative.");
        }
                
    }
    //default constructor
    public Product1() {
        // Default values for fields
        this.description = "";
        this.quantity = 0;
        this.price = 0.0;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {

        if (quantity < 1) {
            throw new IllegalArgumentException("At least 1 item must be bought.");
        }
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getMaxQuantity() {
        return maxQuantity;
    }

    // Custom abstract methods to be defined in other classes 

    
    public abstract double CalculateDiscount();

    
    public abstract double CalculatePrice();


    // toString
    
    public String toString() {
        return String.format("Name: %s%nPrice: %.2f%nDescription: %s%nQuantity: %d%n",
                name, price, description, quantity);
    }
}