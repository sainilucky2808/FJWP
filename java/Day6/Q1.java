// Enum Program
import java.util.Scanner;
public class Q1 {
	public enum classlevel
	{
		LOW,
		MEDIUM,
		HIGH
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Type one of the options below :");
		System.out.println("1. Low\n2. Medium\n3. High");
		String option = sc.nextLine();
		
		classlevel cl = option.equals("Low")?classlevel.LOW:
			option.equals("Medium")?classlevel.MEDIUM:classlevel.HIGH;
		
		System.out.println("You have selected Level : "+cl);
	}

}
