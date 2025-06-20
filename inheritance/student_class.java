package inheritance;

import java.util.Scanner;

public class student_class 
{
	public student_class()
	{
		int arr[]= new int[5];
		double avg=0.0;
		int total=0,max=0,min=0;
		Scanner scn=new Scanner(System.in);
		System.out.println("enter 5 marks");
		for(int i=0;i<5;i++)
		{
			arr[i]=scn.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			total=total+arr[i];
			avg=(double)total/5;
			max=arr[0];
			if(arr[i]>max)
			{
				max=arr[i];
			}
			min=arr[0];
			if(arr[i]<min)
			{
				min=arr[i];
			}
			
		}
		System.out.print("total marks="+total+" average marks="+avg+" max marks="+max+" min marks="+min);
	}
	public static void main(String[] args) 
	{
		student_class sc=new student_class();
	}
}
