// Q7. Wap to check whether a number is Armstrong or not   (do while)
//  N=153
//  1^3+5^3+3^3=153          
import java.util.Scanner;

public class armstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any Number: ");
		int n = sc.nextInt();
		int c = n;
		int rem, arm=0;
		while(n>0) { //153>0, 15>0, 1>0
			rem = n%10; //3, 5, 1
			arm = (rem*rem*rem)+arm; //27, 125+27=152, 1+152=153
			n = n/10;	// 15, 1, 0
		}
		if(c==arm) {
			System.out.print("The given number is an Armstrong Number.");
		}
		else {
			System.out.print("The given number is not an Armstrong Number.");
		}
	}
}