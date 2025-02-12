// Q8. WAP to check whether a number is prime or not.
import java.util.Scanner;
public class Q8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any Number: ");
		int n = sc.nextInt();
		int count=0;
		
		for (int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.print("The given Number is a Prime Number.");
		}
		else {
			System.out.print("The given Number is not a Prime Number.");
		}
		
	}

}
