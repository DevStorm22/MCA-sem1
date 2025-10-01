import java.util.Scanner;
class _52DigitsofNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int number, rem;
		System.out.print("Enter a number: ");
		number = sc.nextInt();
		System.out.print("Digits of the number: ");
		while(number > 0)
		{
			System.out.print(number % 10 + " ");
			number /= 10;
		}
	}
}