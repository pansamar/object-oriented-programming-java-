import java.util.ArrayList;

public class Fleet {
    private String cityName;

    ArrayList<Taxi> taxiFleet = new ArrayList<>();

    public Fleet(String cityName){
        this.cityName  = cityName;
    }
    public void storeTaxi(Taxi ataxi){
        taxiFleet.add(ataxi);
    }
    public String getCityname(){
        return cityName;
    }
    public int getCount(){
        return taxiFleet.size();
    }
    public double getAutonomy(){
        double total = 0;
        for(Taxi t: taxiFleet)
            total += t.getAutonomy();
        return total;
    }
    public ArrayList<Taxi> geTaxis(){
        return taxiFleet;
    }
}
