/*
Review for the exam, exercise 4

4. Ask the user for an integer. Then, ask for 5 other integers, and for each of 
them, you must say whether it is a multiple of the first one or not.

For example, if the initial number is 4 and the five test numbers are 12, 11, 
16, 13, 100, the answer should be “Yes No Yes No Yes” (on the same line or on 
separate lines).
*/

import java.util.Scanner;

public class Multiples {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int amount = 5;
		int firstNumber, currentNumber;
		
		System.out.print("Enter the first number: ");
		firstNumber = sc.nextInt();
		for (int i = 0; i < amount; i++)
		{
			System.out.print("Enter a number to compare: ");
			currentNumber = sc.nextInt();
			if (currentNumber % firstNumber == 0) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
		
		
	}
}

