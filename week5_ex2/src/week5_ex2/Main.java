package week5_ex2;

import java.util.ArrayList;

public class Main { 

	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<Student>();

		/* 	Η πρώτη φάση της άσκησης, δεν χρειάζεται άλλο
		Student s1 = new Student("Panos", "iis24105");
		
		Course c1 = new Course("Java", 5);
		Course c2 = new Course("Python", 5);
		
		s1.addCourse(c1);
		s1.addCourse(c2);
		
		s1.printInfo();
		
		GraduateStudent gs1 = new GraduateStudent("Takis", "iis21105", "Chatzigeorgiou");
		gs1.addCourse(c1);
		gs1.addCourse(c2);
		
		gs1.printInfo();
		*/ 
		Course c1 = new Course("Java", 5);
		Course c2 = new Course("Python", 5);
		ArrayList<Course> courses = new ArrayList<Course>();
		
		courses.add(c1);
		courses.add(c2);
		
		
		Input.giveInput(students, courses);
		
		for(Student s: students)
			s.printInfo();
		
		
	}

}
