package domen;

/**
 */
public class HotDrink extends Product{
    private int temperatura;

    public HotDrink(long id, String name, double price, int pocishn, int temperatura) {
        super(id, name, price, pocishn);
        this.temperatura = temperatura;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "HotDrink [" + super.toString()+ "temperatura=" + temperatura + "]";
    }
    

    
}