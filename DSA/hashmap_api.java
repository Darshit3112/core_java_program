package DSA;

import java.util.HashMap;
import java.util.Map;

public class hashmap_api 
{
	public hashmap_api() 
	{	
	HashMap<Integer,String> hm=new HashMap<Integer, String>();
	hm.put(1,"Darshit");
	hm.put(2,"DVP");
	hm.put(3,"Darshit");
	System.out.println(hm);
	
	for(Map.Entry<Integer, String> entry:hm.entrySet())
	{
		System.out.println(entry.getKey()+" "+entry.getValue());
	} 
	for(Integer key:hm.keySet())
	{
		System.out.println(key+" "+hm.get(key));
	}
	for(String value:hm.values())
	{
		System.out.println(value);
	}
	}
	public static void main(String[] args) 
	{
		new hashmap_api();
	}
}