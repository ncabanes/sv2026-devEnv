/*
Ask the user for an integer number.

Answer them if it is a positive number 
or not, using "if" and "else".
*/

import java.util.Scanner;

public class IsPositive2 {
		
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n;
		
		System.out.print("Which number? ");
		n = scanner.nextInt();
		
		if (n > 0) {
			System.out.println("Positive");
		}
		else {
			System.out.println("Not positive");
		}
	}
}
