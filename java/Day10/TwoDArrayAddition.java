import java.util.Scanner;
public class TwoDArrayAddition {
	public int[][] createArray(int row, int col){
		int[][] x = new int[row][col];
		Scanner sc = new Scanner(System.in);
		for(int r=0;r<x.length;r++) {
			for(int c=0;c<x[r].length;c++) {
				System.out.println("Enter Value at ["+r+"]["+c+"]: ");
				x[r][c]=sc.nextInt();
			}
		}
		return x;
	}
	public void display(int x[][]) {
		System.out.println("Array Elements are:- ");
		for(int r=0;r<x.length;r++) {
			for(int c=0;c<x[r].length;c++) {
			System.out.print(x[r][c]+"\t");	
			}
			System.out.println();
			}
		}
	public int[][] Addition(int x[][], int y[][]){
		//row
		int xrow = x.length;
		int yrow = y.length;
		
		// col
		int xcols = x[0].length;
		int ycols = y[0].length;
		
		if(xrow==yrow && xcols==ycols)
		{
			int z[][] = new int[xrow][xcols];
			for(int r=0;r<z.length;r++) {
				for(int c=0;c<z[r].length;c++) {
					z[r][c] = x[r][c] + y[r][c];
				}
			}
			return z;
		}
		System.out.println("Both Matrices does not have same dimensions.");
		return null;
		
	}
	public static void main(String[] args) {
		TwoDArrayAddition td = new TwoDArrayAddition();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number of Rows and Columns for Array:- ");
		int a[][]=td.createArray(sc.nextInt(), sc.nextInt());
		
		System.out.println("Enter the Number of Rows and Columns for Array:- ");
		int b[][]=td.createArray(sc.nextInt(), sc.nextInt());
		
		System.out.println("First Array :- ");
		td.display(a);
		
		System.out.println("Second Array :- ");
		td.display(b);
		
		// addition
		int c[][] = td.Addition(a, b);
		
		System.out.println("Addition Matrix:- ");
		td.display(c);
		
		
	}
	}

