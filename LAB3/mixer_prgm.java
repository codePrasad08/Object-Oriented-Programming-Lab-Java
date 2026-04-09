import java.io.*;
import java.util.*;


class Mixer
{
	int[] arr;
	void accept(int sort_arr[],int n)
	{
		int[] temp=new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) 
            if (sort_arr[i] != sort_arr[i + 1])
                temp[j++] = sort_arr[i];
        temp[j++] = sort_arr[n - 1];
        arr=new int[j];
        for (int i=0;i<j;i++)
        	arr[i]=temp[i];
	}

	void display()
	{
		for (int ele:arr)
			System.out.print(ele+"\t");
		System.out.println();
	}
	Mixer mix(Mixer A)
	{
		int i,temp,j;
		int reslt_n=arr.length+A.arr.length;
		int[] reslt_arr=new int[reslt_n];
		Mixer reslt=new Mixer();
		for (i=0;i<arr.length;i++)
			reslt_arr[i]=arr[i];
		for (j=0;j<A.arr.length;j++)
			reslt_arr[i++]=A.arr[j];
		for (i=0;i<reslt_n-1;i++)
		{
			for (j=i+1;j<reslt_n;j++)
			{
				if (reslt_arr[i]>reslt_arr[j])
				{
					temp=reslt_arr[i];
					reslt_arr[i]=reslt_arr[j];
					reslt_arr[j]=temp;
				}
			}
		}
		reslt.accept(reslt_arr,reslt_n);
		return reslt;
	}
}
public class mixer_prgm
{
	public static void main(String[] args)
	{
		int i,ele,j,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements in array1: ");
		int n1=sc.nextInt();
		int a[]=new int[n1];
		System.out.println("Enter elements of array1: ");
		for (i=0;i<n1;i++)
		{
			ele=sc.nextInt();
			a[i]=ele;
		}
		System.out.println("Enter number of elements in array2: ");
		int n2=sc.nextInt();
		int b[]=new int[n2];
		System.out.println("Enter elements of array2: ");
		for (i=0;i<n2;i++)
		{
			ele=sc.nextInt();
			b[i]=ele;
		}
		for (i=0;i<n1-1;i++)
		{
			for (j=i+1;j<n1;j++)
			{
				if (a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for (i=0;i<n2-1;i++)
		{
			for (j=i+1;j<n2;j++)
			{
				if (b[i]>b[j])
				{
					temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		Mixer m1=new Mixer();
		m1.accept(a,n1);
		System.out.println("Inputted Array1: ");
		m1.display();
		Mixer m2=new Mixer();
		m2.accept(b,n2);
		System.out.println("Inputted Array2: ");
		m2.display();
		Mixer res=m1.mix(m2);
		System.out.println("Merged Array: ");
		res.display();
		sc.close();
	}
}