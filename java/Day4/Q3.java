// Program to add 32 to the ASCII value of a character and print the equivalent character.
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a character
        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);

        // Get the ASCII value of the character
        int ascii = (int) character;
        System.out.println("The ASCII value of the character is: " + ascii);

        // Add 32 to the ASCII value
        int newAscii = ascii + 32;

        // Convert the new ASCII value back to a character
        char newCharacter = (char) newAscii;
        System.out.println("The new character after adding 32 to the ASCII value is: " + newCharacter);

        // Close the scanner
        scanner.close();
    }
}
