package day3;

public class IndexOfArray {

 
	public static int IndexArray(int[] a,int key)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
			{
				return i;
			}
		}
		return -1;
		
	}

	public static void main(String[] args)
	{
		int[] a1= {20,25,50,40,70,10,60};
		int key=70;
		System.out.println(key +" is found at index :" + IndexArray(a1,key));
		
	}

}
