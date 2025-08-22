package DSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class student
{
	int id;
	String name;
	public student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
}
class idvisesorting implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) 
	{
		student s=(student) o1;
		student s1=(student) o2;
		if(s.id==s1.id)
		{
			return 0;
		}
		else if(s.id>s1.id)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}
class namesorting implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) 
	{
		student s=(student) o1;
		student s1=(student) o2;
		return s.name.compareTo(s1.name);
	}
}
public class Comparator_program 
{
	public static void main(String[] args) 
	{
		ArrayList<student> al=new ArrayList<student>();
		al.add(new student(1, "xgd"));
		al.add(new student(2, "dgd"));
		al.add(new student(3, "ugd"));
		al.add(new student(4, "agd"));
		al.add(new student(5, "wgd"));
		System.out.println("Sorting by Id");
		Collections.sort(al,new idvisesorting());
		for(student s:al)
		{
			System.out.println(s.id+" "+s.name);
		}
		System.out.println("sorting by name");
		Collections.sort(al,new namesorting());
		for(student s:al)
		{
			System.out.println(s.id+" "+s.name);
		}
	}
}
