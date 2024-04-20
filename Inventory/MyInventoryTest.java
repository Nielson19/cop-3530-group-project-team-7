// package Inventory;

// import Shelves.ProductNode;
// import Inventory.InterfaceInventory;
// import Inventory.MyInventory;


// public class MyInventoryTest {

//     public static void main(String[] args) {
//         // Create an instance of MyInventory with a certain number of aisles
//         MyInventory inventory = new MyInventory(5);

//         // Add products to the inventory
//         inventory.add(0, "Pasta", 10);
//         // inventory.add(1, "Beans", 5);
//         // inventory.add(2, "Bread", 3);
//         // inventory.add(3, "Pasta", 7); // Adding more of an existing product
//         // inventory.add(4, "Cake", 8);

//         // Print the size of the inventory
//         System.out.println("Inventory size: " + inventory.size());

//         // Remove products from the inventory
//         // inventory.remove(0, "Pasta", 3);
//         // inventory.remove(1, "Beans", 2);

//         // Find products in the inventory
//         // Object foundProduct = inventory.find("Bread");
//         // if (foundProduct != null) {
//         //     ProductNode product = (ProductNode) foundProduct;
//         //     System.out.println("Found product: " + product.getName() + ", Amount: " + product.getAmount());
//         // }

//         // Generate and print the inventory report
//         String[] report = inventory.getReport();
//         System.out.println("Inventory Report:");
//         for (String line : report) {
//             System.out.println(line);
//         }
//     }
// }
