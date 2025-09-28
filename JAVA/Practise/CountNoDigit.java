import java.util.Scanner;
class CountNoDigit
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		int c = 0, rem;
		while(n % 10 != 0)
		{
			rem = n % 10;
			c++;
			n /= 10;
		}
		System.out.println(c);
	}
}