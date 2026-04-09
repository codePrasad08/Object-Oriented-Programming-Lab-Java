import java.io.*;
import java.util.Scanner;

interface Series
{
	int GetNext();
	void reset();
	void setStart(int x);
}

class ByTwos implements Series
{
	int start,val;
	ByTwos()
	{
		start=0;
		val=0;
	}
	public int GetNext()
	{
		val+=2;
		return val;
	}
	public void reset()
	{	val=start;}
	public void setStart(int x)
	{
		start=x;
		val=x;
	}
}

class SeriesDemo
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		ByTwos ob=new ByTwos();
		System.out.print("Enter value of n: ");
		int n=sc.nextInt();
		int i;
		for (i=0;i<n;i++)
			System.out.println(ob.GetNext());
		System.out.print("Enter value to start series: ");
		ob.reset();
		int x=sc.nextInt();
		ob.setStart(x);
		for (i=0;i<n;i++)
			System.out.println(ob.GetNext());
		sc.close();
	}
}