// WAP to print all even numbers from the given range.
import java.util.Scanner;
class EvenNum {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Starting range of Even Number: ");
		int start = sc.nextInt();
		System.out.print("Enter the Ending range of Even Number: ");
		int end = sc.nextInt();
		System.out.print("The Even Numbers between "+start+" and "+end+" are: ");
		
		for (int i=start; i<=end; i++) {
			if (i%2==0) {
				System.out.print(i+" ");
			}
				}
		}
	
}
