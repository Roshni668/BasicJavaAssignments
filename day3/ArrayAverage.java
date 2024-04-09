package day3;

public class ArrayAverage {

	public static void main(String[] args) {
		int[] array= {10,12,45,78,92,11};
		int sum=0;
		int l=array.length;
		
		
		//sum of element
		for(int num : array)
			sum=sum+num;
		// average of element
		int average=sum/l;
		System.out.println("sum of array is:"+sum);
		
	System.out.println("The average of Array is: " +average);
	}
}
