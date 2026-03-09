package ex2_week2;

public class Student {
	private String name;
	private String id;
	
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
	}
}
