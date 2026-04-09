import java.io.*;
import java.util.Scanner;

class Bank_Account{
	String depo_name;
	int acc_num;
	String type_acc;
	double bal;
	static double rate=4;
	Bank_Account()
	{
		depo_name="Unknown";
		acc_num=0;
		type_acc="Savings";
		bal=0;
	}
	Bank_Account(String name,int n,String t,double b)
	{
		depo_name=name;
		acc_num=n;
		type_acc=t;
	}
	void deposit(double b)
	{
		System.out.println("Enter the amount to deposit: ");
		double depo_amnt=sc.nextDouble();
		bal=bal+depo_amnt;
		System.out.println("Current balance: "+bal);
	}
	void withdraw()
	{
		double min_bal=5000;
		if (bal<5000)
			System.out.println("Insufficient balance!");
		else 
		{
			System.out.println("Enter amount tot withdraw: ");
			double wdraw=sc.nextDouble();
			bal=bal-wdraw;
			System.out.println("Current balance: "+bal);
		}
	}
	void display()
	{
		System.out.println("Bank Details:");
		System.out.println("Depositor Name: "+depo_name);
		System.out.println("Account Number: "+acc_num);
		System.out.println("Account Type: "+type_acc);
		System.out.println("Balance: "+bal);
		System.out.println("Rate: "+rate);
	}
	static void display_rate_ofint()
	{

	}
}
public class account_demo
{
	public static void main(String[] args)
	{
		Bank_Account a1=new Bank_Account()
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter below details of bank: ");
		System.out.print("Enter name of depositor: ");
		String name=sc.nextLine();
		System.out.print("Enter account number: ");
		int n=sc.nextInt();
		System.out.print("Enter type of account: ");
		String t=sc.nextLine();
		System.out.print("Enter balance amount: ");
		double b=sc.nextDouble();
		System.out.print("Enter rate of interest: ");
		double r=sc.nextDouble();
		Bank_Account a2=new Bank_Account(name,n,t,b,r);
		sc.close()
	}
}