import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String arg[]){

        ArrayList<String> names = new ArrayList<>();
        names.add("Panos");
        names.add("Bob");
        names.add("Helen");
        names.add("Zoe");
        names.add("Mary");

        System.out.println("---Sorted---");
        Collections.sort(names);
        System.out.println(names);

        System.out.println("---Shuffle---");
        Collections.shuffle(names);
        System.out.println(names);

        System.out.println("---Reverse---");
        Collections.reverse(names);
        System.out.println(names);
     
        System.out.println("---Swap---");
        Collections.swap(names, 2, 3);
        System.out.println(names);

        System.out.println("---Frequence---");
        names.add("Mary");
        names.add("Mary");
        int freq = Collections.frequency(names, "Mary");
        System.out.println("Frequency of Mary is: "+freq);

        System.out.println("---Max and min---");
        String maX = Collections.max(names);
        String miN = Collections.min(names);
        System.out.println("Max: "+maX + " Min: "+miN);


    }
}
