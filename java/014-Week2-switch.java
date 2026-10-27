// Ask the user for a number of day (1 to 7).

// Display the name of that day (for example, 2 = tuesday).

// In this version, you must use "switch".

import java.util.Scanner;

public class Week2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of the day (1 to 4) ");
		byte dayOfWeek = sc.nextByte();
		
		switch(dayOfWeek) {
			case 1: System.out.println("Monday"); break;
			case 2: System.out.println("Tuesday"); break;
			case 3: System.out.println("Wednesday"); break;
			case 4: System.out.println("Thursday"); break;
			// ...
			default: System.out.println("WTF"); 
		}
	}
}
