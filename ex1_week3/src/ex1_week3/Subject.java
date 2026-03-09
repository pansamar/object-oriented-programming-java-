package ex1_week3;

import java.util.ArrayList;

public class Subject {
private String name;
private ArrayList<Student> myStudents = new ArrayList<Student>();;

	public void addStudent(Student astudent) {
		myStudents.add(astudent);
	}
	public void printInformation() {
		System.out.println("Subject name: " + name);
		System.out.println("Enrolled students: " );
		for(Student s: myStudents)
			System.out.println(s.getName());
	}
	public Subject(String aname) {
		name = aname;
	}
	
	public String  getName() {
		return name;
	}
	
}
