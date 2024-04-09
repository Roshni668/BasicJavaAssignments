package Assignment;
import java.util.Scanner;
public class ArathmeticOperation {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a=sc.nextInt();
		System.out.println("Enter 2nd number");
		int b=sc.nextInt();
		sc.close();
		int add=a+b;
		int sub=a-b;
		int mul=a*b;
		int div=a/b;
		int rem=a%b;
		System.out.println("addition of two number:" +add);
		System.out.println("substraction of two number:" +sub);
		System.out.println("multiplication of two number:" +mul);
		System.out.println("division of two number:" +div);
		System.out.println("reminder of two number:" +rem);
		
	}

}
