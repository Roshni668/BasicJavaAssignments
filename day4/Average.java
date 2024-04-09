package day4;

import java.util.Scanner;
public class Average {
	double i;
	double j;
	double k;
	
	Average(double x,double  y,double  z)
	{
		this.i=x;
		this.j=y;
		this.k=z;
	}
	
	public void calculate()
	{
			double average=((this.i+this.k+this.k)/3);
			System.out.println("Average of 3 number :"+average);
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		double a= sc.nextDouble();
		System.out.println("Enter second number");
		double  b=sc.nextDouble();
		System.out.println("Enter third number");
		double  c=sc.nextDouble();
 		Average a1=new Average(a,b,c);
 	
 		a1.calculate();
		sc.close();
	}

}
