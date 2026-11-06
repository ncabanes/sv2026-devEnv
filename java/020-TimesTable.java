/* Times table
 * Ask the user for an integer number and display its times table.
 * This must repeat until the user enters a negative number.
 */

import java.util.Scanner;

public class TimesTable {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int table;
        
        do
        {   
            System.out.print("Table: ");
            table=sc.nextInt();
            
            if (table >= 0) {
                for(int i=1; i <= 10; i++) {
                    System.out.println(table + "x" + i + "=" + table*i);
                }
            }
        }
        while(table >= 0);
    }
}
        
