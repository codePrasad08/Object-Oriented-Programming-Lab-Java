//Create a array using for each loop

import java.io.*;
import java.util.Scanner;

public class array_computation
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
		System.out.println("Displaying the array: ");
		for (int ele : arr)
			System.out.print(ele +"\t");
		sc.close();
	}
}