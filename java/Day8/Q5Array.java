// WAP to replace the element value in the array.
import java.util.Scanner;
import java.util.Arrays;
public class Q5Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = {1,2,3,4,5,6,7,8};
		System.out.print("Choose Value from the below array \n"+Arrays.toString(a)+" : ");
		int value = sc.nextInt();
		System.out.print("Enter Replaced Value: ");
		int repvalue = sc.nextInt();
		for(int i=0;i<a.length;i++) {
			if(value==a[i]) {
				a[i] = repvalue;
				break;
			}
		}
		
		System.out.print("New Array: "+Arrays.toString(a));
	}

}
