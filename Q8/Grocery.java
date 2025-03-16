public class Grocery extends Product {
    public Grocery(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public void displayDetails() {
        System.out.println("Grocery: " + getName() + " | Price: " + getPrice() + " | Quantity: " + getQuantity());
    }
}