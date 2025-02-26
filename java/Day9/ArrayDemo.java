import java.util.Scanner; // import Scanner class


// tracker id : 
// google page -resource - class- tid=1+1=2
// ashish -> google page(ob1) -> java books
// vikas -> google pate(ob2) -> html books
public class ArrayDemo 
{
	int a[]; // creating an array
	Scanner sc; // creating object for scanner
	int idx; // creating a variable idx
	
	public ArrayDemo(int size) 
	{
		a=new int[size];
		sc=new Scanner(System.in);
		idx = -1;  // empty array
	}
	// length =10
// 		0	1	2	3	4	5	6	7	8	9
//		12	55	88	0	55	66	33	
//  idx = -1
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of Array :- ");
		ArrayDemo ad=new ArrayDemo(sc.nextInt());
		ad.menu();// to call menu function
	}
	// we can't access a non-static method directly 
	// from a static method
	// why main method is static?
	public void menu()
	{
		int choice;
		do
		{
			System.out.println("0. Exit");
			System.out.println("1. Display Element of Array");
			System.out.println("2. Insert New Element At End");
			System.out.println("3. Insert New Element At First Index");
			System.out.println("4. Insert New Element By Position");
			System.out.println("5. Insert new element By Value");
			System.out.println("6. Search");
			System.out.println("7. Replace");
			System.out.println("8. Delete First Value");
			System.out.println("9. Delete Last Value");
			System.out.println("10. Delete By Position");
			System.out.println("11. Delete By Value");
			System.out.println("12. Largest Number");
			System.out.println("13. Smallest Number");
			System.out.println("14. Sorting Array in Ascending Order");
			System.out.println("15. Sorting Array in Descending Order");
			
			System.out.println("Enter your Choice : ");
			choice=sc.nextInt();
			
			if(choice==0)
			{
				System.out.println("GoodBye !!!");
			}
			else if(choice == 1) display();
			else if(choice == 2) {
				insertLast();
				display();
			}
				
			else if(choice == 3) insertFirst();		
			else if(choice == 4) insertByPos();
			else if(choice == 5) insertByValue();
			else if(choice == 6) 
			{
				System.out.println("Enter search value : ");
				SearchValue(sc.nextInt());
			}
			else if(choice == 7) replace();
			else if(choice == 8)
			{
				deleteFirst();
			}
			else if(choice == 9)
			{
				deleteLast();
			}
			else if(choice == 10)
			{
				deleteByPosition();
			}
			else if(choice == 11)
			{
				deleteByValue();
			}
			else if(choice == 12)
			{
				findLargest();
			}
			else if(choice == 13)
			{
				findSmallest();
			}
			else if(choice == 14)
			{
				ascendingOrder();
				display();
			}
			else if(choice == 15)
			{
				descendingOrder();
				display();
			}
			else
				System.out.println("Wrong choice!Try Again!!");
			
		}while(choice!=0);
	}
	
	public void display()
	{
		System.out.println("Array Elements : - ");
		for(int x:a) System.out.print(x+"\t");
		System.out.println("\n----------------------------------");
	}
	
	// 0	1	2	3	4	
	// 12	25	36	45
	// 25	36	45  0	
	// idx = 3-1=2
	
	public void insertLast()
	{
		if(isFull()) System.out.println("Array Is Full!!Can't Insert New Value!!");
		else
		{
			System.out.print("Enter a new Value : ");
			a[++idx] = sc.nextInt();// idx= -1 0 1, a[1]=45
			System.out.println("Array Insertion Successfull!!!");
		}
	}
	
	public void insertFirst()
	{
		if(isFull()) System.out.println("Array Is Full!!Can't Insert New Value!!");
		else
		{
			shiftRight(0);
			System.out.println("Enter a new value : ");
			a[0]=sc.nextInt();
			idx++;
			System.out.println("Array Insertion Successfull!!!");
		}
	}
	
	public void shiftRight(int index) // index = 0
	{
		for(int i=idx+1;i>index;i--) 
			a[i]=a[i-1];
		
		// 0	1	2	3	4	
		// 12	25	36	45
//		   12	25	36	45	45
//		   12	25	36	36	45
//		   new	12	25	36	45
		// idx = 3
//		index=0
//		i = 4 3 i >0  
//		a[3]=a[2]
	}
	
	public void insertByPos()
	{
		if(isFull()) System.out.println("Array Is Full!!Can't Insert New Value!!");
		else
		{
			System.out.println("Enter position : ");
			int pos=sc.nextInt(); // 2
			pos--;  // pos = 1
//			idx = 2
			if(pos>=0 && pos<=idx+1 )  // 1 <= 3
			{
				shiftRight(pos);
				System.out.println("Enter a new value : ");
				a[pos]=sc.nextInt();
				idx++;
				System.out.println("Array Insertion Successfull!!!");
			}
			else
				System.out.println("Invalid Position!!!");
		}
	}
	
	public void insertByValue()
	{
		System.out.println("Enter a value : ");
		int search = sc.nextInt();
		int index = SearchValue(search);
		if(index == -1)
			System.out.println("Can't Insert new value!!");
		else
		{
			shiftRight(index);
			System.out.println("Enter New Value : ");
			a[index]=sc.nextInt();
			System.out.println("Value Inserted Successfully!!");
		}
	}
	
	public void deleteFirst()
	{
		if(isEmpty()) System.out.println("Array is Empty!!Can't delete any value!!");
		else
		{
			leftShift(0);
			System.out.println("First value deleted Successfully!!");
			display();
		}
	}
	
	public void leftShift(int index) // 3
	{  
	   for(int i=index;i<idx;i++) // i=3  i<=6
	   { 
	    
	    a[i]=a[i+1];  // 3=4, 4=5, 5=6
	    
	   }
	   a[idx--]=0;  // a[6]=0  idx=6-1=5
	}
	// a[idx]=0,  a[3] =0, idx--
	
	
	public void deleteLast()
	{
		if(isEmpty()) System.out.println("Array is Empty!!Can't delete any value!!");
		else
		{
			a[idx--]=0;
			System.out.println("Last value deleted Successfully!!");
			display();
		}
	}
	public void deleteByPosition()
	{
		if(isEmpty()) System.out.println("Array Is empty!!Can't delete  Value!!");
		else
		{	
			System.out.println("Enter a Position you want to delete value : ");
			int pos=sc.nextInt();
			pos--;
			if(0<=pos&&pos<=idx) // 0<=3     3<=6
			{
				leftShift(pos);
				System.out.println("Array deletion Successfull!!!");
			}
			else {
				System.out.println("Please Enter vaild position b/w 1 to "+(idx+1));
			}
		}
	}
	public void deleteByValue()
	{
	  if(isEmpty()) System.out.println("Array is Empty!! Can't Delete Any value!!");
	  else
	  {
		  System.out.println("enter the value you want to delete : ");
		  int value=sc.nextInt();
		  int index =  SearchValue(value);
		  if(index==-1)
		  {
		    System.out.println(" please try with another value");
		  }
		  else
		  {
		    leftShift(index);
		    System.out.println("Value Deleted Successfully!!");
		  }
	  }
	}
	
	// 22 34 55 77 88 356 445
	// 0  1  2  3  4  5   6
	// idx = 6
	public int SearchValue(int ele) // 77
	{
		for(int i=0;i<=idx;i++) // i=0 1 2 3 i<=6
		{
			if(a[i]==ele) // a[3](77) == ele(7557) true
			  {
					System.out.println("element is at index : "+i);
					return i;
				}
		}
		System.out.println("element not found");
		return -1;
	}
	public void replace()
	{
		System.out.println("Enter a value to search : ");
		int search = sc.nextInt();
		int index = SearchValue(search);
		if(index!=-1)
		{
			System.out.println("Enter New Value : ");
			a[index]=sc.nextInt();
			System.out.println("Value Replaced Successfully!!!");
		}
		else
			System.out.println("Try again!!");
	}
	
	public void findLargest()
	{
		if(isEmpty()) System.out.println("Array is Empty. Please Insert New Elements First!!");
		else {
			int max = a[0];
			for(int i=1;i<a.length;i++) {
				if(a[i]>max) {
					max=a[i];
				}
			}
			System.out.println("The Largest Element in this Array is : "+max);
		}
	}
	
	public void findSmallest()
	{
		if(isEmpty()) System.out.println("Array is Empty. Please Insert New Elements First!!");
		else {
			int min = a[0];
			for(int i=1;i<a.length;i++) {
				if(a[i]<min) {
					min=a[i];
				}
			}
			System.out.println("The Smallest Element in this Array is : "+min);
		}
	}
	
	public void ascendingOrder()
	{
		if(isEmpty()) System.out.println("Array is Empty. Please Insert New Elements First!!");
		else 
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Array Successfully Sorted in Ascending Order.");
	}
	
	public void descendingOrder()
	{
		if(isEmpty()) System.out.println("Array is Empty. Please Insert New Elements First!!");
		else 
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Array Successfully Sorted in Descending Order.");
	}
	
	public boolean isEmpty()
	{
		if(idx == -1)
			return true;
		else
			return false;
	}
	
	public boolean isFull()
	{
		if(idx == a.length-1)
			return true;
		else
		 return false;
	}
	
	
}
