// Roman numerals

/*
Ask the user for a number of day (1 to 7).

Display the name of that day (for example, 2 = tuesday).

In this version, you must use "switch".
*/

import java.util.Scanner;

public class Romans {
	public static void main(String[] args) {
		
		byte number;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number (1 to 5) ");
		number = scanner.nextByte();
		
		switch(number) {
			case 1: 
				System.out.println("I");
				break;
			case 2: 
				System.out.println("II");
				break;
			case 3: 
				System.out.println("III");
				break;
			case 4: 
				System.out.println("IV");
				break;
			case 5: 
				System.out.println("V");
				break;
			default:
				System.out.println("Error");
		}
	}
}
