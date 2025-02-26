/*1. Write a Java program that demonstrates various operations on a 3D array: 
      -> 1. Initializing the 3D array with random values. 
      -> 2. Finding the maximum value in the array.  
      -> 3. Calculating the average of all elements. 
      -> 4. Displaying the array. */
import java.util.Scanner;
public class Q13DArray {
	public static void main(String[] args) {
		int a[][][] = new int[1][3][3];
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int lar = 0;
		for(int t=0;t<a.length;t++)
		{
			System.out.println("Table Number : 1");
			for(int r=0;r<a[t].length;r++)
			{
				for(int c=0;c<a[t][r].length;c++)
				{
					System.out.println("Enter Value: ");
					a[t][r][c] = sc.nextInt();
					sum = sum+a[t][r][c];
					if(lar<a[t][r][c]) {
						lar=a[t][r][c];
					} 
				}
			}
			System.out.println("==============================================");
		}
		
		System.out.println("Displaying of Elements in Table No.1 :-");
		for(int t=0;t<a.length;t++)
		{
			System.out.println("Table Number : 1");
			for(int r=0;r<a[t].length;r++)
			{
				for(int c=0;c<a[t][r].length;c++)
				{
					System.out.print(a[t][r][c]+"\t");
				}
				System.out.println();
			}
			System.out.println("===============================================");
		}
		System.out.println("Maximum Value in this Array is : "+lar);
		System.out.println("Average of 3D Array Elements : "+sum/9);
	}
	

}
