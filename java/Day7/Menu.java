import java.util.Scanner;

public class Menu {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int sum = 0, temp = num, digits = String.valueOf(num).length();
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        return sum == num;
    }

    // Method to print Fibonacci series
    public static void printFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: " + a + " " + b);
        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
        System.out.println();
    }

    // Method to check if a number is even
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Check Prime Number");
            System.out.println("2. Check Armstrong Number");
            System.out.println("3. Print Fibonacci Series");
            System.out.println("4. Check Even Number");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    int primeNum = scanner.nextInt();
                    if (isPrime(primeNum)) {
                        System.out.println(primeNum + " is a prime number.");
                    } else {
                        System.out.println(primeNum + " is not a prime number.");
                    }
                    break;

                case 2:
                    System.out.print("Enter a number: ");
                    int armstrongNum = scanner.nextInt();
                    if (isArmstrong(armstrongNum)) {
                        System.out.println(armstrongNum + " is an Armstrong number.");
                    } else {
                        System.out.println(armstrongNum + " is not an Armstrong number.");
                    }
                    break;

                case 3:
                    System.out.print("Enter the number of terms in the Fibonacci series: ");
                    int n = scanner.nextInt();
                    printFibonacci(n);
                    break;

                case 4:
                    System.out.print("Enter a number: ");
                    int evenNum = scanner.nextInt();
                    if (isEven(evenNum)) {
                        System.out.println(evenNum + " is an even number.");
                    } else {
                        System.out.println(evenNum + " is not an even number.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}