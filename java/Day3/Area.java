import java.util.Scanner;

class Area
{
	public static void main(String args[])
	{
		float pi = 3.14f;
		// for taking input
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Radius : ");
		float r=sc.nextFloat();
		float area = pi*r*r;

		System.out.println("Area of Circle : "+area);
	}
}
