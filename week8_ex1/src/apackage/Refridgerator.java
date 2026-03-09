package apackage;

public class Refridgerator extends Container{
    private double power;

    public Refridgerator(String acode, String adestination, double power){
        super(acode,adestination);
        this.power = power;
    }
    public double getCharge(){
        return 2000*power;

    }
   










}
