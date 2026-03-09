package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
   
        ArrayList<Student> students = new ArrayList<>();
        
        students.add(new UnderGraduate("Panos",7.8));
        students.add(new PhdStudent("Takis","Anergia"));

        for(Student st: students){
            st.printInfo();
        }
   
   
   
   
   
    }
}