package com.example;

public class UnderGraduate extends Student {
    private double gpa;

    public UnderGraduate(String name, double gpa){
        super(name);
        this.gpa = gpa;
    }

    public void printInfo(){
        System.out.println("Undergraduate student");
        System.out.println("Name: "+ getName());
        System.out.println("GPA: "+gpa);
    }

}
