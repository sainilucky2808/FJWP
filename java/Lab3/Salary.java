/*Q2. Write a program to calculate the gross salary of a group of
employees. Basic salary should be taken from the user.
If the basic salary is greater than 15000 ,HRA=20% and DA=60% will be
given, else HRA=3000 and DA 70% will be given to the employee.
Note:Input of basic salary will be taken from the keyboard. After calculating
the salary of one employee, the program will ask for the user's choice as
int. If “-1” is entered then the loop will continue and the loop will exit for
other int inputs.*/
import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Salary salaryCalculator = new Salary(); // Create an instance of Salary
        salaryCalculator.menu(); // Call the menu function
    }

    public void menu() {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Enter Basic Salary: ");
            int basicSalary = sc.nextInt();
            calculateSalary(basicSalary); // Calculate salary based on user input

            System.out.println("Enter -1 to continue or any other integer to exit: ");
            choice = sc.nextInt(); // Get user choice
        } while (choice == -1); // Continue if user enters -1

        sc.close(); // Close the scanner
    }

    public void calculateSalary(int basicSalary) {
        double HRA;
        double DA;

        if (basicSalary > 15000) {
            HRA = 0.20 * basicSalary; // 20% of basic salary
            DA = 0.60 * basicSalary; // 60% of basic salary
        } else {
            HRA = 3000; // Fixed HRA
            DA = 0.70 * basicSalary; // 70% of basic salary
        }

        double totalSalary = basicSalary + HRA + DA; // Total salary calculation

        // Display the results
        System.out.println("House Rent Allowance = " + HRA);
        System.out.println("Dearness Allowance = " + DA);
        System.out.println("Total Salary of Employee = " + totalSalary);
    }
}