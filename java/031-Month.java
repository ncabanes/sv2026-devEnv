/*
Review for the exam, exercise 3

3. Create a program that asks the user for a month number (from 1 to 12) and 
responds with the name of the month and how many days it has in a non-leap 
year. (Note: Months 1, 3, 5, 7, 8, 10, and 12 have 31 days; months 4, 6, 9, and 
11 have 30 days; month 2 has 28 days).

You must use a “switch” command for the month name and an “if” command for the 
number of days. It must repeat in case an invalid month number is written (less 
than 1 or greater than 12).

For example, if the user enters the number 3, your program must respond “March, 
31 days”.
*/

import java.util.Scanner;

public class Month {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numberOfMonth = 5;
		
		do {
			System.out.print("Enter the number of the month (1-12): ");
			numberOfMonth = sc.nextInt();
		} while (numberOfMonth < 1 || numberOfMonth > 12);
		
		switch(numberOfMonth) {
			case 1: System.out.print("January"); break;
			case 2: System.out.print("February"); break;
			case 3: System.out.print("March"); break;
			case 4: System.out.print("April"); break;
			case 5: System.out.print("May"); break;
			case 6: System.out.print("June"); break;
			case 7: System.out.print("July"); break;
			case 8: System.out.print("August"); break;
			case 9: System.out.print("September"); break;
			case 10: System.out.print("October"); break;
			case 11: System.out.print("November"); break;
			case 12: System.out.print("December"); break;
		}
		System.out.print(", ");
		
		if ((numberOfMonth == 1) 
				|| (numberOfMonth == 3) 
				|| (numberOfMonth == 5) 
				|| (numberOfMonth == 7) 
				|| (numberOfMonth == 8) 
				|| (numberOfMonth == 10) 
				|| (numberOfMonth == 12) ) {
			System.out.print("31");
		} 
		else if (numberOfMonth == 2) {
			System.out.print("28");
		} 
		else System.out.print("30");
		
		System.out.println(" days");
	}
}

