package day4;

public class RemoveElement {

	public static void main(String[] args) {
		int [] a= {10,20,30,40,50,60,70,80};
		int indextoremove=5;
		int len=a.length;
		int [] newArray=new int[len-1];
		
		System.out.println("Original Array :");
		for(int i=0;i<len;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		for(int i=0,j=0;i<len;i++)
		{
			if(i==indextoremove)
			{
				continue;
			}
			newArray[j++]=a[i];
		}
		System.out.println();
System.out.println("New Array after removing element:");
		for(int i=0;i<len-1;i++)
		{
			System.out.print(newArray[i]+" ");
		}
	}
}
