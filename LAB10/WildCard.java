import java.io.*;
import java.util.Scanner;

class Employee
{	
	String name;
	int id;
	double basic;
	Employee(String name,int i,double b)
	{
		this.name=name;
		id=i;
		basic=b;
	}
}

class Student
{	
	String name;
	int id;	
	int marks_array[]=new int[5];
	Student(String name,int i,int mark[])
	{
		this.name=name;
		id=i;
		marks_array=mark;
	}
}

class GenStack<T>
{
	private T arr[];
	private int tos;
	GenStack(T obArr[])
	{
		arr=obArr;
		tos=-1;
	}
	private boolean isFull()
	{
		return (tos==arr.length-1);
	}
	private boolean isEmpty()
	{
		return (tos==-1);
	}
	void push(T ele)
	{
		if (!isFull())
		{
			arr[++tos]=ele;
		}
	}
	T pop()
	{
		return arr[tos--];
	}
	void Compare(GenStack<?> o)
	{
		System.out.println("Invoking Object: "+arr[0].getClass().getName());
		System.out.println("Parameterised Object: "+o.arr[0].getClass().getName());
		if (o.tos==this.tos)
			System.out.println("Equal top of stack for both classes");
		else
			System.out.println("Unequal top of stack!");

	}
}
class WildCard
{
	public static void main(String[] args)
	{
		String name;
		int id;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Student stack size: ");
		int stnum=sc.nextInt();
		Student st[]=new Student[stnum];
		GenStack<Student> genst=new GenStack<>(st);

		for (int i=0;i<stnum;i++)
		{
			System.out.println("Enter details of student "+(i+1)+": ");
			sc.nextLine();
			System.out.print("Enter name of student: ");
			name=sc.nextLine();
			System.out.print("Enter ID of student: ");
			id=sc.nextInt();
			System.out.println("Enter marks in 5 subjects: ");
			int mark[]=new int[5];
			for (int j=0;j<5;j++)
			{
				System.out.print("Enter marks in Subject"+(j+1)+": ");
				mark[j]=sc.nextInt();
			}
			st[i]=new Student(name,id,mark);
			genst.push(st[i]);
			System.out.println("Element Pushed! ");
		}
		System.out.print("\nEnter the Employee stack size: ");
		int empnum=sc.nextInt();

		Employee em[]=new Employee[empnum];
		GenStack<Employee> genem=new GenStack<>(em);
		for (int i=0;i<empnum;i++)
		{
			System.out.println("Enter details of employee:");
			System.out.print("Enter name of employee: ");
			sc.nextLine();
			name=sc.nextLine();
			System.out.print("Enter ID of student: ");
			id=sc.nextInt();
			System.out.print("Enter Basic of employee: ");
			double bsc=sc.nextInt();
			em[i]=new Employee(name,id,bsc);
			genem.push(em[i]);
			System.out.println("Element Pushed! ");
		}
		genem.Compare(genst);
		sc.close();
	}
}