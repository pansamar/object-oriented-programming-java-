import java.util.ArrayList;

public abstract class Booking {

    protected int duration;

    
    public Booking (int duration){
        this.duration = duration;
        
    }

    public abstract double getCost();
}
