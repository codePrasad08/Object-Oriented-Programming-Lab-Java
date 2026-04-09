import myPackages.p1.maximum;
import java.io.*;
import java.util.Scanner;

public class maximumDemo
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		float p,q,r;

		System.out.println("Enter 3 integers: ");
		System.out.print("Enter a: ");
		a=sc.nextInt();
		System.out.print("Enter b: ");
		b=sc.nextInt();
		System.out.print("Enter c: ");
		c=sc.nextInt();
		System.out.println("Maximum Integer: "+maximum.max(a,b,c));

		System.out.println("\n\nEnter 3 Floating Point Numbers: ");
		System.out.print("Enter a: ");
		p=sc.nextFloat();
		System.out.print("Enter b: ");
		q=sc.nextFloat();
		System.out.print("Enter c: ");
		r=sc.nextFloat();
		System.out.println("Maximum Floating Point Number: "+maximum.max(p,q,r));

		System.out.println("\n\nArray: ");
		System.out.print("Enter number of elements: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for (int i=0;i<n;i++)
		{
			System.out.print("Enter Element "+(i+1)+" : ");
			arr[i]=sc.nextInt();
		}
		System.out.println("Maximum Number in array: "+maximum.max(arr));


		System.out.println("\n\nMatrix: ");
		System.out.print("Enter number of rows: ");
		int row=sc.nextInt();
		int col;
		int mat[][]=new int[row][];
		for (int i=0;i<row;i++)
		{
			System.out.print("Enter number of columns in row "+i+" : ");
			col=sc.nextInt();
			mat[i]=new int[col];
			for (int j=0;j<col;j++)
			{
				System.out.println("Enter Element "+"["+i+"]"+"["+j+"]");
				mat[i][j]=sc.nextInt();
			}
		}
		System.out.println("Maximum Number in array: "+maximum.max(mat));

		sc.close();
	}
}