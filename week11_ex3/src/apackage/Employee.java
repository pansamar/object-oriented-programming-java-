package apackage;
import java.io.Serializable;

public class Employee implements Serializable {
    private String name;
    private Company employer;

    public Employee (String name){
        this.name = name;
    }
    public String getInfo(){
        return name + ", "+ employer.getTitle();
    }
    public void setCompany(Company c){
        employer  = c;
    }
}
