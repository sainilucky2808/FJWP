// Q10. WAP to print the multiplication table of a number given by user
import java.util.Scanner;
public class Q10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int mul = sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			int tab = mul*i;
			System.out.println(mul+"*"+i+"= "+tab);
		}
	}

}
