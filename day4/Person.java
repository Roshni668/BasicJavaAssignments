package day4;

import java.util.Scanner;

public class Person {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter name:");
		String a=sc.nextLine();
		
		System.out.println("Enter age:");
		int b=sc.nextInt();
		
		System.out.println("Enter gender:");
		String c=sc.next();
		sc.nextLine();
		System.out.println("Enter address");
		String d=sc.nextLine();
		
		sc.close();
		
		System.out.println("Name of person:" +a);
		System.out.println("Age of person:" +b);
		System.out.println("Gender of person:" +c);
		System.out.println("Address of person:" +d);
	}

}
