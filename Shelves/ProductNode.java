package Shelves;

public class ProductNode {
    // Object product;
    int amount;
    String name;
    ProductNode next;

    //methods

    public int getAmount(){
        return amount;
    }

    public String getName(){
        return name;
    }

    // constructor

    ProductNode(int amount , String name){

        this.amount = amount;
        this.name = name;
        next = null;

    }
}
