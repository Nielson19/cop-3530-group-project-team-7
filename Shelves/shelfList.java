package Shelves; // its inside this folder
import java.beans.PropertyDescriptor;
import java.util.LinkedList;
import Shelves.shelfList;
import Shelves.ProductNode;
// this is a reference to the ShelfList

public class shelfList implements shelfListInterface{

    protected int size;
    protected ProductNode head; // first element of the list
    protected ProductNode tail; // last element of the list

    // methods

    public void addProduct(int location, String name, int amount){

        //verify if i is on list

        if (location >= 0 && location <= size){ //           -1 ?

            // if index is at the beginning

            if(location == 0){

                //check if product exist

                if(findProduct(name) == null){ // if do not exist TODO problems asimilating null in this part

                    ProductNode newProduct = new ProductNode(amount, name);//create the product
                    newProduct.next  = head; // current head behind newNode
                    head = newProduct; // head becomes NewNode
                    
                    // condition if only one element is in list
                    if (tail == null){
                        tail = newProduct; // tail also becomes the newProduct since it taking place of both
                    }

                } else { // if it does exist

                ProductNode foundProduct = (ProductNode)findProduct(name);
                foundProduct.amount = foundProduct.amount + amount;
            }

               

            }

            // if index is at the end of the list

            else if(location == size){ // - 1 ?

                // condition if item exist

                if(findProduct(name) == null){ // if do not exist

                ProductNode newProduct = new ProductNode(amount, name);//create the product
                tail.next = newProduct; // next of current tail carries NewNode
                tail = newProduct; // newNode becomes the new Tail

                    
                } else { // if it does exist

                    ProductNode foundProduct = (ProductNode)findProduct(name);
                    foundProduct.amount = foundProduct.amount + amount;
                }

            }

            // if index is in the middle of the list

            else {

                 // condition if item exist

                if(findProduct(name) == null){ // if do not exist

                    int n = 0;
                    ProductNode current = head; //starting 
                    while (n < location - 1){ // iteration 
                        current = current.next; 
                        n++;
                    }

                    ProductNode newProduct = new ProductNode(amount, name);//create the product
                    newProduct.next = current.next; 
                    current.next = newProduct; // opening the space for the new product

                 
                } else { // if it does exist

                    ProductNode foundProduct = (ProductNode)findProduct(name);
                    foundProduct.amount = foundProduct.amount + amount;
                }
            }
            size++;
        }
    }

    public void removeProduct(int location, String name ,int amount){

        if (location >= 0 && location <= size){

            // if index is at the beginning

            if(location == 0){
                
                // apply amount change

                head.amount = head.amount - amount;
                
                // condition amount is 0 delete

                if (head.amount <= 0) {

                        head = head.next; // current head is replaced for head.next

                    if (head == null){ // the replacement is null
                        tail = null; 
                    }
                    size--;

                } else{
                    System.out.println("- " + head.name + " has now " + head.amount + "Units");
                }
       
            }

            // if index is at the end of the list

            else if(location == size){ // TODO check why those -1's are present
                
                // iteration through the list
                // while (current.getName() != name){ // - 2 since index is always - 1 from size and the other - 1 is aiming to the 1 ahead of tail
                //     current = current.next;
                // }

                // create a variable with the result of a find

                ProductNode current = (ProductNode)findProduct(name);

                if (current != null){  // if product found 

                    //apply change of amount

                    current.next.amount = current.next.amount - amount;

                           // condition of amount is 0

                    if (current.next.amount <= 0) { // if amount runs out 

                        tail = current; 
                        tail.next = null;
                        size--;

                    } else{ // if amount still available

                        System.out.println("- " + current.name + " has now " + current.amount + "Units");
                    }


                } else if (current == null){ // if product not found

                    System.out.println("Product: " + name + "not changed. Product not Found");
                    // ends...
                };
                
            }

            // if index is in the middle of the list

            else {

                // iteration
                ProductNode prev = (ProductNode)findProduct(name); // starting point

                if (prev != null){

                        //apply change of amount

                    prev.amount = prev.amount - amount;
                    
                    // condition of amount is 0
    
                    if (prev.next.amount <= 0) {
    
                        prev.next = prev.next.next; // jumps over the actual object replacing the previous next to the current next eating the product
                        size--;

                    }
                    else{

                        System.out.println("- " + prev.name + " has now " + prev.amount + " Units");
                    }
                } else if (prev == null){

                    System.out.println("Product: " + name + "not changed. Product found");
                }
                

            }
           
        }
          
    }
    
    public String stringReport(){
        String report = "Shelf List\n";
        ProductNode current = head; // starting point 
        while (current != null){ //while it current is a product 
            report = report + " - " + current.name + "\t" + current.amount + " Units.";
            if(current.next != null){ // while there is a product next to the current
                report = report + "\n";
            }
            current = current.next;
        }

        return report;
    }

    public int size() { // returns size
        return size;
    }

    public boolean isEmpty() { // check if it empty

        if (size == 0){
            return true;
        } else {
            return false;
        }
    }

    public Object findProduct(String name){

        ProductNode current = head;

        while (current != null) {
            if (current.name.equals(name)) {
                System.out.println("Product " + current.name + " was found");
                return current;
            }

            current = current.next;
        }

        // System.out.println("Product " + name + " not Found");
        return null;
    
        }
    
    public void removeAll() { // empty list
        size = 0;
        head = null;
        tail = null;

    }
    
    //constructor

    shelfList(){
        size = 0;
        head = null;
        tail = null;
    }

}









