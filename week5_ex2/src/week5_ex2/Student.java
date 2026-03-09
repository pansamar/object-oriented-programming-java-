package week5_ex2;

import java.util.ArrayList;

public class Student {

	private String name;
	private String id;
	
	private ArrayList<Course> courses = new ArrayList<Course>();
	
	public Student(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	public void addCourse(Course aCourse) {
		courses.add(aCourse);
	}
	
	public void printInfo() {
		System.out.println("Name: "+name);
		System.out.println("Id: "+id);
		for(Course c: courses) {
			System.out.print(c.getName() + " ");
			System.out.println(c.getCredits() + " ECTS");
			
		}

	}
	
	
}
 