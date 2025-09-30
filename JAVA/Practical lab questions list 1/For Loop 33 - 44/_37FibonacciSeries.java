import java.util.Scanner;
class _37FibonacciSeries
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n, f1 = 0, f2 = 1, f;
		System.out.print("Enter a limit: ");
		n = sc.nextInt();
		System.out.print("Fibonacci Series:\t" + f1 + "\t" + f2 + "\t");
		for(int i = 3; i <= n; i++)
		{
			f = f1 + f2;
			f1 = f2;
			f2 = f;
			System.out.print(f + "\t");
		}
	}
}