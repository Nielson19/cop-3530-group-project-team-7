package Inventory;

import Shelves.ProductNode;
import Shelves.shelfList;

/**
 * MyInventory class represents an inventory management system using a Hashtable
 * to store shelves, where each shelf contains a list of products.
 */

public class MyInventory implements InterfaceInventory {

    // Hashtable to store aisles, where each aisle maps to a shelfList of Product
    // objects
    public int aisleNumber;
    public int size;
    public shelfList[] table;

    public MyInventory(int aisleNumber) {
        this.table = new shelfList[aisleNumber];
        this.aisleNumber = aisleNumber;
        this.size = 0;
    }

    // Methods

    // Checks if the inventory is empty.
    public boolean isEmpty() {
        return size == 0; // return true if the inventory is empty, false otherwise.
    }

    // Returns the size of the inventory
    public int size() {
        return size; // returns the number of aisles in the inventory
    }

    /**
     * Adds a product to a specified aisle.
     * 
     * @param aisleNumber The aisle number where the product will be added.
     * @param productName The name of the product to be added.
     * @param amount      The quantity of the product to be added.
     * @return The added product, or null if the aisle doesn't exist.
     */
    public Object add(int aisleNumber, Object productName, int amount) {
        // Calculate index based on the aisleNumber
        int index = Math.abs(aisleNumber) % table.length;

        // Check if the shelfList at the index is null
        if (table[index] == null) {
            table[index] = new shelfList(); // if it's null create new shelfList
        }

        // Retrieve the shelfList at the index
        shelfList list = table[index];

        // Convert productName to String
        String productNameString = (String) productName;

        // Search for the product in the shelfList
        for (int i = 0; i < list.size(); i++) {
            ProductNode node = (ProductNode) list.findProduct(productNameString);
            if (node != null && node.name.equals(productNameString)) {
                node.amount += amount; // If the product exists, update amount
                return node;
            }
        }

        // If the product does not exist, create it
        ProductNode newProduct = new ProductNode(0, amount, productNameString);

        // Add the new ProductNode to the shelfList
        list.addProduct(list.size(), 0, productNameString, amount);
        size++; // Increment the size
        return newProduct; // Return newly added product
    }

    /**
     * Removes a specified amount of a product from a specified aisle.
     * 
     * @param aisleNumber The aisle number from where the product will be removed.
     * @param productName The name of the product to be removed.
     * @param amount      The quantity of the product to be removed.
     * @return The removed product, or null if the aisle doesn't exist.
     */
    @Override
    public Object remove(int aisleNumber, Object productName, int amount) {
        // Calculate index based on the aisleNumber
        int index = Math.abs(aisleNumber) % table.length;

        // Check if the shelfList at the index is null
        if (table[index] == null) {
            return null; // Return null if the aisle doesn't exist
        }

        // Retrieve the shelfList at the index
        shelfList list = table[index];

        // Remove the specified amount of the product from the shelfList
        list.removeProduct((String) productName, amount);

        // Update the size of the inventory
        size--;

        // Return the removed product
        return productName;
    }

    /**
     * Finds a product by its name within the inventory.
     * 
     * @param productName The name of the product to be found.
     * @return The found product, or null if not found.
     */
    public Object find(Object productName) {
        // Iterate through shelfLists in the inventory
        for (int i = 0; i < aisleNumber; i++) {
            // Check if the shelfList at the index is not null
            if (table[i] != null) {
                // Retrieve the shelfList at the index
                shelfList list = table[i];
                // Find the product in the current shelfList
                ProductNode product = (ProductNode) list.findProduct((String) productName);
                if (product != null && product.name.equals(productName)) {
                    System.out.println("Product " + productName + " was found");
                    return product; // Return the found product
                }
            }
        }
        // If the product is not found
        System.out.println("Product " + productName + " not found");
        return null;
    }

    // Empties the inventory by removing all aisles
    public void clear() {
        // Empty the hashtable
        table = new shelfList[aisleNumber];
        // Reset size to 0
        size = 0;
    }

    /**
     * Generates a report of all products in the inventory.
     * 
     * @return An array of strings representing the report.
     */

    // BIELKY TO DO
    public String[] getReport() {
        // Create a String[] with a size equal to the number of unique productNames in
        // the hashtable
        String[] productNames = new String[size];
        int count = 0;

        // Iterate through the hashtable array
        for (int i = 0; i < table.length; i++) {
            // For each table location that isn't null
            if (table[i] != null) {
                shelfList list = table[i];
                // a. Iterate though the bucket (linked list)
                ProductNode current = list.head;
                while (current != null) {
                    // getting the productName out of each Entry and storing it in
                    // the array of strings you created in step 1.
                    String productName = current.name;
                    int aisleNumber = i;
                    int amount = current.amount;
                    String status = (amount <= 2) ? "low" : "normal";

                    // Format the report entry
                    String entry = String.format("Product: %s, Aisle: %d, Amount: %d, Status: %s", productName,
                            aisleNumber, amount, status);

                    // Add the report entry to the report array
                    productNames[count++] = entry;

                    // Move to the next product in the linked list
                    current = current.next;
                }
            }
        }
        // Return the String[]
        return productNames;
    }

    // Print the report of all the items it should be the name, location and current
    // amount

    // Condition where if (product.amount is <= 2) write a status column of "low"
    // else leave status "normal"

    // Columns Array[String Name, Int Location, Int Amount, String Status]

    // Print acordingly make it PRETTYYYYY!!!!!!!

    // }

}

// PREVIOUS NOTES: we can use the remainder as the idle position and the result
// of the division is the position
// protected int aisleNumber; // determine the number of Aisle
// protected int size; // size variable

// public boolean isEmpty() {return true;}

// public int size(){return -1;}

// public void clear(){}

// public Object add(int aisleNumber, Object productName, int amount){

// public Object remove(int aisleNumber, Object productName, int amount){

// public Object find(Object productName)

// public String[] getReport()