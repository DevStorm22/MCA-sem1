import java.util.Scanner;
class _41Palindrome
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n, ncpy, rem, rev = 0;
		System.out.print("Enter number: ");
		n = sc.nextInt();
		ncpy = n;
		for(n = n; n > 0; n /= 10)
		{
			rem = n % 10;
			rev = rev * 10 + rem;
		}
		if(rev == ncpy)
		{
			System.out.println(ncpy + " is palindrome");
		}
		else
		{
			System.out.println(ncpy + " is not palindrome");
		}
	}
}