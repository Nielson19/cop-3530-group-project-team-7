package Shelves;

public interface shelfListInterface {

    public void addProduct(int location, String name, int amount);

    public String stringReport();

    public int size();

    public boolean isEmpty();

    public void removeProduct(int location, int amount);

    public Object findProduct(String name);

    public void removeAll();

    public void move(int location, int target);

}
