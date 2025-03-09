import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        int number = getNonNegativeInteger();
        long factorial = calculateFactorial(number);
        System.out.println("The factorial of " + number + " is: " + factorial);
    }

    public static int getNonNegativeInteger() {
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.print("Enter a non-negative integer: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a non-negative integer.");
                scanner.next();
            }
            num = scanner.nextInt();
            if (num < 0) {
                System.out.println("Invalid input. Please enter a non-negative integer.");
            }
        } while (num < 0);
        return num;
    }

    public static long calculateFactorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
