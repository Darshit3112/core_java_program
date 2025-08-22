package DSA;

import java.util.HashSet;

public class SetApi 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(1);
		hs.add(8);
		hs.add(2);
		hs.add(9);
		hs.add(3);
		hs.add(4);
		hs.add(1);
	for(Integer h:hs)
	{
		System.out.println(h);
	}
	}
}
