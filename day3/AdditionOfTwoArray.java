package day3;

public class AdditionOfTwoArray {

	public static void main(String[] args) {
		int [][]a= {{11,12,13},{10,20,30},{15,14,13}};
		int [][]b= {{20,40,50},{21,25,35},{20,30,10}};
		int [][]c=new int[3][3];
		

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" " );
			}
			System.out.println();
		}
		System.out.println();

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(b[i][j]+" " );
			}
			System.out.println();
		}	
		
			System.out.println();

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++) 
			{
				c[i][j]=a[i][j]+b[i][j];
			System.out.print(c[i][j]+ " ");	
			}
				System.out.println();
		}

	}

}
