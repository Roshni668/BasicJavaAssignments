package Assignment;
import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		System.out.println("Enter 1st number");
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		System.out.println("Enter 2nd number");
		double  b=sc.nextDouble();
		System.out.println("Enter 3rd number");
		double  c=sc.nextDouble();
		
		double average=0;
		sc.close();
		average=(a+b+c)/3;
		System.out.println("Average of number is:"+average);
		
	}

}
