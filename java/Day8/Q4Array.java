//WAP to find a particular value in array(search operation).
import java.util.Arrays;
import java.util.Scanner;
public class Q4Array {
	public static void main(String[] args) {
		int array[] = {2,4,1,6,7,8,3,0,9,10};
		System.out.print("Enter the Value which you want to search: ");
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		int len = array.length;
		boolean found = false;
		for(int i=0;i<len;i++) {
			if(value==array[i]) {
				System.out.print("The Value "+value+" is found at "+i+" index.");
				found=true;
				break;
			}
			
		}
		if(!found) {
			System.out.print("The Value "+value+" is not found.");
		}
		
		
	}

}
