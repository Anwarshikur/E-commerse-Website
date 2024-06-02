/**
 * @author Anwar Shikur
 * @version 15 may 2024
 * This is a composition class called ShoppingCart
 */
public class ShoppingCart1 {
    //variables to store clothing and shoe items
    private Clothing1 clothingItem;
    private Shoe1 shoeItem;
    // Constructor with parameters to initialize the clothing and shoe items
    public ShoppingCart1(Clothing1 clothingItem, Shoe1 shoeItem) {
        this.clothingItem = clothingItem;
        this.shoeItem = shoeItem;
    }

    public ShoppingCart1() {
        // Default values 
        this.clothingItem = new Clothing1();
        this.shoeItem = new Shoe1();
    }
    //getter and setters
    public Clothing1 getClothingItem() {
        return clothingItem;
    }

    public void setClothingItem(Clothing1 clothingItem) {
        this.clothingItem = clothingItem;
    }

    public Shoe1 getShoeItem() {
        return shoeItem;
    }

    public void setShoeItem(Shoe1 shoeItem) {
        this.shoeItem = shoeItem;
    }
    //custom method to calculate total price of both items together
    public double calculateTotalCost() {
        return clothingItem.CalculatePrice() + shoeItem.CalculatePrice();
    }
}