import java.io.*;
import java.util.Scanner;
import com.course.structure.*;

public class BuildingDemo
 {
 	public static void main(String[] args)
 	{
 		Scanner sc=new Scanner(System.in);
 		int st;
 		double sqf;
		System.out.println("Enter details of house: ");
 		System.out.print("Enter the square footage: ");
 		sqf=sc.nextDouble();
 		System.out.print("Enter number of stories: ");
 		st=sc.nextInt();
 		System.out.print("Enter num of bedrooms: ");
 		int nbed=sc.nextInt();
 		System.out.print("Enter number of baths: ");
 		int nbath=sc.nextInt();
 		House h1=new House();
 		h1.setHouse(sqf,st,nbed,nbath);

 		System.out.println("Enter details of school : ");
 		System.out.print("Enter the square footage: ");
 		sqf=sc.nextDouble();
 		System.out.print("Enter number of stories: ");
 		st=sc.nextInt();
 		System.out.print("Enter num of classrooms: ");
 		int nclas=sc.nextInt();
 		System.out.print("Enter grade level: ");
 		sc.nextLine();
 		String grad=sc.nextLine();
 		School s1=new School();
 		s1.setSchool(sqf,st,nclas,grad);
 		
 		System.out.println("\n\nDisplaying House Details: ");
 		System.out.println("Details of house : ");
 		System.out.println("Square footage: "+h1.getSq());
 		System.out.println("Num of Stories: "+h1.getStory());
 		System.out.println("Num of bedrooms: "+h1.getBed());
 		System.out.println("Num of baths: "+h1.getBath());
 		
 		System.out.println("\n\nDisplaying School Details: ");
		System.out.println("Details of School: ");
		System.out.println("Square footage: "+s1.getSq());
		System.out.println("Num of Stories: "+s1.getStory());
		System.out.println("Num of classrooms: "+s1.getnClass());
		System.out.println("Grade level: "+s1.getGradelvl());
  		
 		sc.close();
 	}
 }
