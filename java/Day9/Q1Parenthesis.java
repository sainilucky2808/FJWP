/*Valid Parentheses Checker

Given a string containing just the characters ()[]{}, determine if it is valid.

Example:

Input: "({[]})" → Output: true

Input: "([)]" → Output: false*/
import java.util.Scanner;
public class Q1Parenthesis {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = sc.nextLine();
		String br = "";
		boolean status = true;
		aa:
			for(int i=0;i<str.length();i++) {
				char ch = str.charAt(i);
				if(ch=='{' || ch=='[' || ch=='(')
				{
					br += ch;
				}
				else if(ch=='}' || ch==']' || ch==')')
				{
					int l=br.length();
					switch(br.charAt(l-1))
					{
					case '(':
						if(ch==')')
						{
							br=br.substring(0,l-1);
						}
						break;
					case '{':
						if(ch=='}')
						{
							br=br.substring(0, l-1);
						}
					case '[':
						if(ch==']')
						{
							br=br.substring(0, l-1);
						}
						
						break;
						default:
						{
							status=false;
							break aa;
						}
					}
				}
				}
		if(status==true || br.length()==0)
			System.out.println("Valid Sequence");
		else System.out.println("Invalid Sequence");
			}
	}

