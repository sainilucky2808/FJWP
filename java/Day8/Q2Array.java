// WAP to store the table of 2 into an array.
import java.util.Arrays;
public class Q2Array {
	public static void main(String[] args) {
		int array[] = new int[10];
		for(int i=0;i<10;i++) {
			array[i] = 2*(i+1);
			
		}
		System.out.println("The Array's Elements are: "+Arrays.toString(array));
	}

}
