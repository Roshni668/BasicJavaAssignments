package day1;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
	int i;
	int count=0;
	System.out.println("Enter number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	sc.close();
	for(i=2;i<n;i++)
	{
		if(n%i==0)
		{
			System.out.println("number is not prime");
			count++;
			break;
		}
	}
		if(count==0)
			{
			System.out.println("prime");
			}
			
		
		
		}
	}


