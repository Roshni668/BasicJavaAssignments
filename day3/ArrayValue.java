package day3;

public class ArrayValue {

	public static void main(String[] args) {
		int [] a= {24,12,54,10,40,50};
		int n =10; // number to find
		boolean found=false;
		
			for(int i: a)	
			{
				if(i==n)
				{
					found=true;
					break;
				}
			}
		if(found) 
			{
			System.out.println(n +" is found ");
			}
		else 
			{
			System.out.println(n +" is not found ");
			}
	}	
}


