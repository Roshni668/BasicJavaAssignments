package feb21;

public class BreakJump {

	public static void main(String[] args) {
		System.out.println("break");
		for(int i=1;i<10;i++)
		{
			if(i==5)
			{
				break;
			}
			System.out.println(i);
			}
		System.out.println();
		System.out.println("continue");
		
	for(int i=1;i<=10;i++)
	{
		if(i==5)
		{
			continue;
		}
		System.out.println(i);
	}
	}
	

}
