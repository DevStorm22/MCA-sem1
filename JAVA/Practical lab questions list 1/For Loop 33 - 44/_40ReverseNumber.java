import java.util.Scanner;
class _40ReverseNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n, rem, rev = 0;
		System.out.print("Enter number: ");
		n = sc.nextInt();
		System.out.println("Number before reversing: " + n);
		for(n = n; n > 0; n /= 10)
		{
			rem = n % 10;
			rev = rev * 10 + rem;
		}
		System.out.println("Number after reversing: " + rev);
	}
}