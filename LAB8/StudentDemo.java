import java.io.*;
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

class SeatFilledException extends Exception
{	
	SeatFilledException()
	{	super("Seats are Filled with Max Limit of 25");	}
}

class Student
{	static String reg_no;
	String sname;
	GregorianCalendar date;
	short sem;
	float gpa;
	float cgpa;
	static int count=23;
	Student(String reg_no, String sname, GregorianCalendar date, short sem, float gpa, float cgpa)
	{
		this.reg_no=reg_no;
		this.sname=sname;
		this.date=date;
		this.sem=sem;
		this.gpa=gpa;
		this.cgpa=cgpa;
	}
	static String genReg(GregorianCalendar date) 
	{
		count++;
		String yr_sub=date.get(Calendar.YEAR) +"";
		yr_sub=yr_sub.substring(2,4);
		System.out.println();
		String reg="";
		if (count<10)
			reg=yr_sub+"0"+count+"";
		else	
			reg=yr_sub+count+"";
		return reg;
	}
	void display()
	{	
		System.out.println("\n\nStudent Details: ");
		System.out.println("Registration Num of Student: "+reg_no);
		System.out.println("Name of Student: "+sname);
		System.out.println("Date of Joining: "+date.get(Calendar.DATE)+"/"+date.get(Calendar.MONTH)+"/"+date.get(Calendar.YEAR));
		System.out.println("Semester: "+sem);
		System.out.println("GPA of Student: "+gpa); 
		System.out.println("CGPA of Student: "+cgpa);
	} 
	static void checkRegNum(String regnum) throws SeatFilledException
	{
		String yr_sub=regnum.substring(2,4);
		int yr_num=0;
		for (int j=0;j<yr_sub.length();j++)
		{
			char chdig=yr_sub.charAt(j);
			int dig=chdig-'0';
			yr_num=yr_num*10+dig;
		}
		System.out.print("\nNum to check: "+yr_num+"\n");
		if (yr_num>25)
			throw new SeatFilledException();
	}	
}

class StudentDemo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter num of students: ");
		int n=sc.nextInt();
		int nstud=0;
		Student st[]=new Student[n];
		for (int i=0;i<n;i++)
		{
			System.out.println("Enter Details of student "+(i+1)+" : ");
			sc.nextLine();
			System.out.print("Enter name of student: ");
			String name=sc.nextLine();
			System.out.println("Enter date of joining: ");
			System.out.print("Enter Day (DD): ");
			int day=sc.nextInt();
			System.out.print("Enter Month (MM): ");
			int mon=sc.nextInt();
			System.out.print("Enter Year(YY): ");
			int year=sc.nextInt();
			GregorianCalendar date=new GregorianCalendar(year,mon,day);
			System.out.print("Enter Semester: ");
			short sem=sc.nextShort();
			System.out.print("Enter GPA: ");
			float gpa=sc.nextFloat();
			System.out.print("Enter CGPA: ");
			float cgpa=sc.nextFloat();
			try
			{
				String regnum=Student.genReg(date); 
				Student.checkRegNum(regnum);
				st[i]=new Student(regnum,name,date,sem,gpa,cgpa);
				nstud++;
			}
			catch (SeatFilledException o)
			{ 
				System.out.println(o);
				break;
			}
		}
		for (int i=0;i<nstud;i++)
			st[i].display();
		sc.close();
	}
}