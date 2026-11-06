// Display the numbers from 1 to 100, except 13, 
// all of them in the same line, separated with 
// a space. Instead of number 50, you must write 
// "Fifty".

// Version 3: AVOID THIS!!!
// Using "continue" and "break"

public class Numbers1to100c {
    public static void main(String[] args) {
        for (int n=1; n<=200;n++)
        {
            if (n==13)
                continue;  // !!!!!
            else if (n==50)
                System.out.print("Fifty ");
            else
                System.out.print(n + " ");
            
            if (n==100)
                break;    // !!!!!!!!!!!!!!!!!!!
        }
    }
}
