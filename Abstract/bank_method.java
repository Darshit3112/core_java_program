package Abstract;

class Sbi implements Bank
{

	@Override
	public int getrateofinterest() 
	{
		
		return 1;
	}
	
}
class Bob implements Bank
{

	@Override
	public int getrateofinterest() 
	{
		
		return 2;
	}
	
}
class Hdfc implements Bank
{

	@Override
	public int getrateofinterest() 
	{
		
		return 3;
	}
	
}
public class bank_method 
{
	public static void main(String[] args) 
	{
		Sbi s=new Sbi();
		System.out.println(s.getrateofinterest());
		Bob b=new Bob();
		System.out.println(b.getrateofinterest());
		Hdfc h=new Hdfc();
		System.out.println(h.getrateofinterest());
		
	}
}
