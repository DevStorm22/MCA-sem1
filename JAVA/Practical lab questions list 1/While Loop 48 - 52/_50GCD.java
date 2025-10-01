import java.util.Scanner;
class _50GCD
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num1, num2, limit, i = 1, gcd = 0;
		System.out.print("Enter two numbers to check the GCD: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		limit = (num1 < num2) ? num1 : num2;
		while(i < limit)
		{
			if(num1 % i == 0 && num2 % i == 0)
			{
				gcd = i;
			}
			i++;
		}
		System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
	}
}