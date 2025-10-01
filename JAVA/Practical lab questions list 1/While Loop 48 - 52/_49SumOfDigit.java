import java.util.Scanner;
class _49SumOfDigit
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n, sum = 0, rem;
		System.out.print("Enter a number: ");
		n = sc.nextInt();
		while(n > 0)
		{
			rem = n % 10;
			sum += rem;
			n /= 10;
		}
		System.out.println("Sum: " + sum);
	}
}