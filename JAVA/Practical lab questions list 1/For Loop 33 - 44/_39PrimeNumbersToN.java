import java.util.Scanner;
class _39PrimeNumbersToN
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter a limit: ");
		n = sc.nextInt();
		System.out.print("Prime numbers till " + n + " are:\t");
		for(int i = 2; i <= n; i++)
		{
			boolean prime = true;
			for(int j = 2; j < i; j++)
			{
				if(i % j == 0)
				{
					prime = false;
					break;
				}
			}
			if(prime)
			{
				System.out.print(i + "\t");
			}
		}
	}
}