import java.util.ArrayList;
import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<String> johnsBooks = new ArrayList<>();
        johnsBooks.add("1984");
        johnsBooks.add("Steven Hawking");

        ArrayList<String> marysBooks = new ArrayList<>();
        marysBooks.add("Nefelim");
        marysBooks.add("Giati maw psekazoun");

        HashMap<String, ArrayList<String>> library = new HashMap<>();

        library.put("John", johnsBooks);
        library.put("Mary", marysBooks);

        for(String name: library.keySet()){
            System.out.println(name + " has borrowed: ");
            for(String bookTitle: library.get(name))
                System.out.println(bookTitle);
        }
    }
}
