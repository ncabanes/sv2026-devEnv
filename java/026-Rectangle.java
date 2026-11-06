// Display a rectangle of asterisks, with the size 
// (rows and columns) specified by the user.

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rows, columns;
        
        System.out.print("Rows? ");
        rows = s.nextInt();
        System.out.print("Columns? ");
        columns = s.nextInt();
        
        for (int row = 0; row < rows; row++)
        {
            for (int column = 0; column < columns; column++)
            {
                System.out.print("*");
            }
            System.out.println();
        }       
    }
}
