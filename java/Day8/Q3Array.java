// WAP to find the smallest and largest element in array.
import java.util.Arrays;
public class Q3Array {
	public static void main(String[] args) {
		int array[] = {7,2,0,10,4,5,8,9};
		int lar=0;
		int small=0;
		int len = array.length;
		for(int i=0;i<len;i++) {
			if(lar<array[i]) {
				lar=array[i];
			} 
		for(int j=0;j<len;j++) {
			if(small>array[i]) {
				small=array[i];
			}
		}
			
		}
		System.out.println("Largest Element in the Array: "+lar);
		System.out.println("Smallest Element in the Array: "+small);
	}

}
