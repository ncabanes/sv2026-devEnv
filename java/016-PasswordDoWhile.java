// Ask the user for their (numeric) password
// This must repeat until the correct password (1234) is entered.
// In this version, you must use "do-while".

import java.util.Scanner;

public class PasswordDoWhile {
	
	public static void main(String[] args) {
		
		int password;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("Enter your password: ");
			password = sc.nextInt();
			if (password != 1234) 
				System.out.print("Wrong Password. ");
		}
		while (password != 1234);
		
		System.out.println("Access granted");
	}
}
