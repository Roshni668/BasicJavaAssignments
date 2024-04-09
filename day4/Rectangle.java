package day4;

public class Rectangle {
	
	int lenght;
	int breadth;
	
	Rectangle(int l,int b)
	{
		this.lenght=l;
		this.breadth=b;
	}
	public int Area()
	{
		int area=(this.lenght)*(this.breadth);
		return area;
		
	}
	public static void main(String[] args) {
	
		Rectangle r1= new Rectangle(4,5);
		Rectangle r2= new Rectangle(5,8);
		
		System.out.println("Area of rectangle 1 :"+r1.Area());
		System.out.println("Area of rectangle 2 :"+r2.Area());
		
	}

}
