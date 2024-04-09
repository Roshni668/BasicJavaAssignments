package day1;

public class SwapTwoNumber {

	public static void main(String[] args) {
	int a=10;
	int b=20;
	
	System.out.println("Number a before swap:" +a);
	System.out.println("Number b before swap:" +b);
	
	int temp=a; //10
	a=b; // 20
	b=temp; //10
	
	System.out.println("\nNumber a after swap:" +a);
	System.out.println("Number b after swap:" +b);

}}
