import java.io.*;

class STUDENT{
	String sname;
	int marks_array[]=new int[5];
	int total;
	float avg;
	void assign(String name,int marks[])
	{
		sname=name;
		marks_array=marks;
	}
	void display()
	{
		System.out.println("Name: "+sname);
		for (int i=0;i<marks_array.length;i++)
			System.out.println("Marks in Subject "+(i+1)+": "+marks_array[i]);
	}
	void compute()
	{
		total=0;
		for (int mark : marks_array)
			total+=mark;
		avg=(float) total/(marks_array.length);
		System.out.println("Total Marks: "+total);
		System.out.println("Average of Marks: "+avg);
	}
}

public class student_main{
	public static void main(String[] args)
	{
		STUDENT s1=new STUDENT();
		s1.assign("Sakshi",new int[] {99,90,95,100,97});
		System.out.println("First Student: ");
		s1.display();
		s1.compute();
	}
}