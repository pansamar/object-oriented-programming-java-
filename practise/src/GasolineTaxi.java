public class GasolineTaxi extends Taxi{
    private int gasolineFuel;
    private double katanalosi;

    public GasolineTaxi(String number, String driver, int gasolineFuel, double katanalosi){
        super(number, driver);
        this.gasolineFuel = gasolineFuel;
        this.katanalosi = katanalosi;
    }
    public double getAutonomy(){
        return 90*(gasolineFuel/katanalosi);
    }
}
