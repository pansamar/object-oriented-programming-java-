package apackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializationDemo {

    private ArrayList<Employee> employees = new ArrayList<>();

    public SerializationDemo(){
        Company c1 = new Company("Coca Cola");
        Company c2 = new Company("Pepsi");

        Employee e1 = new Employee("John");
        Employee e2 = new Employee("Bob");
        Employee e3 = new Employee("Panos");

        e1.setCompany(c1);
        e2.setCompany(c2);
        e3.setCompany(c2);

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

    serializing();

    ArrayList<Employee> employeesFromFile = deserializing();

    for(Employee e: employees)
        System.out.println("Name: "+e.getInfo());
    }

    public void serializing(){
        try{
            FileOutputStream fileOut = new FileOutputStream("employee...");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(employees);
            out.close();
            fileOut.close();
        }
        catch(IOException i){
            i.printStackTrace();
        }
    }
    public ArrayList<Employee> deserializing(){
        try{
            FileInputStream fileIn = new FileInputStream("employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            ArrayList<Employee> employees = (ArrayList<Employee>) in.readObject();
            in.close();
            fileIn.close();
        }
        catch(ClassNotFoundException c){
            c.printStackTrace();
        }
        finally{
            System.out.println("Deserialization attempted...");
            return employees;
        }
    }
}
