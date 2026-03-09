public class Main {
    public static void main(String[] args) {
        
        DataSet ds = new DataSet();

        
        BankAccount ba1 = new BankAccount(1500);
        BankAccount ba2 = new BankAccount(2500);
        BankAccount ba3 = new BankAccount(10000);

        Student s1 = new Student(7.9);
        Student s2 = new Student(6.4);
        Student s3 = new Student(8.5);

        ds.add(ba1);
        ds.add(ba2);
        ds.add(ba3);

        ds.add(s1);
        ds.add(s2);
        ds.add(s3);
        
        System.out.println("Average: "+ ds.calcAverage());
        System.out.println("Max balance: "+ ds.getMax().getMeasure());
        System.out.println("Min balance: "+ ds.getMin().getMeasure());
            
        
    }
}
