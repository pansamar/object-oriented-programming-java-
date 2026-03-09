package apackage;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        Ship ship1 = new Ship("Aris", 160);
        Ship ship2 = new Ship("Hermes", 300);
        Ship ship3 = new Ship("Hercules", 120);
        Ship ship4 = new Ship("Artemis", 200);

       ArrayList<Ship> ships =  new ArrayList<>();
       ships.add(ship1);
       ships.add(ship2);
       ships.add(ship3);
       ships.add(ship4);
    
        new ContainerFrame(ships);

    }
}
