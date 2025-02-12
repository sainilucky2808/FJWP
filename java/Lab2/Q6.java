// Q6. WAP to check whether a number is palindrome or no 
// When a  number is equals to its reverse number,then it is a palindrome number.
import java.util.Scanner;
public class Q6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any Number: ");
		int n = sc.nextInt();
		int c = n;
		int r, s=0;
		
		while(n>0) { //121>0, 12>0, 1>0
			r=n%10; // r=1, 2, 1
			s=(s*10)+r; // s = 1, 12, 121
			n=n/10; // 12, 1, 0
		}
		if(c==s) {
			System.out.print("The given Number is a Palindrome Number.");
		}
		else {
			System.out.print("The given Number is not a Palindrome Number.");
		}
		
	}
		
		
}
