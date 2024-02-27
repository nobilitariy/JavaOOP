package domen;

/**
 */
public class HotDrink extends Product{
    private String temperatura;


      



    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "HotDrink [" + super.toString()+ "temperatura=" + temperatura + "]";
    }
    

    
}