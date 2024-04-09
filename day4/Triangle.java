package day4;

public class Triangle {

		int a;
		int b;
		int c;
		double area;
		int perimeter;
		
		public void calcarea()
		{
			double s=((a+b+c)*0.5);
			area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		}
		public void calcperimeter()
		{
			perimeter=a+b+c;
		}
	public static void main(String[] args) {
		Triangle t1=new Triangle();
		t1.a=3;
		t1.b=4;
		t1.c=5;
		System.out.println("side a:" +t1.a);
		System.out.println("side b:" +t1.b);
		System.out.println("side c:" +t1.c);
		
		t1.calcarea();
		t1.calcperimeter();
		System.out.println("Area of Trianngle :" +t1.area);
		System.out.println("Perimeter of Trianngle :" +t1.perimeter);
		
		}

}
