package day3;
import java.util.Arrays;
public class InsertElement {

	public static int[] insertX(int n,int arr[],int x,int pos)
	{   int i;
		int newarr[]=new int[n+1]; // new array
		for(i=0;i<=n;i++)
		{
			if(i<pos-1)
			{
				newarr[i]=arr[i];
			}
			else if(i==pos-1)
			{
				newarr[i]=x;
			}
			else {
				newarr[i]=arr[i-1];
			}
		}
		return newarr;
	}
	public static void main(String[] args) {
		int n=5;
		int arr[]= {1,2,3,4,5};
		System.out.println("Original Array :" +Arrays.toString(arr));
		int x=50;
		int pos=3;
		arr=insertX(n,arr,x,pos); // method call
		System.out.println("New Array:" +Arrays.toString(arr));
		
	}

}
