package Shelves; // its inside this folder
import java.beans.PropertyDescriptor;
import java.util.LinkedList;
import Inventory.Product;
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

        if (location >= 0 && location <= size){

            // if index is at the beginning

            if(location == 0){

                ProductNode newProduct = new ProductNode(amount, name);//create the product
                newProduct.next  = head; // current head behind newNode
                head = newProduct; // head becomes NewNode
                
                // condition if only one element is in list
                if (tail == null){
                    tail = newProduct; // tail also becomes the newProduct since it taking place of both
                }

            }

            // if index is at the end of the list

            else if(location == size){

                ProductNode newProduct = new ProductNode(amount, name);//create the product
                tail.next = newProduct; // next of current tail carries NewNode
                tail = newProduct; // newNode becomes the new Tail

            }

            // if index is in the middle of the list

            else {
                int n = 0;
                ProductNode current = head; //starting 
                while (n < location - 1){ // iteration 
                    current = current.next; 
                    n++;
                }

                ProductNode newProduct = new ProductNode(amount, name);//create the product
                newProduct.next = current.next; 
                current.next = newProduct; // opening the space for the new product
            }
            size++;
        }
    }

    public void removeProduct(int i){

        if (i >= 0 && i <= size){

            // if index is at the beginning

            if(i == 0){

                head = head.next; // current head is replaced for head.next
                if (head == null){ // the replacement is null
                    tail = null; 
                }

            }

            // if index is at the end of the list

            else if(i == size - 1){
                ProductNode current = head;
                
                // iteration through the list
                int n = 0;
                while (n < i - 2){ // - 2 since index is always - 1 from size and the other - 1 is aiming to the 1 ahead of tail
                    current = current.next;
                    n++;
                }
                
                // the current which is 1 ahead of tail becomes the new tail with the correspoding next

                tail = current; 
                tail.next = null;

            }

            // if index is in the middle of the list

            else {

                // iteration
                ProductNode prev = head; // starting point

                for (int n = 0; n <= i; n++){
                    prev = prev.next;
                }

                prev.next = prev.next.next; // jumps over the actual object replacing the previous next to the current next eating the product

                }

            size--;

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
        } else{
            return false;
        }
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




