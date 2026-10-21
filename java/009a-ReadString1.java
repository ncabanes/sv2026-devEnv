// Ask the user for their name and the number 
// of times they want to see it on screen.

import java.util.Scanner;

public class ReadString {
		
	public static void main(String[] args) {
		String name;
		int times;
		Scanner scanner = new Scanner(System.in);	
		
		System.out.print("Enter your name: ");
		name = scanner.nextLine();
		System.out.print("How many times? ");
		times = scanner.nextInt();
		
		System.out.println("Hi " + name + 
			" I'll soon greet you " + times + " times");
	}
}
