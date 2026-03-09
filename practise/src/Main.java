import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
    
        Fleet f1 = new Fleet("Rethymno");
        Fleet f2 = new Fleet("Heraclio");

        ElectricalTaxi et1 = new ElectricalTaxi("xyz001", "Panos", 20);
        ElectricalTaxi et2 = new ElectricalTaxi("xyz002", "Nick", 30);

    
        GasolineTaxi gt1 = new GasolineTaxi("xyz003", "Bob", 30, 2.1);
        GasolineTaxi gt2 = new GasolineTaxi("xyz004", "Adam", 35, 2.3);

        f1.storeTaxi(et1);
        f1.storeTaxi(gt2);

        f2.storeTaxi(et2);
        f2.storeTaxi(gt1);

        ArrayList<Fleet> fleets = new ArrayList<>();
        fleets.add(f1);
        fleets.add(f2);

        new GUI(fleets);

    
    }
}
