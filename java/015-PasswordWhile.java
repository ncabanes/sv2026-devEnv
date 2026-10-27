// Ask the user for their (numeric) password
// This must repeat until the correct password (1234) is entered.
// You must use "while".

import java.util.Scanner;

public class PasswordWhile {
	
	public static void main(String[] args) {
		
		int password;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your password: ");
		password = sc.nextInt();
		
		while (password != 1234) {
			System.out.print("Wrong Password. Enter your password: ");
			password = sc.nextInt();
		}
		
		System.out.println("Access granted");
	}
}
