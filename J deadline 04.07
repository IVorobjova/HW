import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CheeseShop shop = new CheeseShop();
        Scanner scanner = new Scanner(System.in);
        String choice;

        // Adding some cheeses to the shop
        shop.addCheeseToShop(new Cheese("Cheddar", 15.0, 10.0));
        shop.addCheeseToShop(new Cheese("Gouda", 12.0, 8.0));
        shop.addCheeseToShop(new Cheese("Brie", 20.0, 5.0));

        while (true) {
            System.out.println("1. Add Cheese to Shop");
            System.out.println("2. Remove Cheese from Shop");
            System.out.println("3. View Available Cheeses");
            System.out.println("4. Add Cheese to Cart");
            System.out.println("5. Remove Cheese from Cart");
            System.out.println("6. View Cart");
            System.out.println("7. Checkout");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter cheese name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter price per kg: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter quantity: ");
                    double quantity = scanner.nextDouble();
                    scanner.nextLine();  // Consume newline
                    shop.addCheeseToShop(new Cheese(name, price, quantity));
                    break;
                case "2":
                    System.out.print("Enter cheese name to remove: ");
                    name = scanner.nextLine();
                    shop.removeCheeseFromShop(name);
                    break;
                case "3":
                    shop.displayAvailableCheeses();
                    break;
                case "4":
                    System.out.print("Enter cheese name to add to cart: ");
                    name = scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    quantity = scanner.nextDouble();
                    scanner.nextLine();  // Consume newline
                    shop.addCheeseToCart(name, quantity);
                    break;
                case "5":
                    System.out.print("Enter cheese name to remove from cart: ");
                    name = scanner.nextLine();
                    shop.removeCheeseFromCart(name);
                    break;
                case "6":
                    shop.displayCart();
                    break;
                case "7":
                    shop.checkout();
                    break;
                case "8":
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        }
    }
}
