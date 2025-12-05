package firstsem;
import java.util.Scanner;
public class TrulyGreatNum {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        // The logic checks if either a or b is 6, their sum is 6, or their absolute difference is 6.
        boolean result = (a == 6 || b == 6 || (a + b) == 6 || Math.abs(a - b) == 6);
        
        // This line now prints the value of the 'result' variable, not the string "result".
        System.out.println(result);
        
        sc.close(); // It's good practice to close the Scanner.
    }
}