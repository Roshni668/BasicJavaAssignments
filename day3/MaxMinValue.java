package day3;
import java.util.Arrays;


public class MaxMinValue {

	public static void main(String[] args) {
		int[] a= {54,35,89,99,24,36,10,78};
		System.out.println("Before sotring:"+Arrays.toString(a));
		Arrays.sort(a);
		
		
			System.out.println("Sorted array:"+Arrays.toString(a));
		
		System.out.println("\nMinimum Value :" +a[0]);
		System.out.println("Maximum Value :" +a[a.length-1]);
	

}
}