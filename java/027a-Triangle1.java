// Display a triangle of asterisks, with the size 
// specified by the user, as in this example:
// 
// *****
// ****
// ***
// **
// *

// Version 1: "calculating" the size of each row

import java.util.Scanner;

public class Triangle1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size;
        
        System.out.print("Size? ");
        size = s.nextInt();
        
        for (int row = 0; row < size; row++)
        {
            for (int column = 0; column < size-row; column++)
            {
                System.out.print("*");
            }
            System.out.println();
        }       
    }
}
