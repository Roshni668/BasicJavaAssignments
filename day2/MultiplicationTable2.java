package day2;

import java.util.Scanner;
public class MultiplicationTable2 {

	public static void main(String[] args) {
		int i=1;
		int m=0;
		
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Enter number : ");
			int j=sc.nextInt();
			
			System.out.println("Multiplication Table");
			sc.close();
			for(i=1;i<=10;i++)
			{
				m=j*i;
				System.out.println( j + " * "+i +" =" +m );
			}
			
	}
	}

