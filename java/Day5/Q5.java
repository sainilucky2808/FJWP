// WAP to check whether a number is negative, positive or zero. 
import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Integer: ");
		int Num = sc.nextInt();
		String result = (Num<0) ? "The Given Number is Negative." :
				(Num==0) ? "The Given Number is Zero." : "The Given Number is Positive.";
		System.out.print(result);

	}

}
