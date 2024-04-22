package Shelves;

public class ProductNode {
    // Object product;
    public int amount;
    public int id;
    public String name;
    public ProductNode next;

    //methods

    public int getAmount(){
        return amount;
    }

    public String getName(){
        return name;
    }

    public int getID(){
        return id;
    }

    // constructor

    public ProductNode(int id, int amount , String name){
        this.id = id;
        this.amount = amount;
        this.name = name;
        next = null;

    }
}