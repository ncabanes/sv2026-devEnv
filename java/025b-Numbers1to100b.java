// Display the numbers from 1 to 100, except 13, 
// all of them in the same line, separated with 
// a space. Instead of number 50, you must write 
// "Fifty".

// Version 2: an alternative way

public class Numbers1to100b {
    
    public static void main(String[] args){
        for (int n=1; n<=100;n++){
            if((n!=13) && (n!=50)){
                System.out.print(n + " ");
            }
            else if (n==50){
                System.out.print("Fifty ");
            }
        }
    }
}
