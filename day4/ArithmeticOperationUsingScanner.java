package day4;

import java.util.Scanner;

public class ArithmeticOperationUsingScanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a=sc.nextInt();
		System.out.println("Enter 2nd number");
		int b=sc.nextInt();
		sc.close();
	
		int sum=a+b;
		int sum1=a-b;
		int sum3=a*b;
		float sum4= a/b;
		System.out.println("Addition of 2 number:"+sum);
		System.out.println("Substraction of 2 number:"+sum1);
		System.out.println("Multiplication of 2 number:" +sum3);
		System.out.println("Division of 2 number:" +sum4);
	}

}
