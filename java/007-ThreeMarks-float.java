/*
Ask three user for three marks. 
Display the average of those 3 data.
*/

import java.util.Scanner;

public class ThreeMarks {

	public static void main(String[] args) {
		
		float mark1, mark2, mark3;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your marks: ");
		mark1 = sc.nextFloat();
		mark2 = sc.nextFloat();
		mark3 = sc.nextFloat();
		
		System.out.println("Your average is " +
			(mark1+mark2+mark3) / 3);
	}
}
