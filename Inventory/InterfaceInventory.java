package Inventory;

public interface InterfaceInventory {
    
    boolean isEmpty();
        
    int size ();
            
    void clear ();
        
    Object add (int aisleNumber, Object productName, int amount);
        
    // Object remove (int aisleNumber, Object productName, int amount);
        
    Object find (Object productName);
        
    // String[] getReport();

}
