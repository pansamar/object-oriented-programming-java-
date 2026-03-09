package week5_ex1;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Number of soldiers: "+ Soldier.getCounter());
		
		Soldier s1 = new Soldier("VX100");
		Soldier S2 = new Soldier("VX101");
		 
		System.out.println("Number of soldiers: "+ Soldier.getCounter());
		//Εναλλακτικός τρόπος: System.out.println("Number of soldiers: "+ s1.getCounter());

	}

}
