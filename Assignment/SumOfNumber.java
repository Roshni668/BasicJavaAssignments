package Assignment;

public class SumOfNumber {

	public static void main(String[] args) {
		int n=234;
		int sum=0;
		int digit;
			while(n>0) 
			{
				digit=n%10; //find last digit of number
				sum=sum+digit;// add number to sum
				n=n/10;	//remove last digit from number
			} 
			
			// loop run till n=0
		System.out.println("Sum of number:"+sum);

	}

}
