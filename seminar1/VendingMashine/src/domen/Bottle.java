package domen;

public class Bottle extends Product{
    private double volue;

    public Bottle(long id, String name, double price, int pocishn, double volue) {
        super(id, name, price, pocishn);
        this.volue = volue;
    }

    public double getVolue() {
        return volue;
    }

    public void setVolue(double volue) {
        this.volue = volue;
    }

    @Override
    public String toString() {
        return "Bottle [" + super.toString() +  "volue=" + volue + "]";
    }
    
    
}
