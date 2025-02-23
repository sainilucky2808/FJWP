
public class Student 
{
	private int rollno;
	private String name;
	private int age;
	private float salary;
	
	// alt+shift+s
	public Student(int rollno, String name, int age, float salary) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.salary = salary;
		System.out.println("Initializing all variables");
	}
	
	
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}


	public Student() {
		System.out.println("calling default constructor!!");
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
}
