/* Prepare a program to calculate change, as in this example:

Price? 28
Paid? 100
Change: 50 10 10 1 1

(We'll only use coins/tickets with values: 50, 10, 1)
*/

import java.util.Scanner;

public class Change {
	
	public static void main(String[] args) {
		
		int price, paid, change;
		Scanner sc = new Scanner(System.in);

		System.out.print("Price? ");
		price = sc.nextInt();
		
		System.out.print("Paid? ");
		paid = sc.nextInt();
		
		change = paid - price;
		
		System.out.print("Change: ");
		while (change >= 50) {
			System.out.print("50 ");
			change -= 50;
		}
		while (change >= 10) {
			System.out.print("10 ");
			change -= 10;
		}
		while (change >= 1) {
			System.out.print("1 ");
			change -= 1;
		}
	}
}
