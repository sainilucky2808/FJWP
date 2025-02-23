/*Q.7 Find the Longest Substring Without Repeating Characters
   Given a String, find the length of the longest Substring without repeating 
   characters. Example: Input: "abcabcbb" -> Output: 3*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class LongestSubstringLength {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s = sc.nextLine();
		int start = 0;
		int end = 0;
		int max_length = 0;
		List<Character> list=new ArrayList<Character>();
		
		while(end<s.length()) {
			if(!list.contains(s.charAt(end)))
			{
				list.add(s.charAt(end));
				end++;
				max_length=Math.max(max_length, list.size());
			}
			else
			{
				list.remove(Character.valueOf(s.charAt(start)));
				start++;
			}
		}
		System.out.println("Maximum Length of the Substring is : "+max_length);
	}

}
