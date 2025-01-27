// WAP to check whether an year is leap or not?
import java.util.Scanner;

class LeapYear{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);

	System.out.print("Enter the Year : ");
	int Year=sc.nextInt();

	String LYear = ((Year % 4 == 0 && Year % 100 != 0) || (Year % 400 == 0)) 			? Year+" is a leap Year." 
			: Year+" is not a leap Year.";

	System.out.println(LYear);
	}
} 
