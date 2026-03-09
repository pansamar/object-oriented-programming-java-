public class Student implements Measurable{
    
    private double gpa;

    public Student(double gpa){
        this.gpa = gpa;
    }

    public double getMeasure(){
        return gpa;
    }

}
