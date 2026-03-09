package com.example;

public class PhdStudent extends Student{

    private String thesis;

    public PhdStudent(String name,String thesis ){
        super(name);
        this.thesis = thesis;
    }
    
    public void printInfo(){
        System.out.println("PhD student");
        System.out.println("Name: "+ getName());
        System.out.println("Thesis: "+ thesis);
    }

}
