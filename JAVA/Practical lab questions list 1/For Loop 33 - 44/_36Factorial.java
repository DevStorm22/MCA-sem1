import java.util.Scanner;
class _36Factorial
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n, f = 1;
		System.out.print("Enter a number to print factorial: ");
		n = sc.nextInt();
		for(int i = 2; i <= n; i++)
		{
			f *= i;
		}
		System.out.println("Factorial of the number " + n + " is: " + f);
	}
}
