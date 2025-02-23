/*Q3. Write a program to count and print the total number of odd and even
numbers from user inputs. Program will ask for user inputs in a loop. Loop
will terminate if -1 is entered as input.*/
import java.util.Scanner;

public class OddEvenCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int evenCount = 0; // Counter for even numbers
        int oddCount = 0;  // Counter for odd numbers
        
        System.out.println("Enter numbers to count odd and even numbers. Enter -1 to stop.");

        while (true) {
            System.out.print("Enter a number: ");
            int number = sc.nextInt(); // Read user input
            
            if (number == -1) {
                break; // Exit the loop if -1 is entered
            }
            
            // Check if the number is even or odd
            if (number % 2 == 0) {
                evenCount++; // Increment even count
            } else {
                oddCount++; // Increment odd count
            }
        }
        
        // Print the results
        System.out.println("Total even numbers: " + evenCount);
        System.out.println("Total odd numbers: " + oddCount);
        
        sc.close(); // Close the scanner
    }
}
