import java.util.Scanner;
class _43EventNoBet1To50
{
	public static void main(String[] args)
	{
		System.out.print("Even no between 1 to 50:\t");
		for(int i = 1; i <= 50; i++)
		{
			if(i % 2 == 0)
			{
				System.out.print(i + "\t");
			}
		}
	}
}