// Write a program to calculate the factorial of a number using recursion.
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any Number: ");
		int num = sc.nextInt();
		Factorial obj = new Factorial();
		int result = obj.fact(num);
		System.out.println("Factorial of the Number "+num+" is: "+result);
		}
		int fact(int num)
		{
			if(num==1)
				return 1;
			else
				return num*fact(num-1);
		}

}
