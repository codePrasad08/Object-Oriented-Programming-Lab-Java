package myPackages.p1;
import java.io.*;
public class maximum
{
	public static int max(int a,int b,int c)
	{
		if ((a>b)&&(a>c))
			return a;
		else if (b>c)
			return b;
		else
			return c;
	}
	public static float max(float a,float b,float c)
	{
		if ((a>b)&&(a>c))
			return a;
		else if (b>c)
			return b;
		else
			return c;
	}
	public static int max(int arr[])
	{
		int large=arr[0];
		for (int i=1;i<arr.length;i++)
		{
			if (large<arr[i])
				large=arr[i];
		}
		return large;
	}
	public static int max(int arr[][])
	{
		int large=arr[0][0];
		for (int i=0;i<arr.length;i++)
		{
			for (int j=0;j<arr[i].length;j++)
			{
				if (large<arr[i][j])
					large=arr[i][j];
			}
		}
		return large;
	}
}