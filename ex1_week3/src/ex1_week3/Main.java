package ex1_week3;

public class Main {
 
	public static void main(String[] args) {

		Student s1 = new Student("Panos", "iis24105");
		Student s2 = new Student("Takis", "ics24105");
		
		
		Subject c1 = new Subject("Java");
		
		s1.addCourse(c1);
		s2.addCourse(c1);
		
		Subject c2 = new Subject("Python");
		s1.addCourse(c2);

		s1.printInfo();
		c1.printInformation();
	}

}
