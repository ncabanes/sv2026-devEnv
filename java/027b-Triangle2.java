// Display a triangle of asterisks, with the size 
// specified by the user, as in this example:
// 
// *****
// ****
// ***
// **
// *

// Version 2: with an extra variable, to simplify logic

import java.util.Scanner;

public class Triangle2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size, rows, columns;
        
        System.out.print("Size? ");
        size = s.nextInt();
        rows = size;
        columns = size;
        
        for (int row = 0; row < rows; row++)
        {
            for (int column = 0; column < columns; column++)
            {
                System.out.print("*");
            }
            System.out.println();
            columns --;
        }       
    }
}
