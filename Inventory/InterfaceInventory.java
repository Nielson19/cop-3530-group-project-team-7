package Inventory;

public interface InterfaceInventory {
    
    boolean isEmpty();
        
    int size ();
            
    void clear ();
        
    void add (int productID, String productName, int amount); 
        
    void remove (int productID, String productName, int amount);
        
    Object findbyID (int productID);
        

     //TODO make a findbyName method
     
    // String[] getReport();

}
