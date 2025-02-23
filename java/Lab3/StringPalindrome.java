/*Q9. Check for Palindrome
  Write a function to check if a given string is a palindrome 
  (reads the same forward and backward).
  Example:
  Input: "madam" → Output: true
  Input: "hello" → Output: false*/
import java.util.Scanner;
public class StringPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s = sc.nextLine();
		String rev = "";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev = rev + s.charAt(i);
		}
		if(s.equals(rev)) {
			System.out.println("The given String is Palindrome.");
		}
		else {System.out.println("The given String is not Palindrome.");
		}
	}

}
