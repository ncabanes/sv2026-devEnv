// Ask the user for two integer numbers, using Scanner
// Display their product

import java.util.Scanner;

public class Product {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		
		System.out.print("First number to multiply: ");
		n1 = sc.nextInt();
		System.out.print("Second number to multiply: ");
		n2 = sc.nextInt();
		
		System.out.println("Their product is: ");
		System.out.println(n1*n2);
	}
}
