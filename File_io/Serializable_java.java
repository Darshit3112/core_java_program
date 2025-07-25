package File_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class test implements Serializable
{
	int id;
	String name;
	public test(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
}
public class Serializable_java 
{
	public static void main(String[] args) 
	{
		test t=new test(1,"Darshit");
		
		try  
		{
			/*
			 * FileOutputStream fout=new FileOutputStream("test.txt"); ObjectOutputStream
			 * o=new ObjectOutputStream(fout); o.writeObject(t);
			 */
			
			FileInputStream fin=new FileInputStream("test.txt");
			ObjectInputStream obj=new ObjectInputStream(fin);
			test test=(test) obj.readObject();
			System.out.println(test.id+" "+test.name);
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		} 
		 catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
}
