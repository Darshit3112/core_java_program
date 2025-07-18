package inheritance;

class Employee
{
	int id;	
	String name;
	public Employee(int id,String name) 
	{
		this.id=id;
		this.name=name;
	}
	void displayDetails()
	{
		
		System.out.println(id+" "+name);
	}
}
class Fulltimeemployee extends Employee
{
	int salary;
	public Fulltimeemployee(int salary) 
	{
		super(10, "Tops");
		this.salary=salary;
	}
	void displayDetails()
	{
		super.displayDetails();
		System.out.println(salary);
	}
}
class Parttimeemployee extends Fulltimeemployee
{
	int hourlyrate, hoursworked;
	int total=hourlyrate*hoursworked;
	public Parttimeemployee(int hourlyrate, int hoursworked) 
	{
		super(500);
		this.hourlyrate=hourlyrate;
		this.hoursworked=hoursworked;
		this.total = hourlyrate * hoursworked;
	}
	void displayDetails()
	{
		super.displayDetails();
		System.out.print(hourlyrate+" "+hoursworked+" "+total);
	}
}
public class Employee1 
{
	public static void main(String[] args) 
	{
		Parttimeemployee pte=new Parttimeemployee(100, 3);
		pte.displayDetails();
	}
}
