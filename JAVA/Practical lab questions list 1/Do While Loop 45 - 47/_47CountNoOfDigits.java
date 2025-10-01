import java.util.Scanner;
class _47CountNoOfDigits
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n, rem, c = 0;
		System.out.print("Enter your number: ");
		n = sc.nextInt();
		do
		{
			rem = n % 10;
			c++;
			n /= 10;
		}
		while(n != 0);
		System.out.println("No. of digit present is: " + c);
	}
}