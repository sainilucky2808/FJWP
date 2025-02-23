/* Q1. Write a program to find out all the armstrong numbers within a given
range using a method named printArmstrongNumber( int start, int
end) by taking input from the user. The program should print the
Armstrong number in a given range starting from “start” and ending with “end”.
Armstrong Number Example: 153 1^3+5^3+3^3 =153 (Number which is equal
to the sum of the cubes of its digits)
Note: input should be taken from the keyboard. Use a loop to calculate the
Armstrong number from “start” to “end”. Also use loops to calculate the
cube of a number. Do not use the Math.pow() function.
public class Armstrong {
}*/
import java.util.Scanner;
class Armstrong{
	
	public static void main(String[] args) {
		
		printArmstrongNumber();
	}

	public static void printArmstrongNumber() {
		int num,start,end,counter = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Starting Range: ");
		start = sc.nextInt();
		System.out.print("Enter the Ending Range: ");
		end = sc.nextInt();
		for(int i=start+1;i<end;i++) {
			int temp = i;
			num = 0;
			
			while(temp!=0) {
			int	rem=temp%10;
				num=num+rem*rem*rem;
				temp=temp/10;
			}
			if(i==num) {
				if( counter == 0) {
					System.out.println("Armstrong Number between "+start+" and "+end+" are: ");
				}
				System.out.println(i+" ");
				counter++;
			}
		}
		if(counter == 0) {
			System.out.println("There is no Armstrong Number between the given Range.");
		}
		
	}
}