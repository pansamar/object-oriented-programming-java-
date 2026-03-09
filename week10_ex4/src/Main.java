import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws Exception {

        HashMap<String, String> phonebook = new HashMap<>();
       
        phonebook.put("Mary", "2310 615615");
        phonebook.put("Zoe", "2310 616616");
        phonebook.put("Dina","2310 616616");
        phonebook.put("Tatiana", "2310 617617");
   
        System.out.println("Mary's phone is: "+ phonebook.get("Mary"));
   
        for(String name: phonebook.keySet())
            System.out.println(name + ": " + phonebook.get(name));
    
    
    
        }
}
