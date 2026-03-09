package week5_ex2;

import java.util.ArrayList;

import javax.swing.*;

public class Input {

	public static void giveInput(ArrayList<Student> students, ArrayList<Course> courses){
		
		boolean more = true;
		while(more) {
			String selection = JOptionPane.showInputDialog("1: Student 2: Graduate student");
			int choise = Integer.parseInt(selection);
			
			String name = JOptionPane.showInputDialog("Name:");
			String id = JOptionPane.showInputDialog("id:");

			String supervisor;
			if(choise == 2) { 
				 supervisor = JOptionPane.showInputDialog("Supervisor name:");

			}
			Student student;
			if(choise == 1) {
				 student = new Student(name,id);
			}
			else {
				student = new GraduateStudent(name,id,supervisor);
			}
			
			String courseName = JOptionPane.showInputDialog("Enter course name:");
			for(Course c: courses) {
				if(c.getName().equals(courseName))
					student.addCourse(c);
			}
			
			students.add(student);
			
			String answer = JOptionPane.showInputDialog("More students? Y/N");
			
			if(answer.equals("N"))
				more = false;
			
		}
		
	}
}
