// Print the ASCII value of the character inputted by user.
import java.util.Scanner;
class Ascii{
	public static void main(String args[])
	{
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter a character : ");
	char character = scanner.next().charAt(0);
	
	int ascii = (int) character;
	System.out.println("The Ascii Value of " + character + " is: "+ascii);
	}
}
