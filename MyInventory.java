// Import Hashtable and shelfList


/* Define parameters 
 * 
 * 
*/

public class MyInventory implements InterfaceInventory { 
    
    protected int aisleNumber; // determine the number of Aisle
    protected int size; // size variable

    //Create a Hashtable to store aisles, where each aisle maps to a shelfList of Product Objects

    public boolean isEmpty() {return true;}//checks if inventory is empty

    public int size(){return -1;}// returns the size of the Inventory

    public void clear(){} // Empties MyInventory

      // Create a class called Product which stores the key, Object & amount 
    // this is required since those are the parameters needed to modify the inventory
    //(add,remove,find, get...)

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

        return null; //If no products is found return null 
    }


    public Object remove(int location, int amount){

        // if statement where once it reaches 0 the item should be out of the ShelfList

        return null;
    }


    public Object find(Object productName){


         //Method to find a product by its scanning number within a specified aisle 

          //Retrieve the list of products for the given aisle name 

                // if the aisle does not exist it would be null
        
                //Iterate through products in the aisle

                //Check if the current product's scanning number matches the one we're searching

                //return the product if match is found
           
            //Create a new ShelfList for a new aisle, or get the existing list, and then add the product to it 

        return null;
    }


    public String[] getReport(){

        //Print the report of all the items it should be the name location and current amount

        // Condition where if (product.amount is <= 2) write a status column of "low" else leave status "normal"

        // Columns Array[String Name, Int Location, Int Amount, String Status]

        // Print acordingly make it PRETTYYYYY!!!!!!!

        return null;
    }
       

}
