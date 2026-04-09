import java.io.*;
import java.util.Scanner;

interface Sports
{
	void putGrade();
}

class Student
{
	int rno;
	double smarks;
	void getNumber(int n)
	{	rno=n;	}
	void putNumber()
	{	System.out.println("Roll Number: "+rno); }
	void getMarks(double sm)
	{	smarks=sm; }
	void putMarks()
	{	System.out.println("Marks: "+smarks);	}
}

class Result extends Student implements Sports
{
	String spgrade;
	Result(int rolln,double marks,String sgr)
	{
		super.getNumber(rolln);
		super.getMarks(marks);
		spgrade=sgr;
	}
	public void putGrade()
	{	System.out.println("Sports Grade: "+spgrade);	}
	void displayFinalRes()
	{
        String finalResult;
        if (smarks >= 90 && spgrade.equals("A")) 
        {
            finalResult = "Excellent";
        }
        else if (smarks >= 75 && (spgrade.equals("A") || spgrade.equals("B"))) 
        {
            finalResult = "Good";
        }
        else if (smarks >= 50 && (spgrade.equals("A") || spgrade.equals("B") || spgrade.equals("C"))) 
        {
            finalResult = "Satisfactory";
        }
        else
        {
            finalResult = "Needs Improvement";
        }
        System.out.println("Final Result: " + finalResult);
    }
}

class StudentDemo
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of Students: ");
		int n=sc.nextInt();
		System.out.println("Enter details of Students: ");
		Result res[]=new Result[n];
		for (int i=0;i<n;i++)
		{
			System.out.println("\n\nEnter details of Student "+(i+1)+" : ");
			System.out.print("Enter roll no: ");
			int rno=sc.nextInt();
			System.out.print("Enter marks: ");
			double sm=sc.nextDouble();
			System.out.print("Enter Sports Grade: ");
			sc.nextLine();
			String sgr=sc.nextLine();
			res[i]=new Result(rno,sm,sgr);
		}
		for (int i=0;i<n;i++)
		{
			System.out.println("\n\nDetails of Student "+(i+1)+" : ");
			res[i].putNumber();
			res[i].putMarks();
			res[i].putGrade();
			res[i].displayFinalRes();
		}
		sc.close();
	}
}