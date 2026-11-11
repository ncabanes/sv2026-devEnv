/* 
Guess the hidden number

The user must guess a hidden number from 1 to 100. 
The program will inform them if their guess was 
too high or too low, until they finally find that number.

In this second version, the hidden number will be generated 
randomly, and the user will hace only 7 attempts.
*/

// Guess the hidden number

import java.util.Scanner;
import java.util.Random;

public class NumberGuesser2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hidden, attempt;
		int remainingAttempts = 7;
		
		Random generator = new Random();
		hidden = generator.nextInt(100)+1;
		do {
			System.out.print("Try to find the hidden number (1 to 100): ");
			attempt = sc.nextInt();
			remainingAttempts --;
			
			if (attempt > hidden)
				System.out.println("Your number is too high. Remaining: "+remainingAttempts);
			else if (attempt < hidden)
				System.out.println("Your number is too low. Remaining: "+remainingAttempts);
		}
		while ((attempt != hidden) && (remainingAttempts > 0));
		
		if (attempt == hidden) {
			System.out.println("Congratulations");
		}
		else {
			System.out.println("Pity. The hidden number was "+hidden);
		}
	}
}
