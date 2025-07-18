package Abstract;

class circle implements Shape
{

	@Override
	public double area() 
	{
		double r=8;
		double cir=3.14*r*r; 
		return cir;
	}
	
}

class rectangle implements Shape
{

	@Override
	public double area() 
	{
		double length=4.4,width=3.3;
		return length*width;
	}
	
}
public class Shape_method 
{
	public static void main(String[] args) 
	{
		circle c=new circle();
		rectangle r=new rectangle();
		System.out.println("circle="+c.area());
		System.out.println("rectangle="+r.area());
	}
}
