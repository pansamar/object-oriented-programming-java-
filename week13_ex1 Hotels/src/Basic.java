public class Basic extends Booking{

    public Basic (int duration){
        super(duration);
    }
    public double getCost(){
        return duration * 120;
    }

}
