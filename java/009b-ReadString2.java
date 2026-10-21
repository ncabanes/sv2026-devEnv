// Ask the user for their name and the number 
// of times they want to see it on screen.

// In this second version, you must ask
// for the number first

import java.util.Scanner;

public class ReadString2 {
		
	public static void main(String[] args) {
		String name;
		int times;
		Scanner scanner = new Scanner(System.in);	
		
		System.out.print("How many times? ");
		times = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("Enter your name: ");
		name = scanner.nextLine();
		
		System.out.println("Hi " + name + 
			" I'll soon greet you " + times + " times");
	}
}
