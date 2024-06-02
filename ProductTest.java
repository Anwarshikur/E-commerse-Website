/**
 * @author Anwar Shikur
 * @version 15 may 2024
 * This is a Test class for product1
 */
import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Clothing details:");
        System.out.print("Name: ");
        String clothingName = scanner.nextLine();
        System.out.print("Description(great/good/normal): ");
        String clothingDescription = scanner.nextLine();
        System.out.print("Quantity: ");
        int clothingQuantity = scanner.nextInt();
        System.out.print("Price: ");
        double clothingPrice = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Material(cotton/polyester/nylon: ");
        String clothingMaterial = scanner.nextLine();
        System.out.print("Size(S/M/L): ");
        char clothingSize = scanner.next().charAt(0);
        // make newline
        scanner.nextLine(); 
        System.out.print("Color: ");
        String clothingColor = scanner.nextLine();
        System.out.print("Type: ");
        String clothingType = scanner.nextLine();
        System.out.print("Is Waterproof (true/false): ");
        boolean clothingIsWaterproof = scanner.nextBoolean();

        Clothing1 clothingItem = new Clothing1(clothingDescription, clothingQuantity, clothingPrice,
                clothingMaterial, clothingSize, clothingColor, clothingType,clothingIsWaterproof);

        System.out.println("Enter Shoe details:");
        System.out.println("");
        String shoeName = scanner.nextLine();
        System.out.print("Description (great/good/normal): ");
        String shoeDescription = scanner.nextLine();
        System.out.print("Quantity: ");
        int shoeQuantity = scanner.nextInt();
        System.out.print("Price: ");
        double shoePrice = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Size: ");
        int shoeSize = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Gender(M/F): ");
        char shoeGender = scanner.next().charAt(0);
        scanner.nextLine(); // Consume newline
        System.out.print("Brand: ");
        String shoeBrand = scanner.nextLine();
        System.out.print("Type: ");
        String shoeType = scanner.nextLine();

        Shoe1 shoeItem = new Shoe1( shoeDescription, shoeQuantity, shoePrice, shoeSize, shoeGender, shoeBrand,
                shoeType);

        ShoppingCart1 cart = new ShoppingCart1(clothingItem, shoeItem);

        System.out.println("Total Cost: $" + cart.calculateTotalCost());
        System.out.println("Clothing Details:\n" + clothingItem.toString());
        System.out.println("Shoe Details:\n" + shoeItem.toString());

        System.out.println("Is Waterproof: " + clothingItem.isWaterproof());

        System.out.println("Your Discount for cloths is : " + clothingItem.CalculateDiscount());
        System.out.println("Your Discount for shoe is : " + shoeItem.CalculateDiscount());

    }
}