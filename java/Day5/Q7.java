//WAP to check whether a character is vowel or not.
import java.util.Scanner;
public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Character : ");
		char ch = sc.next().charAt(0);
		String result = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
					   ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
				? "The Given Character is a Vowel."
				:"The Given Character is not a Vowel.";
		System.out.print(result);
	}

}
