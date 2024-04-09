package day3;

public class ArrayDemo {

	public static void main(String[] args) {
		int a[]=new int[5];
		System.out.println("Element of array with default value");
		for(int j=0;j<5;j++)
		{
			System.out.println("a[" +j + "]= "+a[j]);
		}
		System.out.println();
		
		// storing value into different element of Array
		for(int i=0;i<5;i++)
		{
			a[i]=i;
		}
		
		// output of array
			for(int j=0;j<5;j++)
			{
				System.out.println("a[" +j +"]=" +a[j]);
			}
		}

}
