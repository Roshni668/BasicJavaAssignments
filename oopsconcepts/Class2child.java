package oopsconcepts;

public class Class2child extends Class1parent {

	public static void main(String[] args) {
		
	Class2child oj1=new Class2child();
	oj1.add(5,6);
	oj1.add(1.5,7.1);
	}	

	public void sub(int i,int j)
	{
		int diff=i-j;
		System.out.println(diff);
		
	}
	public void add(int i,int j,int k)
	{
		System.out.println("i am in child 3 parameter");
		int sum=i+j+k;
		System.out.println(sum);
	}
	// overriding
//	public void add(int i,int j) 
//	{
//		System.out.println("i am in int child 2 add");
//		int sum=i+j+10;
//		System.out.println(sum);
//	}
//	

}
