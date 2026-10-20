// Ask the user for two ages, optimizing the space
// Display their sum

import java.util.Scanner;

public class TwoAges {
	public static void main(String[] args) {
		
		byte age1, age2, sumOfAges;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter two ages: ");
		age1 = sc.nextByte();
		age2 = sc.nextByte();
		
		sumOfAges = (byte) (age1 + age2);
		System.out.println(sumOfAges);
	}
}
