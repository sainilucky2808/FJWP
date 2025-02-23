// WAP to add all the elements of an array.
import java.util.Arrays;
public class Q1Array {

		 static int A[] = {1,2,3,4,5,6,7,8};
		
		static int sum() {
		System.out.println("Array Elements are: "+Arrays.toString(A));
		System.out.print("The Addition of the Array's Elements are: ");
		int len = A.length;
		int sum = 0;
		for (int i=0;i<len;i++)
			sum = sum+A[i];
			return sum;
		}
		public static void main(String[] args) {
			System.out.print(sum());
		}
		

}
