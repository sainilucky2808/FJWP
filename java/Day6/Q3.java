//WAP to check the user id and Password.
import java.util.Scanner;
public class Q3 {
	public static void main(String[] args)
	{
		String predefinedusername = "user123";
		String predefinedpassword = "pass123";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Username: ");
		String res = sc.nextLine();
		System.out.print("Enter Password: ");
		String res2 = sc.nextLine();
		String result = (res.equals(predefinedusername) && res2.equals(predefinedpassword))
				?"Login Successfully!!"
						:"Username or Password is invalid.";
		System.out.println(result);
	}

}
