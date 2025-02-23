/* Q5. WAP to count the number of lower case characters, upper case characters, 
   numbers and special characters in a String.*/
import java.util.Scanner;
public class CountChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = sc.nextLine();
		int c1=0;
		int c2=0;
		int c3=0;
		int c4 = 0;
		for(int i=0;i<str.length();i++) {
			 char ch = str.charAt(i);
		{
			if(ch>='a' && ch<='z') {
				 c1++;
			}
			else if(ch>='A' && ch<='Z') {
				c2++;
			}
			else if(ch>'0' && ch<='9') {
				c3++;
			}
			else
				c4++;
		}
		
	}
		System.out.println("Total Lower Case Letters in this String are : "+c1);
		System.out.println("Total Upper Case Letters in this String are : "+c2);
		System.out.println("Total Integer Numbers in this String are : "+c3);
		System.out.println("Total Special Case Letters in this String are : "+c4);
	}

}
