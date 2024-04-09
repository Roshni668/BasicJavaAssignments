package day2;

public class NestedIF {

	public static void main(String[] args) {
		int a=10;
		int b=15;
		int c=9;
		
		if(a>b) 
		{
		  if(a>c)
		  {
			  System.out.println("a is largest number");
		  }
		  else
		  {
			System.out.println("c is largest number ");  
		  }
		}
		  else
		  {
			  if(b>c)
			  {
				  System.out.println("b is the largest number");
			  }
			  else 
			  {
				  System.out.println("c is the largest number");
			  }
		}

	}

}
