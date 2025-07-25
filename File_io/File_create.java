package File_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class File_create 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileInputStream fin=new FileInputStream("darshit.txt");
			FileInputStream fin1=new FileInputStream("dvp.txt");
			
			SequenceInputStream sin=new SequenceInputStream(fin, fin1);
			int i=0;
			while((i=fin.read())!=-1)
			{
				System.out.println((char)i);
			}
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();	
		}
		
		
	}
}
