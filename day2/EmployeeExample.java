package day2;

import java.util.Scanner;

public class EmployeeExample {

	public static void main(String[] args) {
		
		System.out.println("Enter salary of Employee");
		Scanner sc=new Scanner(System.in);
		double os=sc.nextDouble();
		double rs=0;
		
		System.out.println("Enter Experiance of Employee");
		// Scanner sc1=new Scanner(System.in);
		int e=sc.nextInt();
		
		System.out.println("Enter reward");
		// Scanner sc2=new Scanner(System.in);
		int rw =sc.nextInt();
		sc.close();
		if(e>=3 && e<=5)
		{
			rs=1.1*os;
		}
			else if(e>=6 && e<=9)
			{
				rs=1.15*os;
			}
		else if(e>=10 && e<=20)
			{
				rs=1.5*os;
			}
		else
		{
			rs=1.25*os;
		}
		 rs=rs+rw;
		 System.out.println("Revise Salary of Employee " +rs);
	}

}
