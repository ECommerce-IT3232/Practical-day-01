public class Fruit extends Product {
    public Fruit(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public void displayDetails() {
        System.out.println("Fruit: " + getName() + " | Price: " + getPrice() + " | Quantity: " + getQuantity());
    }
}