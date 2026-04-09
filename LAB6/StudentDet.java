import java.io.*;
import java.util.Scanner;

class Student
{
	String name;
	int id;
	Student(String n,int i)
	{
		name=n;
		id=i;
	}
	public void setSportG(int grd)
	{	System.out.println("Inside Superclass");}
	public void setExamG(int grd)
	{	System.out.println("Inside Superclass");}
	public int getSportG()
	{	return 0;}
	public int getExamG()
	{	return 0;}
	public void setfinGrade()
	{	System.out.println("Inside Superclass");}
	public void display()
	{	
		System.out.println("Name: "+name);
		System.out.println("ID: "+id);
	}
}

interface Sports
{
	int s_grade=0;
	void setSportG(int grd);
	int getSportG();
}

interface Exam
{
	int e_grade=0;
	void setExamG(int grd);
	int getExamG();
}

class Results extends Student implements Sports,Exam
{
	int s_grade;
	int e_grade;
	String fin_res;
	Results(String nam,int id)
	{
		super(nam,id);
	}
	public void setSportG(int grd)
	{ 	s_grade=grd;}
	public void setExamG(int grd)
	{	e_grade=grd;}
	public int getSportG()
	{	return s_grade;}
	public int getExamG()
	{	return e_grade;}
	public void setfinGrade()
	{
		int avg=(s_grade+e_grade)/2;
		if (avg>=90)
			fin_res="A";
		else if (avg>=80)
			fin_res="B";
		else if (avg>=70)
			fin_res="C";
		else if (avg>=60)
			fin_res="D";
		else if (avg>=50)
			fin_res="E";
		else
			fin_res="F";
	}
	public void display()
	{
		super.display();
		System.out.println("Final Result: "+fin_res);
	}
}
public class StudentDet
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.print("Enter num of students: ");
		int n=sc.nextInt();
		Student st[]=new Student[n];
		for (i=0;i<n;i++)
		{
			System.out.println("\n\nEnter details of student"+(i+1)+" : ");
			System.out.print("Enter name: ");
			sc.nextLine();
			String nam=sc.nextLine();
			System.out.print("Enter id: ");
			int id=sc.nextInt();
			System.out.print("Enter Sports Grade: ");
			int sgr=sc.nextInt();
			System.out.print("Enter Exam Grade: ");
			int egr=sc.nextInt();
			st[i]=new Results(nam,id);
			st[i].setSportG(sgr);
			st[i].setExamG(egr);
			st[i].setfinGrade();
			System.out.println("\nDisplaying Details:\n");
			st[i].display();
		}
		sc.close();
	}
}