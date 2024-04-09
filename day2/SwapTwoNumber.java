package day2;

public class SwapTwoNumber {

	public static void main(String[] args) {
	int a=10;
	int b=20;
	System.out.println("Number 1 before swap:"+a);
	System.out.println("Number 2 before swap:"+b);
	
	a=a+b; //30
	b=a-b; //10
	a=a-b; //20
	System.out.println();
	
	System.out.println("Number 1 After swap a :" +a);
	System.out.println("Number 2 After swap b :"+b);

	}

}
