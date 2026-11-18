// Leibniz formula for π

import java.util.Scanner;

public class Leibniz {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int terms;
		float numerator, denominator, sign, result;
		
		System.out.print("How many terms? ");
		terms = sc.nextInt();
		
		result = 0;
		numerator = 1;
		denominator = 1;
		sign = 1;
		for (int i = 0; i < terms; i++)
		{
			result += numerator / denominator * sign;
			denominator += 2;
			sign *= -1;
		}
		System.out.println("The estimation of PI is "+
			result*4);
		
	}
}

