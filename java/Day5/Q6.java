//WAP to print pass or fail according to marks.
import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Marks out of 100: ");
		int Mark = sc.nextInt();
		String result = (Mark>-1 && Mark<35) ? "Student is Fail." :
			(Mark>=35 && Mark<=100) ? "Student is Pass.": "Enter Valid Marks.";
		System.out.print(result);
	}

}
