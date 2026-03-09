package apackage;

import java.util.ArrayList;

public class Ship {

    private String name;
    private int capacity;
    private ArrayList<Container> containers = new ArrayList<>();

    public Ship(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
    }
    public void addContainer(Container aContainer){
        if(containers.size() > capacity )
            System.out.println("Full ship");
        else
            containers.add(aContainer);
    }
    public double getTotalCharge(){
        double total = 0;
        for(Container c: containers){
           total += c.getCharge();
        }
        return total;
    }
    public String getName(){
        return name;
    }
}
