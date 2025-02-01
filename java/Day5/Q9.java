// 1. Check whether the character is alphabet or not.
// 2. If character is alphabet then check if it is in lower case or upper case
// 3. If it is in upper case then convert it into lower case
// 4. Check if it is vowel or not.
import java.util.Scanner;
public class Q9 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a Character: ");
	char ch = sc.next().charAt(0);	
	String result = (ch>='A' && ch<='Z') || (ch>='a' && ch<='z')
			? ((ch>='A' && ch<='Z')
					? "The Character "+ch+" is an alphabet and it is in Upper Case.So, we have convert it to Lower Case."+
					((char)(ch+32) == 'a' || (char)(ch+32) == 'e' || 
					(char)(ch+32) == 'i' || (char)(ch+32) == 'o' || (char)(ch+32) == 'u' 
			? "The Character "+(char)(ch+32)+" is a Vowel.": "The Character "+(char)(ch+32)+" is not a Vowel.")
			:"The Character "+ch+" is an alphabet and it is in Lower Case."+ 
			(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
			? "The Character "+ch+" is a Vowel.": "The Character "+ch+" is not a Vowel.")
			)
			: "The Character "+ch+" is not an alphabet."; 
	System.out.println(result);
	
	}

}
