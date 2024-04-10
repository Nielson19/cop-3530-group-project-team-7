package Shelves;

public interface shelfListInterface {

    public void addProduct(int i, String name, int amount);

    public String stringReport();

    public int size();

    public boolean isEmpty();

    public void removeProduct(int i);

    public void removeAll();

}
