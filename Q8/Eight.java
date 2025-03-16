public class Eight {
    public static void main(String[] args) {
        RetailStore store = new RetailStore();

        store.addProduct(new Fruit("Apple", 1.2, 100));
        store.addProduct(new Vegetable("Carrot", 0.5, 150));
        store.addProduct(new Grocery("Rice", 2.5, 50));

        store.displayProducts();

        store.editProduct(0, "Apple", 1.5, 120);

        System.out.println("\nAfter editing Apple:");
        store.displayProducts();

        store.deleteProduct(1);

        System.out.println("\nAfter deleting Carrot:");
        store.displayProducts();
    }
}

/* 
@Kasunchira ➜ /workspaces/Practical-day-01/Q8 (main) $ java Eight

Products in the Store:
Fruit: Apple | Price: 1.2 | Quantity: 100
Vegetable: Carrot | Price: 0.5 | Quantity: 150
Grocery: Rice | Price: 2.5 | Quantity: 50

After editing Apple:

Products in the Store:
Fruit: Apple | Price: 1.5 | Quantity: 120
Vegetable: Carrot | Price: 0.5 | Quantity: 150
Grocery: Rice | Price: 2.5 | Quantity: 50

After deleting Carrot:

Products in the Store:
Fruit: Apple | Price: 1.5 | Quantity: 120
Grocery: Rice | Price: 2.5 | Quantity: 50
*/