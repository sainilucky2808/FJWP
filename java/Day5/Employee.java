// WAP to check the experience of an employee, if exp is greater than 20 years then calculate bonus = 20% salary, else calculate bonus = 10% of salary.
import java.util.Scanner;
class Employee{
	public static void main(String[] args)
	{
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter the Salary of the Employee : ");
	
	int Salary = scanner.nextInt();
	System.out.print("Enter the Experience years of an Employee : ");
	int Experience = scanner.nextInt();

	int Bonus = Experience>=20 ? 20*Salary/100 : 10*Salary/100;
	System.out.println("The Calculated Bonus is : "+Bonus);
	}
}