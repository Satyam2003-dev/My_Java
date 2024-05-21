package inheritance.bakery;

public class BirthdayCake extends Cake{

    private int candles;

    public BirthdayCake(){
        super("chocolate");
    }

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }
}

