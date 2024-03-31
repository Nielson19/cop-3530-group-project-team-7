package Inventory;

    // Create a class called Product which stores the key, Object & amount 
    // this is required since those are the parameters needed to modify the inventory
    //(add,remove,find, get...)

public class Product{
    int location;
    Object productName;


    public String getName(){ //get the name of the product
        return productName.toString();
        
    }

    public int getLocation(){
        return location;
    }

    // constructor
    public Product(int location, Object productName){

        this.location = location;
        this.productName = productName;


    }
}