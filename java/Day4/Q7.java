// Write a program to find the percentage of marks. Input marks and Total marks.
import java.util.Scanner;
class Q7{
	public static void main(String[] args){

	int A = 500; // Total Marks
	System.out.println("Total Marks = "+A);
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter Obtained Marks = ");
	int B = scanner.nextInt();

	float C = (float) B*100/A;
	System.out.println("Percentage of Obtained and Total Marks is : "+C+"%");
	}
}
	