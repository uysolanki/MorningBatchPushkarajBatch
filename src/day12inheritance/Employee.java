package day12inheritance;
			//sub             super
public class Employee extends Person
{
	int empNo;
	String desg;
	double sal;			//Total DM=6
	
	public Employee()  //No Args Constuctor
	{
		super();
		this.empNo=1001;
		this.desg="Admin";
		this.sal=1000;
	}
	public Employee(long a, String b, int c, int d,String e, double f)
	{
		super(a,b,c);
		this.empNo=d;
		this.desg=e;
		this.sal=f;
	}
	
	public void displayEmployeeDetails()
	{
		super.displayPersonalDetails();
		System.out.println("Employee No is" + this.empNo);
		System.out.println("Designation is" + this.desg);
		System.out.println("Salary is" + this.sal);
	}
	public void display()
	{
		
	}
}
