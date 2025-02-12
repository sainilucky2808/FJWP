// Wap to print all ascii characters from 0 to 127.
public class Q2 {
	public static void main(String[] args)
	{
		System.out.println("ASCII Characters from 0 to 127 are: ");

		for (int i=0; i<=127; i++) {
			System.out.printf("ASCII %d: %c%n", i, (char)i);
		}
	}

}
