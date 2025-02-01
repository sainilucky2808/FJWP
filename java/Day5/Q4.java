//WAP to check whether a character is in lower case or upper case.
import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Character : ");
		char ch = sc.next().charAt(0);
		String result = (ch>='A' && ch<='Z') ? "Character is Upper Case.":
			(ch>='a' && ch<='z') ? "Character is Lower Case." : "Enter a Valid Character.";
		System.out.println(result);
		

	}

}
