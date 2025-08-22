package DSA;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist_class 
{
	public static void main(String[] args) 
	{
		//create array
		ArrayList<Integer> al=new ArrayList<Integer>();
		//add element
		al.add(12);
		al.add(13); 
		al.add(14);
		
		//remove element
		al.remove(0);
		
		
		//find index of any element
		System.out.println(al.indexOf(13));
		
		al.set(1,12222);
		
		//find element from index
		System.out.println("find element from index "+al.get(0));
		al.addFirst(1);
		al.addLast(10000);
		al.removeFirst();
		al.removeLast();
		System.out.println(al.contains(122));
		
		//print element
		Iterator<Integer> i=al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
