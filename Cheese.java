public class Cheese {
    private String name;
    private double pricePerKg;
    private double quantity; // quantity in kg

    public Cheese(String name, double pricePerKg, double quantity) {
        this.name = name;
        this.pricePerKg = pricePerKg;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return name + " - " + pricePerKg + "$/kg, Available: " + quantity + "kg";
    }
}
