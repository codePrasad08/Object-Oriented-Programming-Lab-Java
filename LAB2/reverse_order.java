//Create a array, reverse the order of elements

import java.io.*;
import java.util.Scanner;

public class reverse_order
{
	public static void main(String[] args)
	{
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		n=sc.nextInt();
		System.out.println("Enter "+ n +" elements of array: ");
		int arr[] =new int[n];
		for (i=0;i<n;i++)
			arr[i]=sc.nextInt();

		/*reverse
		System.out.println("Reverse Order of Array: ");
		for (i=n-1;i>=0;i--)
			System.out.print(arr[i] +"\t");*/

		int temp;
		for (i=0;i<n/2;i++)
		{
			temp=arr[i];
			arr[i]=arr[n-i-1];
			arr[n-i-1]=temp;
		}
		for (int ele : arr)
			System.out.print(ele +"\t");
		sc.close();
	}
}