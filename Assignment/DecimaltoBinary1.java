package Assignment;

public class DecimaltoBinary1 {

	public static void main(String[] args) {
	int n=25;
	System.out.println("Decimal number"+n);
	
	int binaryNum[]=new int[32];
	int i=0;
	while(n>0)
	{
		binaryNum[i]=n%2;
		n=n/2;
		i++;
	}
	System.out.println("Binary number");
	for(int j=i-1;j>=0;j--)
	{
		System.out.print(binaryNum[j]);
	}	
	 
	}

}
