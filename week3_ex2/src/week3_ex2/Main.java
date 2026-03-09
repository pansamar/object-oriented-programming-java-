package week3_ex2;

public class Main {

	public static void main(String[] args) {
		TimeStamp t1 = new TimeStamp(23,15,40);
		t1.printTime();
		
		t1.increaseHour();
		t1.increaseHour();
		
		t1.printTime();
	}

}
