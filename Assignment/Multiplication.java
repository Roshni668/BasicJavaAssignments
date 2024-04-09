package Assignment;
import java.util.Scanner;
public class Multiplication {

	public static void main(String[] args) {
	 System.out.println("Enter number");
	 Scanner sc=new Scanner(System.in);
	 int a=sc.nextInt();
	 int i;
	 int multiplication=0;
	 sc.close();
	 for(i=1;i<=10;i++) 
	 {
		 multiplication= a*i;
		 System.out.println(a +"*" +i +"="+ multiplication);
		 
	 }
	
}

}
