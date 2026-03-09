import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws Exception {

        Employee e1 = null;

        try{
        File file = new File("employee.ser");
        FileInputStream fInputStream = new FileInputStream(file);
        ObjectInputStream inputStream = new ObjectInputStream(fInputStream);
         e1 = (Employee) inputStream.readObject();
        inputStream.close();
        fInputStream.close();
    }
    catch(ClassNotFoundException exc){
        exc.printStackTrace();

    }
    catch(IOException exc){
        exc.printStackTrace();
    }
    System.out.println("Deserialization performed");
    System.out.println("Employee: "+e1.getName());
    }
}
