// Ask the user for a number of day (1 to 7).

// Display the name of that day (for example, 2 = tuesday).

import java.util.Scanner;

public class Week {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of the day (1 to 4) ");
        byte dayOfWeek = sc.nextByte();
        
        if (dayOfWeek == 1) {
            System.out.println("Monday");
        }
        else if (dayOfWeek == 2) {
            System.out.println("Tuesday");
        }
        else if (dayOfWeek == 3) {
            System.out.println("Wednesday");
        }
        else if (dayOfWeek == 4) {
            System.out.println("Thursday");
        }
        // ...
        else {
            System.out.println("Error");
        }
    }
}
