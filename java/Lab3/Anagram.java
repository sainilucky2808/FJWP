/*Q.8 Check if Two Strings are Anagrams. Write a program to check if two strings 
   are anagrams (contain the same characters in a different order).
   Input: "listen","silent" -> Output True*/
import java.util.Scanner;
import java.util.Arrays;
public class Anagram {
	public static void main(String[] args) {
		Anagram A = new Anagram();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First String: ");
		String s1 = sc.nextLine();
		System.out.print("Enter Second String: ");
		String s2 = sc.nextLine();
		
		String String1 = A.sortString(s1);
		String String2 = A.sortString(s2);
		if(String1.equals(String2)) {
			System.out.println("The Strings "+s1+" and "+s2+" are Anagrams.");
		}
		else
		{
			System.out.println("The Strings "+s1+" and "+s2+" are not Anagrams.");
		}
	}
	public String sortString(String s) {
		char tempArray[] = s.toCharArray();
		Arrays.sort(tempArray);
		return new String(tempArray);
	}

}
