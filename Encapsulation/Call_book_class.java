package Encapsulation;

public class Call_book_class 
{
	public static void main(String[] args) 
	{
		Book b=new Book();
		b.setId(1);
		b.setName("RAMAYAN");
		b.setAuthor("Shree Valmiki");
		System.out.println(b.toString());
	}
}
