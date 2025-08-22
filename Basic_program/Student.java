package Basic_program;

public class Student 
{
	int id;
	String name;
	static int studentobject;
	public Student(int id,String name) 
	{
		 this.id=id;
		 this.name=name;
		 System.out.println(id+" "+name);
		 studentobject++;
	}
	static int getstudentobject()
	{
		return studentobject;
	}
	public static void main(String[] args) 
	{
		Student s=new Student(1, "TOPS");
		Student s1=new Student(2, "TOPS");
		Student s2=new Student(3, "TOPS");
		System.out.println(studentobject);
	}
}
