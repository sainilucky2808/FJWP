// WAP to print  even numbers(input number of elements from user).
// Enter number of elements : 5
// 2  4 6 8 10
import java.util.Scanner;

public class EvenNum2 {
		public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Elements: ");
		int n = sc.nextInt();
		System.out.print("First "+n+" Even Numbers are: ");
		
		for (int i=1; i<=n; i++) {
			System.out.print(2*i+" ");
		}
	}
}



