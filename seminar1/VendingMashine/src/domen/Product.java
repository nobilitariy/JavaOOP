package domen;


public class Product {
    private long id;
    private String name;
    private double price;
    private int pocishn;
    
    public Product(long id, String name, double price, int pocishn) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.pocishn = pocishn;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getPocishn() {
        return pocishn;
    }
    public void setPocishn(int pocishn) {
        this.pocishn = pocishn;
    }
    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + ", pocishn=" + pocishn + "]";
    }
    
}