package inheritance;

public class calculate_grade 
{
	double avg;
	int total;
	int rollNO;
	String Name;
	
	public calculate_grade(int rollNO,String Name)
	{
		System.out.println("Name="+Name+" Roll no="+rollNO);
	}
	void calculate_avg(int m1)
	{
		avg=m1/1;
		total=m1;
		calculate_grade();
	}
	void calculate_avg(int m1,int m2)
	{
		avg=(m1+m2)/2;
		total=m1+m2;
		calculate_grade();
	}
	void calculate_avg(int m1,int m2,int m3)
	{
		avg=(m1+m2+m3)/3;
		total=m1+m2+m3;
		calculate_grade();
	}
	void calculate_grade()
	{
		String grade;
		if(avg>90)
		{
			grade="A";
			System.out.println("TOTAL="+total+" average="+avg+" Grade="+grade);
		}
		else if(avg<89 && avg>70)
		{
			grade="B";
			System.out.println("TOTAL="+total+" average="+avg+" Grade="+grade);
		}
		else if(avg<69 && avg>50)
		{
			grade="C";
			System.out.println("TOTAL="+total+" average="+avg+" Grade="+grade);
		}
		else
		{
			grade="Fail";
			System.out.println("TOTAL="+total+" average="+avg+" Grade="+grade);
		}
	}
	public static void main(String[] args) 
	{
		calculate_grade cg=new calculate_grade(31,"shefali");
		cg.calculate_avg(40);
		cg.calculate_avg(50, 60);
		cg.calculate_avg(40, 66, 88);
	}
}
