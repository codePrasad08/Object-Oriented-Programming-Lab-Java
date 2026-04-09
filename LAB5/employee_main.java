import java.io.*;
import java.util.Scanner;

class EMPLOYEE
{
	String ename;
	EMPLOYEE(String n)
	{
		ename=n;
	}
	void formatEmployeeName()
	{
		boolean nextcapital=true;
		char c;
		String capname="";
		for (int i=0;i<ename.length();i++)
		{
			c=ename.charAt(i);
			if (c==' ')
			{
				capname+=c;
				nextcapital=true;
			}
			else if (nextcapital)
			{
				if (c>='a' && c<='z')
					c=(char) (c-32);
				capname+=c;
				nextcapital=false;
			}
			else
			{
				if (c>='A' && c<='Z')
					c=(char) (c+32);
				capname+=c;
				nextcapital=false;
			}
		}
		ename=capname;
	}
	String generateEmail(String mail)
	{
		boolean nextsmall=false;
		char c=ename.charAt(0);
		String email="";
		if (c>='A' && c<='Z')
		{
			c=(char) (c+32);		
			email+=c;
		}
		else
			email+=c;
		for (int i=1;i<ename.length();i++)
		{
			c=ename.charAt(i);
			if (c==' ')
			{
				nextsmall=true;
			}
			else if (nextsmall)
			{
				if (c>='A' && c<='Z')
					c=(char) (c+32);
				email+=c;
				nextsmall=true;
			}
		}
		return email+="@"+mail+".com";
	}
}

public class employee_main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter name: ");
		String nam=sc.nextLine();
		System.out.print("Enter mail: ");
		String m=sc.nextLine();

		EMPLOYEE emp=new EMPLOYEE(nam);
		emp.formatEmployeeName();
		String email=emp.generateEmail(m);
		System.out.println("Modified name: "+emp.ename);
		System.out.println("Email Address: "+email);

		sc.close();
	}
}