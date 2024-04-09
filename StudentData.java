
public class StudentData {
	
	String name;
	int roll_no;
	int phone_no;
	String address;
	
	StudentData(int roll_no,String name,int phone_no,String address)
	{
		this.roll_no=roll_no;
		this.name=name;
		this.phone_no=phone_no;
		this.address=address;
	}
	
	void display()
	{
	System.out.println(roll_no+" "+name+" "+phone_no+" "+address);
	}
	
	public static void main(String[] args) {
		StudentData s1=new StudentData(1,"Sam",1234567890,"4th street");
		StudentData s2=new StudentData(2,"John",254789633,"10th Street");
		s1.display();
		s2.display();
	}

}
