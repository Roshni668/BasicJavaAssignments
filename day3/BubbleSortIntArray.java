package day3;

public class BubbleSortIntArray {

	public static void main(String[] args) {
	
		int[] a= {5,3,8,4,6};
		int len=a.length;
		System.out.print("Unsorted Array : ");
		for(int i=0;i<len;i++)
		{
			System.out.print(a[i] +" ");
		}
		for(int i=0;i<len;i++)
		{
			for(int j=1;j<len-i;j++)
			{
				if(a[j-1]>a[j])
				{
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
		}
		System.out.print(" \nSorted array : ");
		for(int i=0;i<len;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	}
