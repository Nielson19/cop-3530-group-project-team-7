package Inventory;

public interface InterfaceInventory {
    
    boolean isEmpty();
   
    int size(); // gives you the size
            
    void clear(); // clears the inventory
        
    void add(int productID, String productName, int amount); 
        
    void remove(int productID, String productName, int amount);
        
    Object findbyID(int productID);
    
     //TODO make a findbyName method
      void getReport();

}
