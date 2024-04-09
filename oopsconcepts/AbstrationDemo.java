package oopsconcepts;

class Recatangle extends Shape{
	void draw() {
		System.out.println("Drawing Rectangle");
	}}
class Circle extends Shape{

	void draw() {
		System.out.println("Drawing Cirle");
		}
	}

public class AbstrationDemo {
	public static void main(String[] args) {
		Shape r=new Recatangle();
		r.draw();
		Shape c= new Circle();
		c.draw();
	}

	
	}

