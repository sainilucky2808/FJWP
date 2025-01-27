//WAP to check if a person is eligible to vote or not.
import java.util.Scanner;
class Vote{
	public static void main(String[] args)
	{
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter the age of the Person : ");

	int Age = scanner.nextInt();

	String Eligible = Age>=18 ? "Eligible" 
			: "not Eligible";
	System.out.print("The Person is "+Eligible+" for Voting.");
	}
}