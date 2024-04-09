package day2;

public class DoWhileExample {

	public static void main(String[] args) {
		int i=1;
		int n=5;
		int sum=0;
		
		do 
		{
			sum=sum+i;
			i++;
		}while(i<=n);
		System.out.println("the sum of 1st 5 number is: " +sum);
	}

}
