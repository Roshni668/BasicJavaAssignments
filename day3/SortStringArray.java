package day3;
public class SortStringArray {

	public static void main(String[] args) {
		String[] s= {"WaterMelon","Apple","Mango","Bluebarry",
				"Guava","Banana"};
				   
		int len=s.length;
		
		System.out.println("Unsorted Array:");
		for(int i=0;i<len;i++)
		{
			System.out.print(s[i]+" ");
		}
		for(int i=0;i<len;i++)
		{
			for(int j=1;j<len-i;j++)
			{
				if(s[j-1].compareTo(s[j])>0)
				{
					String temp=s[j];
					s[j]=s[j-1];
					s[j-1]=temp;
				}
			}
		}
		System.out.println();
		
		System.out.println("Sorted Array:");
		for(int i=0;i<len;i++)
		{
			System.out.print(s[i]+" ");
		}
	}

}
