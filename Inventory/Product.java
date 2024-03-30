package Inventory;

    // Create a class called Product which stores the key, Object & amount 
    // this is required since those are the parameters needed to modify the inventory
    //(add,remove,find, get...)

public class Product{
    int location;
    Object productName;
    int amount;

    // constructor
    public Product(int location, Object productName, int amount){

        this.location = location;
        this.productName = productName;
        this.amount = amount;

    }
}