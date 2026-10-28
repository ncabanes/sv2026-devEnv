// "for" loops

/*
Display:

1 to 100, in the same line
10 to 100, with a step of 10
20 down to 1 (descending)
*/

import java.util.Scanner;

public class ForLoops {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for (int i = 10; i <= 100; i+=10) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for (int i = 20; i >= 1; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
