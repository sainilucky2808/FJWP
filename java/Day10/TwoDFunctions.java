import java.util.Scanner;
public class TwoDFunctions {
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
	public static void main(String[] args) {
		TwoDFunctions td = new TwoDFunctions();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number of Rows and Columns for Array:- ");
		int a[][]=td.createArray(sc.nextInt(), sc.nextInt());
		
		System.out.println("Enter the Number of Rows and Columns for Array:- ");
		int b[][]=td.createArray(sc.nextInt(), sc.nextInt());
		
		System.out.println("First Array :- ");
		td.display(a);
		
		System.out.println("Second Array :- ");
		td.display(b);
	}
	}

