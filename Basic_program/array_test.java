package Basic_program;

import java.util.ArrayList;
import java.util.Scanner;

public class array_test 
{
	public array_test() 
	{
	ArrayList<String> al=new ArrayList<String>();
	Scanner scn=new Scanner(System.in);
	System.out.println("ENTER NAME=");
	for(int i=0;i<3;i++)
	{
		String name=scn.next();
		al.add(name);
	}
	for(String s:al)
	{
		System.out.println(s);
	}
	}
	public static void main(String[] args) 
	{
		array_test at=new array_test();
	}
}
