public class AllInclusive extends Booking {

    private int mealsPerDay;

    public AllInclusive(int duration, int mealsPerDay){
        super(duration);
        this.mealsPerDay = mealsPerDay;
    }

    public double getCost(){
        return duration * (120 + mealsPerDay * 30);
    }
}
