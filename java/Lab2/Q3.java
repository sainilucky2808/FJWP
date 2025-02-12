// Q3. WAP to calculate the number of digits in a number           (while)
// 3484  =  4 digit
import java.util.Scanner;
public class Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any positive number: ");
		int A = sc.nextInt();
		int count = 0;
		
		while(A>0) {
			A=A/10;
			count++;
		}
		System.out.print("No. of digits in the given Number: "+count);
		
		
	}

}
