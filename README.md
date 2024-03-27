# Group 7: Inventory Management Project

Team Members: **Daniel Escobar, Bielky Ruiz, Luisana Barajas**

Project Outline: 

We will be implementing two Data Structures: Hashtable and LinkedList to create an Inventory Management Project.

The Hashtable will store the aisles of the supermarket while the LinkedList store the scanning number of different products within each aisle. If the user inputs a specific scanning number, they will retrieve data of name and quantity in stock of that specific product. 

For example:

User inputs 65
Computer retrieves "Product Found: Pasta, 17 in-stock" 

In case the product is out of stock, it will be deleted from the LinkedList

As of March 27th, we are creating the pseudocode. We will have the following files:

1. Product Class
    - Purpose: will store attributes of a product in the inventory
    - Attributes: scanning number, name of product and quantity left in stock
    - Methods: constructors, to get and set attributes
2. Inventory Management System 
    - Purpose: manages the aisles and products within the supermarketing inventory 
    - Attributes: aisles and linkedlist (products)
    - Methods: add a product, find the product by the scanning number, update product quantity and remove product 
4. Main Class



To be considered:
- LinkedList will allow efficient insertion and deletion
- Can we speed up product lookup? 
- How will we be handling out-of-stock products?
- Can we identify products low in stock? 
- will there be a user inferface of web, command-line? 

Sketched notes from first meeting: 

