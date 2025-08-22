package DSA;

import java.util.HashSet;

public class Hashset_class 
{
	public Hashset_class() 
	{
		HashSet<Integer> set=new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		for(Integer i:set)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) 
	{
		new Hashset_class();
	}
}
