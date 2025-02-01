//WAP to check whether a number is odd or even.
import java.util.Scanner;
public class Q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();
		String result = num%2==0 ? "The Number "+num+" is an even number." 
					: "The Number "+num+" is an odd number.";
		System.out.print(result);
		

	}

}
