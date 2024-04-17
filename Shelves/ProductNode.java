package Shelves;

public class ProductNode {
    // Object product;
    public int amount;
    public String name;
    public ProductNode next;

    //methods

    public int getAmount(){
        return amount;
    }

    public String getName(){
        return name;
    }

    // constructor

    public ProductNode(int amount , String name){

        this.amount = amount;
        this.name = name;
        next = null;

    }
}
