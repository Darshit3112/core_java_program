package DSA;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_list_class 
{
	int id;
	String name;
	
	public Array_list_class(int id,String name) 
	{
		this.id=id;
		this.name=name;
	}
	public static void main(String[] args) 
	{
		ArrayList<Array_list_class> al=new ArrayList<Array_list_class>();
		al.add(new Array_list_class(1, "test1"));
		al.add(new Array_list_class(2, "test2"));
		al.add(new Array_list_class(3, "test3"));
		al.add(new Array_list_class(4, "test4"));
		Iterator<Array_list_class> i=al.iterator();
		while(i.hasNext())
		{
			Array_list_class a=i.next();
			System.out.println(a.id+" " +a.name);
		}
	}
}
