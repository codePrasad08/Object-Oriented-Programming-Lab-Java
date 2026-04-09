import java.io.*;
import java.util.Scanner;

class STUDENT{
	String sname;
	STUDENT(String name)
	{
		sname=name;
	}
	String extractinitials()
	{
		boolean nextcapital=true;
		char c;
		String init="";
		for (int i=0;i<sname.length();i++)
		{
			c=sname.charAt(i);
			if (c==' ')
			{
				nextcapital=true;
			}
			else if (nextcapital)
			{
				if (c>='a' && c<='z')
					c=(char) (c-32);
				init+=c;
				nextcapital=false;
			}
		}
		return init;
	}
	String removeWhiteSpace()
	{
		String modiname="";
		char c;
		for (int i=0;i<sname.length();i++)
		{
			c=sname.charAt(i);
			if (c!=' ')
			{
				modiname+=c;
			}
		}
		return modiname;
	}
	void list_sub(STUDENT[] students,String sub)
	{
		System.out.println("List Of Student Names with Substring "+sub+": ");
		for (STUDENT st:students)
		{
			if (st.sname.indexOf(sub)!=-1)
			{
				System.out.println(st.sname);
			}
		}
	}
	boolean StrGreater(String s1,String s2)
	{
		int n1=s1.length();
		int n2=s2.length();
		int minl=n1<n2? n1:n2;
		for (int i=0;i<minl;i++)
		{
			char c1=s1.charAt(i);
			char c2=s2.charAt(i);
			if (c1>c2)
				return true;
			return false;
		}
		return false;
	}
	void sort(STUDENT[] studs)
	{
		int n=studs.length;
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<n-i-1;j++)
			{
				if (StrGreater(studs[j].sname,studs[j+1].sname))
				{
					STUDENT temp=studs[j];
					studs[j]=studs[j+1];
					studs[j+1]=temp;
				}
			}
		}
	}
}

public class stringstud{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of students: ");
		int n=sc.nextInt();
		sc.nextLine();
		STUDENT st[]=new STUDENT[n];
		for (int i=0;i<n;i++)
		{
			System.out.print("Enter name of student "+(i+1)+": ");
			String name=sc.nextLine();
			st[i]=new STUDENT(name);

			String in=st[i].extractinitials();
			System.out.println("Initials of Student "+(i+1)+" : "+in);

			String modified=st[i].removeWhiteSpace();
			System.out.println("Name without Whitespaces: "+modified);
		}
		System.out.print("Enter Substring: ");
		String sub=sc.nextLine();
		st[0].list_sub(st,sub);

		st[0].sort(st);

		System.out.println("Alphebtically Sorted List: ");
		for (int i=0;i<n;i++)
		{
			System.out.println("Name of Student "+(i+1)+" : "+st[i].sname);
		}
		sc.close();
	}
}