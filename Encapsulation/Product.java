package Encapsulation;

public class Product 
{
	private int proid,quantity;
	private String proname;
	private double price;
	public int getProid() {
		return proid;
	}
	public void setProid(int proid) {
		this.proid = proid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		if (quantity<=0)
		{
			System.out.println("quantity should be graterthen 0");
		}
		this.quantity = quantity;
	}
	public String getProname() {
		return proname;
	}
	public void setProname(String proname) {
		this.proname = proname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if (price<=0)
		{
			System.out.println("price should be graterthen 0");
			this.price = 0;
		}
		else
		{
			this.price=price;
		} 
	}
	
	double gettotalvalue()
	{
		return price*quantity;	
	}
	
}
