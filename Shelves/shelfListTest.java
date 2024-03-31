package Shelves;
import Shelves.shelfListInterface;
import Shelves.shelfList;
import Shelves.shelfList.ProductNode;

import Inventory.Product;

public class shelfListTest {

    public static void main(String[] args) {
        shelfListTest test = new shelfListTest();
        test.testAddProduct();
    }

    public void testAddProduct() {  
        // Create a shelfList object
        shelfList myShelf = new shelfList();

        // Create a product
        Product myProduct = new Product(7, "Milk");
         // Add the product to the shelf
         myShelf.addProduct(0, myProduct, 20); // add the name of the product

        myProduct = new Product(18, "Juice");
        // Add the product to the shelf
        myShelf.addProduct(1, myProduct, 30); // add the name of the product

        myProduct = new Product(20, "Bread");
        // Add the product to the shelf
        myShelf.addProduct(2, myProduct, 40); // add the name of the product




       
        

        // You can perform further tests here, like checking if the product was added correctly
        // For example:
        System.out.println(myShelf.stringReport()); // Print the report to see if the product is added correctly
    }
}

    


    







