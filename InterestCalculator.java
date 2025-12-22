package firstsem;

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        double rate;

        // Determine interest rate based on principal
        if (principal > 10000) {
            rate = 10.0;
        } else if (principal >= 5000) {
            rate = 8.0;
        } else {
            rate = 5.0;
        }

        // Simple Interest Formula: (P * R * T) / 100
        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("\n--- Results ---");
        System.out.println("Applied Interest Rate: " + rate + "%");
        System.out.println("Total Simple Interest: " + simpleInterest);
        
        sc.close();
    }
}