package Shelves;

public class ProductNode {
    // Object product;
    int amount;
    String name;
    ProductNode next;

    // constructor

    ProductNode(int amount , String name){

        this.amount = amount;
        this.name = name;
        next = null;

    }
}
