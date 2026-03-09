package ex1_week3;

import java.util.ArrayList;

public class Student {

		private String name;
		private String id;
		
		private ArrayList<Subject> myCourses = new ArrayList<Subject>();
		
		public Student(String aname, String anid) {
			name = aname;
			id = anid;
		}
		public Student(String aname) {
			name = aname;
			id = "9999";
		} 
		public Student() {
			name = "No name";
			id = "9999";
		}
		
		public void setId(String anId) {
			id = anId;
		}
		public String getName() {
			return name;
		}
		public String getId() {
			return id;
		}
		public void printInfo() {
			System.out.println("Student's  data:");
			System.out.println(name);
			System.out.println(id);
			System.out.print("Is enroled in:");
			
			for(Subject c: myCourses) {
				System.out.print(c.getName() + " ");
			}	
			System.out.println("");
		}
		public void addCourse(Subject asubject) {
			myCourses.add(asubject);
			asubject.addStudent(this);
		} 
}


