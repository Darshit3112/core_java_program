package File_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class Fileio_create 
{
	public static void main(String[] args) throws IOException 
	{
		//FileOutputStream fos= new FileOutputStream("C:\\Users\\pc-java\\eclipse-workspace\\Darshit_project\\src\\File_io\\test.txt");
	//	String s="test";
//		fos.write(s.getBytes());
		
		FileInputStream fis=new FileInputStream("darshit.txt");
		FileInputStream fos=new FileInputStream("C:\\Users\\pc-java\\eclipse-workspace\\Darshit_project\\src\\File_io\\test.txt");
		SequenceInputStream sin=new SequenceInputStream(fis, fos); 
		
		int i=0;
		while((i=sin.read())!=-1)
		{
			System.out.println((char)i);
		}
	}
}
