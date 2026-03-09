public abstract class Taxi {
    private String number;
    private String driver;

    private static int count = 0;

    public Taxi(String number, String driver){
        this.number = number;
        this.driver = driver;
        count++;
    }
    public abstract double getAutonomy();
    public int getCount(){
        return count;
    }
    public String getNumber(){
        return number;
    }
    public String getDriver(){
        return driver;
    }
}
