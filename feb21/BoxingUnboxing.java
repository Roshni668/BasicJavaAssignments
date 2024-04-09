package feb21;

public class BoxingUnboxing {

	public static void main(String[] args) {
	//Boxing 
		int a=20;
		Integer a1=new Integer(a);
		System.out.println(a1);
		Integer a2=50;
		System.out.println(Integer.compare(a, a2));
		System.out.println(Integer.max(a, a2));
		System.out.println(a2.floatValue());
		
		//Unboxing
		Integer a4=new Integer(4); //declare
		//Integer a4=5;    			// declare
		
		int a5=a4;	
		int a6=a5+a2;
		System.out.println(a6); 
		
		
		
		

		
	}

}
