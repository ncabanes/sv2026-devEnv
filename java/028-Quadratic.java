// Quadratic equations

/*
The program must be able to solve a quadratic equation 
such as Ax² + Bx + C = 0

The user enter the values for A, B and C and the system will answer:

- There is no solution
- There is only one solution (and which one it is)
- There are two solutions (and which ones they are)
*/

import java.util.Scanner;

public class Quadratic {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double a, b, c, discriminant, x1, x2;
		
		System.out.println("Solver fon quadratic equations Ax2 + Bx + C = 0");
		System.out.print("Enter the value for A: ");
		a = s.nextDouble();
		System.out.print("Enter the value for B: ");
		b = s.nextDouble();
		System.out.print("Enter the value for C: ");
		c = s.nextDouble();
		
		discriminant = b*b - 4*a*c;
		if (discriminant < 0) {
			System.out.println("There is no solution");
		}
		else if (discriminant == 0) {
			System.out.println("Unique solution: " + (-b / (2*a)));
		} 
		else {
			x1 = (-b + Math.sqrt(discriminant)) / (2*a);
			x2 = (-b - Math.sqrt(discriminant)) / (2*a);
			System.out.println("Two solutions: "+x1+" and "+x2);
		}
	}
}
