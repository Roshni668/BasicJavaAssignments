package day4;
import java.util.Scanner;
public class ScannerClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter integer value");
		int a=sc.nextInt();
		
		System.out.println("Enter float value");
		float b=sc.nextFloat();
		
		System.out.println("Enter double value");
		double c=sc.nextDouble();
		
		System.out.println("Enter boolean value");
		boolean d=sc.nextBoolean();
		sc.close();
			float sum=a+b;
			double sum1=b-c;
			double sum3=a+c;
		
		System.out.println("Integer value:" +a );
		System.out.println("Float value:" +b);
		System.out.println("Double value:" +c);
		System.out.println("Boolean value:" +d);
		System.out.println("Sum of two number: "+sum);
		System.out.println("Substaction of two number:"+sum1);
		System.out.println("sum of a and c:"+sum3);
	}

}
