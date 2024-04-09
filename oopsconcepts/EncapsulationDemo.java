package oopsconcepts;

class EncapsTest{
	private String empName;
	private int empAge;
	private int aadhar;
 // setter Methods
	
	public void setEmpName(String newValue)
	{
		empName=newValue;
	}
	public void setEmpAge(int newValue)
	{
		empAge=newValue;
	}
	public void setEmpAadhar(int newValue)
	{
		aadhar=newValue;
	}
	
	// Getter Methods
	public String getEmpName()
	{
		return empName;
	}
	public int getEmpAge()
	{
		return empAge;
	}
	public int getEmpAadhar()
	{
		return aadhar;
	}
}
public class EncapsulationDemo {
	public static void main(String[] args) {
		EncapsTest obj=new EncapsTest();
		obj.setEmpName("Roshni");
		obj.setEmpAge(33);
		obj.setEmpAadhar(12345);
		System.out.println("Emplyoee Name: "+obj.getEmpName());
		System.out.println("Emplyoee Age: "+obj.getEmpAge());
		System.out.println("Emplyoee Aathar: "+obj.getEmpAadhar());
	}

}
