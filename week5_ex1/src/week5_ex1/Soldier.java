package week5_ex1;

public class Soldier {
	
	private String id;
	
	private static int counter = 0; // ιδιότητα είναι static έτσι ώστε κάθε φορά που δημιουργείται στρατιώτης να ενημερώνονται όλοι οι στρατιώτες για τον αριθμό τους
	
	public Soldier(String id) {
		this.id = id;
		counter++;
	} 
	public static int getCounter() {
		return counter;
	}
	
}
