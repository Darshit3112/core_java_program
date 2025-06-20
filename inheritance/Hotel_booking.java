package inheritance;

public class Hotel_booking 
{
	int bill;
	String rtype;
	void booking()
	{
		System.out.println("HOTEL TAJ");
	}
	void booking(int no)
	{
		System.out.println("Number of people="+no);
	}
	void booking(String person, String rtype)
	{
		this.rtype=rtype;
		System.out.println(person+" book "+rtype+" room");
		generate_bill();
	}
	void generate_bill()
	{
		if(rtype.equals("Delux"))
		{
			bill=2000;
		}
		else
		{
			bill=1500;
		}
		System.out.println("Bill="+bill);
	}
	public static void main(String[] args) 
	{
		Hotel_booking hb=new Hotel_booking();
		hb.booking();
		hb.booking(3);
		hb.booking("Shefali", "Standerd");
	}
}
