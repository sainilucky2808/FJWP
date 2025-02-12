// Q12. WAP to reverse a string and check whether it is Palindrome or not.
import java.util.Scanner;
public class Q12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: "); // MADAM
		String str = sc.next(); // str = MADAM
		String org_str = str;   // org_str = MADAM
		String rev = "";
		int len = str.length(); // len = 5
		
		for(int i=len-1;i>=0;i--) { // i=5-1=4,3,2,1,0
			rev = rev+str.charAt(i); // charAt(4)=M+A+D+A+M=MADAM
		}
		if(org_str.equals(rev)) {
			System.out.print(org_str+" is a Palindrome String.");
		}
		else {
			System.out.print(org_str+" is not a Palindrome String.");
		}
		
	}

}
