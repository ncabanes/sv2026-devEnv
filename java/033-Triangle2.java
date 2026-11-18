/*
Review for the exam, exercise 5

5. Draw a right-aligned growing triangle, with the size indicated by the user 
and with the symbol chosen by the user.

For example, for symbol “*” and size 4 it should draw something like:

   *
  **
 ***
****

*/

import java.util.Scanner;

public class Triangle2 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size, cols, spaces;
		String symbol;
		
		
		System.out.print("Enter the size of the triangle: ");
		size = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the symbol for the triangle: ");
		symbol = sc.nextLine();
		
		cols = 1;
		spaces = size -1;
		for (int row = 0; row < size; row++) {
			for (int col = 0; col < spaces; col++) {
				System.out.print(" ");
			}
			for (int col = 0; col < cols; col++) {
				System.out.print(symbol);
			}
			System.out.println();
			spaces--;
			cols++;
		}
		
	}
}

