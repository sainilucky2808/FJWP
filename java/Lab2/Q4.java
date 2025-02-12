// Q4. WAP to calculate the power of a variable if the number and exponent value is given 
// by the user ( do while)  eg. 2^3=8
import java.util.Scanner;
public class Q4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: " );
		int num = sc.nextInt();
		System.out.print("Enter the exponent of the number: ");
		int power = sc.nextInt();
		int result=1;
		
		do {
			result=num*result;
			power--;
		}
		while(power>0);
		
		System.out.println("The result is: "+result);
		
	}

}
