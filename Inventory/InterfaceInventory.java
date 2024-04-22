package Inventory;

public interface InterfaceInventory {
    
    boolean isEmpty();
   
    int size(); // gives you the size
            
    void clear(); // clears the inventory
        
    void add(int productID, String productName, int amount); 
        
    void remove(int productID, int amount);
        
    Object findbyID(int productID);
    
    void getReport();

}
