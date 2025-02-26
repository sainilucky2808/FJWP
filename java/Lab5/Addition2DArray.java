/*2.Write a Java program that performs addition of two matrices. The program should use a 2D array of wrapper 
   class objects (e.g., Integer) for the matrix elements. Take two matrices as input, perform the addition 
   operation, and display the resulting matrix.*/
import java.util.Scanner;
public class Addition2DArray {
	Scanner sc;
	public static void main(String[] args) {
		Addition2DArray td = new Addition2DArray();
		
		System.out.println("Enter the Number of Rows and Columns for an Array :- ");
		int a[][] = td.createArray(td.sc.nextInt(), td.sc.nextInt());
		
		System.out.println("Enter the Number of Rows and Columns for an Array :- ");
		int b[][] = td.createArray(td.sc.nextInt(), td.sc.nextInt());
		
		System.out.println("First Array :- ");
		td.display(a);
		
		System.out.println("Second Array :- ");
		td.display(b);
		
		// addition
		int c[][] = td.matrixAddition(a, b);
		
		System.out.println("Addition Matrix:- ");
		td.display(c);
	}
	
	public Addition2DArray() {
		sc = new Scanner(System.in);
	}
	public int[][] createArray(int row, int col)
	{
		int[][] x = new int[row][col];
		
		for(int r=0;r<x.length;r++)
		{
			for(int c=0;c<x[r].length;c++)
			{
				System.out.print("Enter value at ["+r+"]["+c+"]: ");
				x[r][c]=sc.nextInt();
			}
		}
		return x;
	}
	public void display(int x[][])
	{
		System.out.println("Array Elements are :-");
		for(int r=0;r<x.length;r++)
		{
			for(int c=0;c<x[r].length;c++)
			{
				System.out.print(x[r][c]+"\t");
			}
			System.out.println();
		}
	}
	// matrix addition
	public int[][] matrixAddition(int x[][], int y[][])
	{
		// row
		int xrow = x.length;
		int yrow = y.length;
		
		// col
		int xcols = x[0].length;
		int ycols = y[0].length;
		
		if(xrow==yrow && xcols==ycols)
		{
			int z[][] = new int[xrow][xcols];
			for(int r=0;r<z.length;r++)
			{
				for(int c=0;c<z[r].length;c++)
				{
					z[r][c] = x[r][c]+y[r][c];
				}
			}
			return z;
		}
		System.out.println("Both Matrices does not have same dimensions.");
		return null;
	}
}
