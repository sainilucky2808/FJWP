//WAP to check whether a character is alphabet, number or a special character.
import java.util.Scanner;
public class Q2{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Character: ");
		char ch = sc.next().charAt(0);
		String result = (ch>='A' && ch<='Z' || ch>='a' && ch<='z')? "The Character "+ch+" is an Alphabet."
				: ( ch>='0' && ch<='9')? "The Character "+ch+" is an Integer."
						: "The Character "+ch+" is a Special Character.";
		System.out.print(result);
	}

}
