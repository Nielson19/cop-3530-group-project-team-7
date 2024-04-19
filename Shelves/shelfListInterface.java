package Shelves;

public interface shelfListInterface {

    public void addProduct(int location, int id, String name, int amount);

    public String stringReport();

    public int size();

    public boolean isEmpty();

    public void removeProduct(String name, int amount);

    public Object findProduct(String name);

    public void removeAll();



}
