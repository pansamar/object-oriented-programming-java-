package apackage;

public class Bulk extends Container {
    private double weight;

    public Bulk(String acode, String adestination, double weight){
        super(acode,adestination);
        this.weight = weight;

    }
    public double getCharge(){
        return 10*weight;
    }
}
