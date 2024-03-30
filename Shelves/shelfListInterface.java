package Shelves;

public interface shelfListInterface {

    public Object getProduct(int i);

    public String stringReport();

    public int size();

    public boolean isEmpty();

    public void addProduct(int i, Object product, int amount);

    public void removeProduct(int i, Object product, int amount);

    public int findProduct(Object product);

    public void removeAll();

}
