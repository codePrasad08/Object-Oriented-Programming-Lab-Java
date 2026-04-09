//prime num

import java.io.*;
import java.util.Scanner;

public class prime_num
{
	public boolean isPrime(int num)
	{
		for (int i=2;i<=Math.sqrt(num);i++)
		{
			if ((num%i)==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args)
	{
		int i,n;
		Scanner sc=new Scanner(System.in);
		prime_num chk=new prime_num();
		System.out.print("Enter the number of elements: ");
		n=sc.nextInt();
		System.out.println("Enter "+ n +" elements of array: ");
		int arr[] =new int[n];
		for (i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println("Displaying the array: ");
		for (int ele : arr)
		{
			if (chk.isPrime(ele))
				System.out.print(ele+"\t");
		}
		sc.close();
	}
}