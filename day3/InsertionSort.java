package day3;

public class InsertionSort {

	public static void main(String[] args) {
	int[] a= {12,11,13,5,6};
	int n=a.length;
	
	System.out.print("Unsorted Array: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	for(int i=1;i<n;i++)
		{
		int temp=a[i];
		int j=i-1;
		
		while(j>=0 && a[j]>temp)
			{
			a[j+1]=a[j];
			j=j-1;
			}
			a[j+1]=temp;
	
		}
	System.out.println();
	System.out.print("Sorted Array :");
	for(int i=0;i<n;i++)
	{
		System.out.print(a[i]+" ");
	}
	}

}
