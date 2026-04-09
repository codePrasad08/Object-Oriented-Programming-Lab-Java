import java.io.*;
import java.util.Scanner;

class EMPLOYEE{
	String ename;
	int eid;
	double basic;
	double da;
	double gross_sal;
	double net_sal;
	void read(String n,int i,double b)
	{
		ename=n;
		eid=i;
		basic=b;
	}
	void compute_netSal()
	{
		da=(0.52)* basic;
		gross_sal= basic+da;
		double it=(0.3)*gross_sal;
		net_sal=basic+da+gross_sal-it;
	}
	void display()
	{
			System.out.println("DETAILS of EMPLOYEE:");
			System.out.println("Name: "+ename);
			System.out.println("ID: "+eid);
			System.out.println("Basic: "+basic);
			System.out.println("DA: "+da);
			System.out.println("Gross Salary: "+gross_sal);
			System.out.println("Net Salary: "+net_sal);
	}
}

public class employee_main{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of employees: ");
		int n=sc.nextInt();
		EMPLOYEE emp[]= new EMPLOYEE[n];
		for (int i=0;i<n;i++)
		{
			System.out.println("Enter DETAILS of EMPLOYEE"+(i+1));
			System.out.println("Enter name: ");
			String nam=sc.nextLine();
			System.out.println("Enter ID: ");
			int id=sc.nextInt();
			System.out.println("Enter Basic: ");
			double bas=sc.nextInt();
			emp[i]=new EMPLOYEE();
			emp[i].read(nam,id,bas);
			emp[i].compute_netSal();
			emp[i].display();
		}
	}
}