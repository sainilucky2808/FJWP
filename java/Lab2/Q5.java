// Q5  : WAP to reverse digits of a number like 1243   will become 3421. (for)
import java.util.Scanner;
public class Q5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any Number: ");
		int rev = sc.nextInt();
		int res;
		System.out.print("The Reverse of the Number is: ");
		
		while(rev>0) {
			res = rev%10;
			System.out.print(res);
			rev = rev/10;
		}
	}

}
