import java.util.Scanner;
public class TwoDArray {
	public static void main(String[] args) {
		
	int a[][] = new int [3][3];
	int b[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
	Scanner sc = new Scanner(System.in);
	
	// input values in Array
	for(int r=0;r<a.length;r++) {
		for(int c=0;c<a[r].length;c++) {
			System.out.print("Enter value at ["+r+"]["+c+"]: ");
			a[r][c] = sc.nextInt();
			}
	}
	// for print First Array
	System.out.println("First Array:- \n");
	for(int r=0;r<a.length;r++) {
		for(int c=0;c<a[r].length;c++) {
		System.out.print(a[r][c]+"\t");	
		}
		System.out.println();
		}
	// for print Second Array
	System.out.println("Second Array:- \n");
	for(int r=0;r<b.length;r++) {
		for(int c=0;c<b[r].length;c++) {
		System.out.print(b[r][c]+"\t");	
		}
		System.out.println();
		}
	}

}
