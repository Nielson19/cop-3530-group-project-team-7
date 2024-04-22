package Inventory;

import Shelves.ProductNode;
import Shelves.shelfList;

/**
 * MyInventory class represents an inventory management system using a Hashtable
 * to store shelves, where each shelf contains a list of products.
 */

public class MyInventory implements InterfaceInventory 
{

    // Hashtable to store aisles, where each aisle maps to a shelfList of Product objects 
    public int productID;
    public int size;
    public shelfList[] table;

    public MyInventory(int size) 
    {
        this.table = new shelfList[size];
        this.size = size;
    }

    // Methods

    // Checks if the inventory is empty.
    public boolean isEmpty(){
        return size == 0; // return true if the inventory is empty, false otherwise.
    }

  // Returns the size of the inventory
    public int size(){
        return size; //returns the number of aisles in the inventory
    }

    /**
     * Adds a product to a specified aisle.
     * @param productID The aisle number where the product will be added.
     * @param productName The name of the product to be added.
     * @param amount The quantity of the product to be added.
     * @return The added product, or null if the aisle doesn't exist.
     */
    public void add (int productID, String productName, int amount){
        // Calculate index based on the aisleNumber
        int index = Math.abs(productID) % size();

        // Check if the shelfList at the index is null
        if (table[index] == null) 
        {
            table[index] = new shelfList(); //if it's null create new shelfList
        }

        // Retrieve the shelfList at the index
        shelfList list = table[index];

        // Search for the product in the  shelfList

        list.addProduct(0, productID, productName, amount);

            }
        
    /**
     * Removes a specified amount of a product from a specified aisle.
     * @param productID The aisle number from where the product will be removed.
     * @param productName The name of the product to be removed.
     * @param amount The quantity of the product to be removed.
     * @return The removed product, or null if the aisle doesn't exist.
     */
    public void remove(int productID, String productName, int amount) 
    {
         // Calculate index based on the aisleNumber
        int index = Math.abs(productID) % size;

        // Check if the shelfList at the index is null
        if (table[index] == null) 
        {
            table[index] = new shelfList(); //if it's null create new shelfList
        }

        // Retrieve the shelfList at the index
        shelfList list = table[index];

        // Remove the specified amount of the product from the shelfList
        list.removeProduct(productID, productName, amount);

    }
    
    /**
     * Finds a product by its name within the inventory.
     * @param productName The name of the product to be found.
     * @return The found product, or null if not found.
     */
    public Object findbyID (int productID){

        // find the correct aisle

         int index = Math.abs(productID) % size;

     // Iterate through shelfLists in the selected 

         shelfList list = table[index];
       
        // Check if the shelfList at the index is not null
        if (table[index] != null){
              // Find the product in the current shelfList
            ProductNode product = (ProductNode) list.findProductbyID(productID);
             
              if (product.getName() != null) 
                {
                    System.out.println( "----Product found----" +
                    "\n|Product: " + product.getName() + 
                    "\n|Aisle: " + index + 
                    "\n|Amount: " + product.getAmount()+ " Units");
                    System.out.println("---------------------");

                    return product; // Return the found product
                }
                else {

                    System.out.println("Product " + productID + " not found");
                    return null;
                    
                }
            }

            return null;
    } 
            
    // Empties the inventory by removing all aisles
    public void clear()  {
        // Reset size to 0
        size = 0;
    }

    /**
     * Generates a report of all products in the inventory.
     * @return An array of strings representing the report.
     */
    
    
    public void getReport(){
        int count = 0;
        for (shelfList aisle: table){
            
            if (aisle != null){
                System.out.println("---------------------------------------------------");
                System.out.println("Aisle "+ count);
                System.out.println(aisle.stringReport());
            } else{
                System.out.println("Aisle "+ count +" is empty");
            }
            
            count++;
        
        }
    }

}

