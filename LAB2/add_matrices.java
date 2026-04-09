//add 2 matrices

import java.io.*;
import java.util.Scanner;

public class add_matrices
{
	public static void main(String[] args)
	{
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows and columns in Matrix1: ");
		int m1=sc.nextInt();
		int n1=sc.nextInt();
		System.out.print("Enter the number of rows and columns in Matrix2: ");
		int m2=sc.nextInt();
		int n2=sc.nextInt();
		if ((m1==m2) && (n1 ==n2))
		{
			System.out.println("Enter elements of Matrix1: ");
			int mat1[][]= new int[m1][n1];
			for (i=0;i<m1;i++)
			{
				for (j=0;j<n1;j++)
					mat1[i][j]=sc.nextInt();
			}
			System.out.println("Enter elements of Matrix2: ");
			int mat2[][]= new int[m2][n2];
			for (i=0;i<m2;i++)
			{
				for (j=0;j<n2;j++)
					mat2[i][j]=sc.nextInt();
			}
			int res[][] = new int[m1][n1];
			for (i=0;i<m1;i++)
			{
				for (j=0;j<n1;j++)
					res[i][j]=mat1[i][j]+mat2[i][j];
			}
			for (i=0;i<m1;i++)
			{
				for (j=0;j<n1;j++)
					System.out.print(res[i][j]+ "\t");
				System.out.print("\n");
			}

		}
		else
			System.out.println("Matrices cannot be added as the order is not the same");
		sc.close();
	}
}