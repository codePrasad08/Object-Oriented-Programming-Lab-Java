import java.io.*;
import java.util.Scanner;
public class Comma_nums{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Numbers: ");
		String nums=sc.next();
		String modifi="";
		int count=1;
		for (int i=nums.length()-1;i>=0;i--)
		{
			if (count%3==0)
			{
				modifi+=nums.charAt(i);
				modifi+=',';
			}
			else
				modifi+=nums.charAt(i);
			count++;
		}
		nums="";
		int n=modifi.length();
		for (int i=n-1;i>=0;i--)
		{
			nums+=modifi.charAt(i);
		}
		System.out.println("Modified String: "+nums);
		sc.close();
	}
}
