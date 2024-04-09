package day2;

import java.util.Scanner;
public class BiggestNumber2 {

	public static void main(String[] args) {
		
		System.out.println("Enter 1st number");
		
		Scanner sc =new Scanner(System.in);
		  int a =  sc.nextInt();
		    
		 System.out.println("Enter 2nd number");
		 int b= sc.nextInt();
		 
		 System.out.println("Enter 3rd number");
		 int c= sc.nextInt();
		 sc.close();
		 if(a>b && a>c)
		 {
			 System.out.println("A is the 1st biggest number: " +a);
			 if(b>c)
			 {
				 System.out.println("b is the 2nd biggest number: " +b);
				 System.out.println("c is the 3rd biggest number: "+c);
			 }
			 else
			 {
				 System.out.println("c is the 2nb biggest number:" +c);
				 System.out.println("b is the 3rd biggest number:" +b);
			 }
		 }
		 else if(b>a && b>c)
		 {
			 System.out.println("B is the 1st biggest number: " +b);
		 
			  if(a>c)
			 {
				 System.out.println("a is 2nd the biggest number: " +a);
				 System.out.println("c is the 3rd biggest number: " +c);
				 	
			 }
			  else
			  {
				  System.out.println("C is the 2nd biggest number: " +c);
				  System.out.println("A is the 3rd biggest number: " +a);
			  }
		 }
		 else	 
		 {
			 System.out.println("C is the 1st biggest number:" +c);
			 if(a>b)
			 {
				 System.out.println("A is the 2nd biggest number: " +a);
				 System.out.println("B is the 3rd biggest number: " +b);
			 }
			 else
			 {
				 System.out.println("B is the 2nd biggest number: " +b);
				 System.out.println("A is the 3rd biggest number: " +a);
			 }
		 }
	}
}
			