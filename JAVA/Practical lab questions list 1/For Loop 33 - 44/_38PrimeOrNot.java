import java.util.Scanner;
class _38PrimeOrNot
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n, flag = 1;
		System.out.print("Enter a No.: ");
		n = sc.nextInt();
		for(int i = 2; i < n; i++)
		{
			if(n % i == 0)
			{
				flag = 0;
				break;
			}
		}
		if(flag == 0)
		{
			System.out.println(n + " is not prime number");
		}
		else
		{
			System.out.println(n + " is prime number");
		}
	}
}