// Q13. Wap to count the number of characters in a string.
import java.util.Scanner;
public class Q13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = sc.next();
		int len = str.length();
		System.out.print("The number of Characters in the given String are: "+len);
	}

}
