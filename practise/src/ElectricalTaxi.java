public class ElectricalTaxi extends Taxi{
    private int numOfBatteries;

    public ElectricalTaxi(String number, String driver,int numOfBatteries){
        super(number, driver);
        this.numOfBatteries = numOfBatteries;
    }
    public double getAutonomy(){
        return 70*numOfBatteries;
    }

}
