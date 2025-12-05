package firstsem;
import java.util.Scanner;
public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int absoluteValue = Math.abs(number);
        System.out.println("Absolute value of " + number + " is " + absoluteValue);

        // Alternatively, you can use a conditional statement
        int absoluteValueManual = (number < 0) ? -number : number;
        System.out.println("Absolute value of " + number + " is " + absoluteValueManual);

        // Or, using if-else statement
        int absoluteValueIfElse = getAbsoluteValue(number);
        System.out.println("Absolute value of " + number + " is " + absoluteValueIfElse);

        scanner.close();
    }

    public static int getAbsoluteValue(int number) {
        if (number < 0) {
            return -number;
        } else {
            return number;
        } // The error was here: the incorrect character ' ' has been removed
    }
}



