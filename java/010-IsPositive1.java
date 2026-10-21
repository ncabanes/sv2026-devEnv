/*
Ask the user for an integer number.

Answer them if it is a positive number 
or not, using two "if" statements.
*/

import java.util.Scanner;

public class IsPositive {
		
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n;
		
		System.out.print("Which number? ");
		n = scanner.nextInt();
		
		if (n > 0) {
			System.out.println("Positive");
		}
		if (n <= 0) {
			System.out.println("Not positive");
		}
	}
}
