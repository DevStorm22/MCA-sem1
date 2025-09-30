import java.util.Scanner;
class _42Armstorng
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n, ncpy, c = 0, rem, pal = 0, pow = 1;
		System.out.print("Enter number: ");
		n = sc.nextInt();
		ncpy = n;
		for(n = n; n > 0; n /= 10)
		{
			c++;
		}
		n = ncpy;
		for(n = n; n > 0; n /= 10)
		{
			rem = n % 10;
			pow = 1;
			for(int i = 0; i < c; i++)
			{
				pow *= rem;
			}
			pal += pow;
		}
		if(ncpy == pal)
		{
			System.out.println(ncpy + " is armstorng number.");
		}
		else
		{
			System.out.println(ncpy + " is not armstorng number.");
		}
	}
}