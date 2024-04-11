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

        myShelf.addProduct(0,"Milk",20); // location,name,amount
        myShelf.addProduct(1,"Juice",10);
        myShelf.addProduct(2,"Bread",40);
        myShelf.addProduct(3,"Cheese",80);
        
         // You can perform further tests here, like checking if the product was added correctly
        // For example:
        System.out.println(myShelf.stringReport()); // Print the report to see if the product is added correctly
        System.out.println("---------------------------------------------------");

        myShelf.removeProduct(2); //remove product on index 1 + remove by amount if reach 0 its deleted (Works)

        System.out.println(myShelf.stringReport()); // Print the report to see if the product deleted correctly
        System.out.println("---------------------------------------------------");

        // myShelf.removeAll(); // delete all (works)

        System.out.println(myShelf.stringReport()); // Print the report to see if the list is fully deleted
        System.out.println("---------------------------------------------------");

        ProductNode foundProduct = (ProductNode)myShelf.findProduct("Cheese");
        ProductNode foundProduct2 = (ProductNode)myShelf.findProduct("Cheese");
        ProductNode foundProduct3 = (ProductNode)myShelf.findProduct("Cheese");
        

     


        


    }
}

    


    







