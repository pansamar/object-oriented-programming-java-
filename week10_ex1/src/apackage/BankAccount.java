package apackage;

public class BankAccount {
    private double balance;
    private String code;

    public BankAccount(double balance, String code){
        this.balance = balance;
        this.code = code;
    }

    public double getBalance(){
        return balance;
    }
    public String getCode(){
        return code;
    }
    public boolean equals(Object other){
        BankAccount otherAcc = (BankAccount) other;
        return otherAcc.getCode().equals(this.getCode());
    }
    public int hashCode(){
        return code.hashCode();
    }

}
