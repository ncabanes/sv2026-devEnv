// Ask the user for the radius of a circumference.
// Display its length (l  = 2 * PI * r). You must
// define a constant for the value of PI.

import java.util.Scanner;

public class Circumference {
	
	static final double PI = 3.1415926535;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double radius, length;
		
		System.out.print("Enter the radius: ");
		radius = sc.nextDouble();
		
		length = 2 * PI * radius;
		System.out.println("The length of the circumference is "+
			length);
	}
}
