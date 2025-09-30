import java.util.Scanner;
class _35SumOFNNumbers
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int sum = 0, n;
		System.out.print("Enter a limit: ");
		n = sc.nextInt();
		for(int i = 1; i <= n; i++)
		{
			sum += i;
		}
		System.out.println("Sum of first " + n + " natural numbers are: " + sum);
	}
}