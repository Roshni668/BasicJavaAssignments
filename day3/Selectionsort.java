package day3;

public class Selectionsort {

	public static void main(String[] args) {
		int[] a= {64,25,12,22,11};
		int n=a.length;
		System.out.print("Unsorted Array :");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		for(int i=0;i<n;i++)
		{
			int min_index=i;
			for(int j=i+1;j<n;j++)
			{
				if(a[min_index]>a[j])
				{
					min_index=j;
				}
			}
			int temp=a[min_index];
			a[min_index]=a[i];
			a[i]=temp;
		}
		System.out.println();
	System.out.print("Sorted Array :");
		for(int i=0;i<n;i++)
		{
			System.out.print(+a[i]+" ");
		}
	}
	

}
