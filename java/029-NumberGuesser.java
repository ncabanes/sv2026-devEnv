/* 
Guess the hidden number

The user must guess a hidden number from 1 to 100. 
The program will inform them if their guess was 
too high or too low, until they finally find that number.
*/

import java.util.Scanner;

public class NumberGuesser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hidden, attempt;
		
		hidden = 63;
		do {
			System.out.print("Try to find the hidden number (1 to 100): ");
			attempt = sc.nextInt();
			
			if (attempt > hidden)
				System.out.println("Your number is too high");
			else if (attempt < hidden)
				System.out.println("Your number is too low");
		}
		while (attempt != hidden);
		
		System.out.println("Congratulations");
	}
}
