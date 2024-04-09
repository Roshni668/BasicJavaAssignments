package day4;

public class Student {
	String name;
	int Roll_no;
	
	Student(int Roll_no,String name)
	{
		this.Roll_no=Roll_no;
		this.name=name;
	}
	 
	void display()
	{
		System.out.println(Roll_no +" "+ name);
	}
	
	
	public static void main(String[] args) {
		Student s1=new Student(2,"John");
		s1.display();

	}

}
