package ex1_week2;

import java.util.Scanner;

class Product{
	
	private String name;
	private int score;
	private double price;
	
	public Product() {
		name ="" ;
		score = 0;
		price = 1;
	}
	
	public void printData() {
		System.out.println(name + "" +  score + "" +  price);
	}
	
	public void read() {
		Scanner in = new Scanner(System.in);

		System.out.println("Give product name");
		name = in.nextLine();
		
		System.out.println("Give product price");
		price = in.nextDouble();
		
		System.out.println("Give product score");
		score = in.nextInt();
		in.nextLine();
	}
	
	public boolean isBetterThan(Product aproduct) {
		if((score/price)>(aproduct.score/aproduct.price)) {
			return true;
		}
		return false;
	}
	
} 

public class Main {

	public static void main(String[] args) {
		
				Scanner in = new Scanner(System.in);
				
				Product best = new Product();
				
				boolean flag = true;
								
				while(flag) {
				Product current = new Product();
				
				current.read();
				
				if(current.isBetterThan(best)) {
					best = current;
				}
				System.out.println("Continue? 1:YES 2:NO");
				if(in.nextInt()==2) flag = false;
				
				in.nextLine();
					}		
				best.printData();				
			}
}
