// Ask the user for two integer numbers and answer 
// "Both are positive", "One is positive" or 
// "None is positive", depending on the numbers entered.

import java.util.Scanner;

public class Positive {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number ");
		int n1 = sc.nextInt();
		System.out.print("Enter another number ");
		int n2 = sc.nextInt();
		

		if (n1 > 0 && n2 > 0) {
			System.out.println("Both are positive");
		}
		else if (n1 > 0 || n2 > 0) {
			System.out.println("One is positive");
		}
		else {
			System.out.println("None is positive");
		}
		
	}
	
}
