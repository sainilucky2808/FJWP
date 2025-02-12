
public class Addition {
	// method for adding two numbers
	public int add(int a, int b)
	{
		return a+b;
	}
	// method for adding three numbers
	public int add(int a,int b,int c)
	{
		return a+b+c;
	}
	// method for adding all the numbers in the given array
	public int add(int a[])
	{
		int sum = 0;
		for (int i=0;i<a.length;i++)
			sum+=a[i];
		return sum;
	}
	// main method
	public static void main(String[] args) {
		// Creating object
		Addition ad = new Addition();
		System.out.println("Sum of two numbers: "+ad.add(4, 5));
		System.out.println("Sum of two numbers: "+ad.add(4, 5, 6));
		int a[]= {1,2,3,4,5,6,7,8,9};
		System.out.println("Sum of Array Elements: "+ad.add(a));
	}
	

}
