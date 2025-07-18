package String_handling;

public class String_program 
{
	public static void main(String[] args) 
	{
		String string="Hello world";
		String string1="world Hello";
		
		//find the length of the string
		System.out.println(string.length());
		
		//find the index of element
		System.out.println(string.indexOf('o'));
		
		//find the element of index position
		System.out.println(string.charAt(2));
		
		//add the content in string(concat)
		System.out.println(string.concat(" hii"));
		
		//check the element present in string
		System.out.println(string.contains("s"));
		
		//replace element
		System.out.println(string.replace("world", "india"));
		
		//check string start with a particular word
		System.out.println(string.startsWith("w"));
		
		//string compare
		System.out.println(string.equals(string1));
		
		//ignore case compare
		System.out.println(string.equalsIgnoreCase(string1));
		
		//return sign (integer) of string compare
		System.out.println(string.compareTo(string1));
		
		//remove leading and trailing spaces
		System.out.println(string.strip());
		
		//convert string into character array
		char c[]=string.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
		
		//convert string into byte array
		byte b[]= string.getBytes();
		for(int i=0;i<b.length;i++)
		{
			System.out.println((char)b[i]);
		}
		
		//count words\letters in string
		int count=0;
		String s1[]=string.split("\\s+");
		for(int i=0;i<s1.length;i++)
		{
			count+=s1[i].length();
		}
		System.out.println(count);
		
		
		String email="darshit@gmail.com";
		int a=email.indexOf("@");
		System.out.println(email.substring(0,a));
				
	}
}
