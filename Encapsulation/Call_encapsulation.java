package Encapsulation;

public class Call_encapsulation 
{
	public static void main(String[] args) 
	{	
	Test_encapsulation te=new Test_encapsulation();
	te.setId(1);
	te.setName("Darshit");
	te.setAddress("vadodara");
	System.out.println(te.toString());
	} 
}