package Encapsulation;

public class Call_product 
{
	public static void main(String[] args) 
	{
		Product p=new Product();
		p.setProid(1);
		p.setProname("Chocolate icecream");
		p.setQuantity(5);
		p.setPrice(-120);
		
		System.out.println(p.getProid()+" "+p.getProname()+" "+p.getQuantity()+" "+p.getPrice()+" "+p.gettotalvalue());
		
	}
}
