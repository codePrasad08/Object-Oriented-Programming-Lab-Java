import java.io.*;
import java.util.Scanner;

class Gregorian
{	
	int day;
	int month;
	String year;
	Gregorian (int d, int m, String y)
	{
		day=d;
		month=m;
		year=y;
	}
}

class Student
{
	int reg_no;
	String sname;
	Gregorian date;
	short sem;
	float gpa;
	float cgpa;
	Student(String sname, Gregorian date, short sem, float gpa, float cgpa)
	{
		this.sname=sname;
		this.date=date;
		this.sem=sem;
		this.gpa=gpa;
		this.cgpa=cgpa;
	}
	void genReg(Student[] st,int ids[])
	{
		for (int i=0;i<st.length;i++)
		{
			String yr_sub=st[i].date.year.substring(2,4);
			String reg="";
			reg=yr_sub+ids[i]+"";
			int renum = 0;
			for (int j=0;j<reg.length();j++) 
			{
            	char chdig = reg.charAt(j);
            	int dig = chdig - '0'; 
            	renum = renum * 10 + dig;
            }
            st[i].reg_no=renum;
        }
	}
	void display()
	{
		System.out.println("Student Details: ");
		System.out.println("Registration Num of Student: "+reg_no);
		System.out.println("Name of Student: "+sname); 
		System.out.println("Date of Joining: "+date.day+"/"+date.month+"/"+date.year);
		System.out.println("Semester: "+sem);
		System.out.println("GPA of Student: "+gpa);
		System.out.println("CGPA of Student: "+cgpa);
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
			else
				return false;
		}
		return false;
	}
	void sortName(Student[] studs)
	{
		int n=studs.length;
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<n-i-1;j++)
			{
				if (StrGreater(studs[j].sname,studs[j+1].sname))
				{
					Student temp=studs[j];
					studs[j]=studs[j+1];
					studs[j+1]=temp;
				}
			}
		}
	}
	void sortSemCgpa(Student[] studs)
	{
		int n=studs.length;
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<n-i-1;j++)
			{
				if ((studs[j].sem>studs[j+1].sem) || ((studs[j].sem==studs[j+1].sem) && (studs[j].cgpa<studs[j+1].cgpa)))
				{
					Student temp=studs[j];
					studs[j]=studs[j+1];
					studs[j+1]=temp;
				}			
			}
		}
	}
	void startswith(Student[] studs,char ch)
	{
		int found=0;
		for (Student st: studs)
		{
			if (st.sname.charAt(0)==ch)
			{
				found=1;
				System.out.println("Name: "+st.sname);
			}
		}
		if (found==0)
			System.out.println("No name startswith the chararcter "+ch);
	}
	void substring(Student[] studs,String sub)
	{
		int found=0;
		for (Student st: studs)
		{
			if (st.sname.indexOf(sub)!=-1)
			{
				found=1;
				System.out.println(st.sname);
			}
		}
		if (found==0)
			System.out.println("No name contains the substring "+sub);
	}
	void modifyName(Student[] studs)
	{ 
		char c;
		for (Student st:studs)
		{
			int cspaces=0;
			for (int i=0;i<st.sname.length();i++)
			{
				if (st.sname.charAt(i)==' ')
					cspaces+=1;
			}
			String name_wrds[]=new String[cspaces+1];
			int pos=0,count=0;
			String init="";
			String name=st.sname;
			for (int i=0;i<name.length();i++)
			{
				c=name.charAt(i);
				if (c==' ')
				{
					name_wrds[count]=name.substring(pos,i);
					pos=i+1;
					count++;
				}
			}
			for (int j=0;j<count;j++)
			{
				c=name_wrds[j].charAt(0);
				if (c>='a' && c<='z')
					c=(char) (c- 32);
				init+=c+".";
			}
			init+=name.substring(pos,name.length());
			st.sname=init;
		}
	}
}

class Student_Rec
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of students (atleast 5): ");
		int n=sc.nextInt();
		Student st[]=new Student[n]; 
		int ids[]=new int[n];
		for (int i=0;i<n;i++)
		{
			System.out.println("\nEnter details of student"+(i+1)+":");
			sc.nextLine();
			System.out.print("Enter name of student: ");
			String name=sc.nextLine();
			System.out.print("Enter id of Student (nth student): ");
			ids[i]=sc.nextInt();
			System.out.println("Enter Date:");
			System.out.print("Enter Day (DD): ");
			int day=sc.nextInt();
			System.out.print("Enter Month (MM): ");
			int mon=sc.nextInt();
			sc.nextLine();
			System.out.print("Enter Year (YYYY): ");
			String year=sc.nextLine();
			Gregorian dat=new Gregorian(day,mon,year);
			System.out.print("Enter Semester: ");
			short sem=sc.nextShort();
			System.out.print("Enter GPA: ");
			float gpa=sc.nextFloat();
			System.out.print("Enter CGPA: ");
			float cgpa=sc.nextFloat();
			st[i]=new Student(name,dat, sem,gpa,cgpa);
		}
		System.out.println();

		st[0].genReg(st,ids);
		int k=1;
		System.out.println("Displaying Student Details: ");
		for (Student so: st)
		{
			System.out.println("\nStudent "+k+": ");
			so.display(); 
			k++;
			System.out.println();
		}

		System.out.println("Sorted Based of Semester and CGPA: ");
		st[0].sortSemCgpa(st);
		k=1;
		for (Student so: st)
		{
			System.out.println("\nStudent "+k+": ");
			so.display(); 
			k++;
			System.out.println();
		}


		System.out.println("Sorted Based of Name: ");
		st[0].sortName(st);
		k=1;
		for (Student so: st)
		{
			System.out.println("\nStudent "+k+": ");
			so.display(); 
			k++;
			System.out.println();
		}

		System.out.print("\nEnter character to search names : ");
		char ch=sc.next().charAt(0);
		System.out.println("\nStudent Names Starting with " +ch+" : ");
		st[0].startswith(st,ch);

		System.out.print("\nEnter substring to search: ");
		String sub=sc.next();
		System.out.println("\nStudent Names with substring "+sub+" : ");
		st[0].substring(st,sub);

		st[0].modifyName(st);
		System.out.println("\nStudent List with Modified Names: ");
		k=1;
		for (Student so: st)
		{
			System.out.println("\nStudent "+k+": ");
			so.display(); 
			k++;
			System.out.println();
		}
		sc.close();
	}
}