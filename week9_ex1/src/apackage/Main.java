package apackage;

import java.util.*;

//Για να γίνουν κατανοητά τα παραδείγματα πρέπει κάθε κομμάτι που βρίσκεται κάτω από τα εισαγωγικά σχόλια να εκτελείται μόνο του

public class Main {
public static void main(String[] args) {
    //Υλοποίηση συνδεδεμένης λίστας
    LinkedList<String> list = new LinkedList<>();
    System.out.println("Linked list");

    list.add("Panos");
    list.add("Nick");
    list.add("Sofia");

    Iterator<String> iter = list.iterator();

    for(String name: list){
        System.out.println(name);
    } 
    System.out.println(" ");

    /* Εναλλακτικός τρόπος
    while(iter.hasNext()){
        String name = iter.next();
        System.out.println(name);
    }
    */
    
    while(iter.hasNext()){
        String name = iter.next();
        if(name.equals("Nick"))
            iter.remove();
    }
    
    System.out.println("Linked list again");
    for(String name: list){
        System.out.println(name);
    }
    System.out.println(" ");

    //Υλοποίηση συνόλων
    HashSet<String> set = new HashSet<>();
    System.out.println("Sets");

    set.add("John");
    set.add("Helen");
    set.add("John");

    for(String name: set){
        System.out.println(name);
    }
    System.out.println(" ");

    //Υλοποίηση ArrayList
    Collection<String> list2 = new ArrayList<>();
    System.out.println("Arraylist ");

    list2.add("Zoe");
    list2.add("Adam");
    list2.add("Mary");
    list2.add("Zoe");

    for(String name: list2){
        System.out.println(name);
    }
    System.out.println(" ");

    Collection<String> set2 = new HashSet<>(list2);
    System.out.println("Arraylist converted to set");

    for(String name:set2){
        System.out.println(name);
    }    
    System.out.println(" ");

    Collection<String> seta = new HashSet<>();
    Collection<String> setb = new HashSet<>();
    seta.add("a");
    seta.add("b");
    setb.add("b");
    seta.add("c");
    seta.add("d");
    setb.add("d");
    seta.add("e");

    //returns true if setb is subset of seta
    if(seta.contains(setb))
         System.out.println("set b is a subset of set a");
    else
        System.out.println("set b isn't a subset of set a");

    //returns the union of thw two sets
    seta.addAll(setb);
    System.out.println("---Union---");
    for(String s:seta)
        System.out.println(s);

    //returns the intesection of seta and setb
    seta.retainAll(setb);
    System.out.println("---Intersection---");
    for(String s: seta)
        System.out.println(s);

    //return the difference of seta and setb
    seta.add("x");
    seta.removeAll(setb);
    System.out.println("---Difference---");
    for(String s: seta)
        System.out.println(s);

    System.out.println(" ");

    //Υλοποίηση δέντρων
    Collection<String> treeSet = new TreeSet<>();
    System.out.println("Treeset");

    treeSet.add("Amanda");
    treeSet.add("Olga");
    treeSet.add("Eua");
    treeSet.add("Pepi");
    treeSet.add("Aphrodite");

    for(String s: treeSet)
        System.out.println(s);

    BankAccount b1 = new BankAccount("002", 1000, "Panagiotis");
    BankAccount b2 = new BankAccount("003", 1500, "Olga");
    BankAccount b3 = new BankAccount("001", 2000, "Sophia");

    Collection<BankAccount> treeSet2 = new TreeSet<BankAccount>(new AcountNameComparator());
    treeSet2.add(b1);
    treeSet2.add(b2);
    treeSet2.add(b3);

    for(BankAccount b: treeSet2)
        System.out.println(b.getCode() + b.getBalance() + b.getName());

}

class BankAccount {
    private String code;
    private double balance;
    private String name;

    public BankAccount(String code, double balance, String name){
        this.code = code;
        this.balance = balance;
        this.name = name;
    }
    
    public String getCode(){
        return code;
    }
    public double getBalance(){
        return balance;
    }
    public String getName(){
        return name;
    }
}

class AcountCodeComparator implements Comparator<BankAccount>{
    public int compare(BankAccount acc1, BankAccount acc2){
        String code1 = acc1.getCode();
        String code2 = acc2.getCode();
        return code1.compareTo(code2);
    }
}

class AcountNameComparator implements Comparator<BankAccount>{
    public int compare(BankAccount acc1, BankAccount acc2){
        String name1 = acc1.getName();
        String name2 = acc2.getName();
        return name1.compareTo(name2);
    }
}

}
