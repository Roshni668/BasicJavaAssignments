package day3;

public class TwoDimentionArrayDemo {

	public static void main(String[] args) {
		int a[][]= {{11,12,13},{13,12,11},{10,20,30}};
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" " );
			}
			System.out.println();
		}
	}

}
