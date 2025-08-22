package DSA;

import java.util.ArrayList;
import java.util.Collections;

public class compartable_program implements Comparable<compartable_program>
{
	int id;
	String name;
	public compartable_program(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	
	@Override
	public int compareTo(compartable_program o) {
		// TODO Auto-generated method stub
		if(id==o.id)
		{
			return 0;
		}
		else if(id>o.id)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	public static void main(String[] args) 
	{
		ArrayList<compartable_program> al=new ArrayList<compartable_program>();
		al.add(new compartable_program(5, "abc"));
		al.add(new compartable_program(8, "xbc"));
		al.add(new compartable_program(3, "kbc"));
		al.add(new compartable_program(1, "rbc"));
		al.add(new compartable_program(9, "qbc"));
		Collections.sort(al);
		for(compartable_program cp:al)
		{
			System.out.println(cp.id+" "+cp.name);
		}
	}
}