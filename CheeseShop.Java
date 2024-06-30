import java.util.ArrayList;

public class CheeseShop {
    private ArrayList<Cheese> availableCheeses = new ArrayList<>();
    private ArrayList<Cheese> cart = new ArrayList<>();

    public void addCheeseToShop(Cheese cheese) {
        availableCheeses.add(cheese);
    }

    public void removeCheeseFromShop(String cheeseName) {
        availableCheeses.removeIf(cheese -> cheese.getName().equalsIgnoreCase(cheeseName));
    }

    public void addCheeseToCart(String cheeseName, double quantity) {
        for (Cheese cheese : availableCheeses) {
            if (cheese.getName().equalsIgnoreCase(cheeseName)) {
                if (cheese.getQuantity() >= quantity) {
                    cheese.setQuantity(cheese.getQuantity() - quantity);
                    cart.add(new Cheese(cheeseName, cheese.getPricePerKg(), quantity));
                } else {
                    System.out.println("Not enough quantity available.");
                }
                return;
            }
        }
        System.out.println("Cheese not found.");
    }

    public void removeCheeseFromCart(String cheeseName) {
        cart.removeIf(cheese -> cheese.getName().equalsIgnoreCase(cheeseName));
    }

    public void displayAvailableCheeses() {
        if (availableCheeses.isEmpty()) {
            System.out.println("No cheeses available.");
        } else {
            for (Cheese cheese : availableCheeses) {
                System.out.println(cheese);
            }
        }
    }

    public void displayCart() {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty.");
        } else {
            for (Cheese cheese : cart) {
                System.out.println(cheese);
            }
        }
    }

    public void checkout() {
        cart.clear();
        System.out.println("Checked out successfully.");
    }
}
