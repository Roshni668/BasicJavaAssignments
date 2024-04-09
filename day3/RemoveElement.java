package day3;

public class RemoveElement {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int index=2;
		System.out.println("Original Array:");
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]+" ");
		
		for(int i=index;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		System.out.println();
		System.out.println("Array after removing element:");
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}	}

}
