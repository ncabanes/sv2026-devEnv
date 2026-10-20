/*
Ask the user for their age. 
Display how old will they be 
in two years time, incrementing 
the variable.
*/

import java.util.Scanner;

public class AgeInTwoYears {

	public static void main(String[] args) {
		
		byte age;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		age = sc.nextByte();
		
		age += 2;
		System.out.println(
			"In two years' time you'll be " +
			age + ".");
	}
}
