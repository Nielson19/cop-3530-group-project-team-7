// Import Hashtable and shelfList


/* Define parameters 
 * 
 * 
*/

public class MyInventory implements InterfaceInventory {
    
    protected int aisleNumber; // determine the number of Aisle
    protected int size; // size variable

    //Create a Hashtable to store aisles, where each aisle maps to a shelfList of Product Objects

    public boolean isEmpty() {return true;}

    public int size(){return -1;}

    public void clear(){} // Empties MyInventory

      // Create a class called Product which stores the key, Object & amount 
    // this is required since those are the parameters needed to modify the inventory

    public class Product{
        int location;
        Object productName;
        int amount;

        // constructor
        Product (int location, Object productName, int amount){

            this.location = location;
            this.productName = productName;
            this.amount = amount;

        }
    }

    public Object add(int location, Object productName, int amount){


           //Method to add a product to a specified aisle

            //Create a new ShelfList for a new aisle, or get the existing list, and then add the product to it 

        return null;
    }


    public Object remove(int location, int amount){


        return null;
    }

    public Object find(Object productName){

         //Method to find a product by its scanning number within a specified aisle 

        return null;
    }


    public String[] getReport(){
        return null;
    }
       
    
   

    //Retrieve the list of products for the given aisle name 

        // if the aisle does not exist it would be null
        
            //Iterate through products in the aisle

                //Check if the current product's scanning number matches the one we're searching

                    //return the product if match is found


    //If no products is found return null 


    // check if the inventory is empty

   


}
