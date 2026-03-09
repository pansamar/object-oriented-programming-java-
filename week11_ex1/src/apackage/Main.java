package apackage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<String> names = new ArrayList<>();
        names.add("Panos");
        names.add("Mary");
        names.add("Nick");
        names.add("Helen");
        names.add("Sofia");

        File namesFile = new File("names.txt");
        try {
            FileWriter writer = new FileWriter(namesFile);
            for(String name: names){
                writer.write(name);
                writer.write(System.lineSeparator());
            }
            writer.close();
            System.out.println("File has been written");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        new GUI();



    }

}
