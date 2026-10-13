// Ask the user for two integer numbers, using Scanner
// Display their sum

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
    
        int a, b;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        a = s.nextInt();
        
        System.out.print("Enter the second number: ");
        b = s.nextInt();
        
        System.out.println("Their sum is: "+ (a+b));
    }
}
