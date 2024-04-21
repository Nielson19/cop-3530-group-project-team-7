package Shelves;
import Shelves.shelfListInterface;
import Shelves.shelfList;
import Shelves.ProductNode;

public class shelfListTest {

    public static void main(String[] args) {
        shelfListTest test = new shelfListTest();
        test.testAddProduct();
    }

    public void testAddProduct() {  
        // Create a shelfList object
        shelfList myShelf = new shelfList();
    
        // Add the product to the shelf
        myShelf.addProduct(0, 0, "Milk", 20); // location, id, name, amount
        myShelf.addProduct(1, 0, "Juice", 20);
        myShelf.addProduct(2, 0, "Bread", 40); // this should add the existing value
        myShelf.addProduct(3, 0, "Cheese", 80);
        
        // You can perform further tests here, like checking if the product was added correctly
        // For example:
        System.out.println(myShelf.stringReport()); // Print the report to see if the product is added correctly
        System.out.println("---------------------------------------------------");
    
        myShelf.removeProduct("Milk", 10);
        myShelf.removeProduct("Juice", 10);
        myShelf.removeProduct("Bread", 10);
        myShelf.removeProduct("Cheese", 10);
       
        // myShelf.removeProduct(0, 10); //remove product on index 1 + remove by amount if reach 0 its deleted (Works)
    
        System.out.println(myShelf.stringReport()); // Print the report to see if the product deleted correctly
        System.out.println("---------------------------------------------------");
    
        myShelf.addProduct(0, 0, "Milk", 100); // location, id, name, amount
        myShelf.addProduct(1, 0, "Juice", 100);
        myShelf.addProduct(2, 0, "Bread", 100); // this should add the existing value
        myShelf.addProduct(3, 0, "Cheese", 100);
    
        System.out.println(myShelf.stringReport()); // Print the report to see if the list is fully deleted
        System.out.println("---------------------------------------------------");
    
        System.out.println(myShelf.isEmpty()); // false
    }
}