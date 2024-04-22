package Inventory;


public class MyInventoryTest {

    public static void main(String[] args) {
        // Create an instance of MyInventory with a certain number of aisles
        MyInventory inventory = new MyInventory(5);

        // Add products to the inventory
        inventory.add(100, "Beans", 5);
        inventory.add(200, "Bread", 3);
        inventory.add(300, "Pasta", 7); // Adding more of an existing product
        inventory.add(400, "Cake", 8);

        inventory.add(101, "Beans", 20);
        inventory.add(201, "Bread", 20);
        inventory.add(301, "Pasta", 50); // Adding more of an existing product
        inventory.add(401, "Cake", 20);

        // inventory.add(102, "Beans", 20);
        inventory.add(202, "Bread", 20);
        inventory.add(302, "Pasta", 50); // Adding more of an existing product
        inventory.add(402, "Cake", 20);

        // Print the size of the inventory
        System.out.println("Inventory size: " + inventory.size());

        // Remove products from the inventory
        inventory.remove(102, 25);
        inventory.remove(101, 2);

        inventory.findbyID(100);

        // Generate and print the inventory report
        inventory.getReport();
        
        System.out.println("---------------------------------------------------");
    }
}
