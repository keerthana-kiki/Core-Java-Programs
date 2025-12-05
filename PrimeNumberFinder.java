package firstsem;

import java.util.Scanner;

public class PrimeNumberFinder {
	public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

	public static void primeNumberFinder(int limit) {
        System.out.println("Prime numbers up to " + limit + ":");
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the upper limit for finding prime numbers: ");
        int limit = scanner.nextInt();

        primeNumberFinder(limit);

	}

}
