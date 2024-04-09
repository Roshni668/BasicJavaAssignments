package oopsconcepts;
// interface declaration:by 1st user
interface Drawable{
	void draw();
}
//implementation by 2nd user
class Rectangle implements Drawable
{
	public void draw()
	{
		System.out.println("Drawing Rectangle");
	}
}
class Circle1 implements Drawable
{
	public void draw()
	{
		System.out.println("Drawing Circle");
	}
}

public class TestInterface {

	public static void main(String[] args) {
	
		Drawable r=new Rectangle();
		r.draw();
		Drawable c=new Circle1();
		c.draw();
		}

}
