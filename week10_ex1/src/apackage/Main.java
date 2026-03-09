package apackage;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        
        BankAccount ba1 = new BankAccount(1500, "001");
        BankAccount ba2 = new BankAccount(1500, "001");

        HashSet<BankAccount> set = new HashSet<>();
        set.add(ba1);
        set.add(ba2);

        for(BankAccount b: set)
            System.out.println(b.getCode() +" , "+ b.getBalance());




    }
}
