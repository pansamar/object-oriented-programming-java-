package ex2_week2;

public class Main {
 
	public static void main(String[] args) {

		Student s1 = new Student("Panos", "iis24105");
		Student s2 = new Student("Babis");
		Student s3 = new Student();
		
		Student s4;
		s4 = new Student("Takis", "ics24105");
		
		s2.setId("iis24106");
		
		System.out.println("Student 1 data:");
		System.out.println(s1.getName());
		System.out.println(s1.getId());
		
		s2.printInfo();
		
		Subject su1 = new Subject("Java");
		
		
	}

}
