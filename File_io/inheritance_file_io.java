package File_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class parent implements Serializable
{
	int a;
	public parent(int a) 
	{
		this.a = a;
	}
}

class child extends parent
{
	int b;
	public child(int b) 
	{
		super(10);
		this.b = b;
	}
}

public class inheritance_file_io 
{
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		child c =new child(5);
		FileOutputStream fos = new FileOutputStream("chocolate_icecream.txt");
		ObjectOutputStream op=new ObjectOutputStream(fos);
		op.writeObject(c);
		FileInputStream fis = new FileInputStream("chocolate_icecream.txt");
		ObjectInputStream oi=new ObjectInputStream(fis);
		child d = (child) oi.readObject();
		System.out.println(d.a +" "+ d.b);
	}
}
