import java.util.Scanner;
class _51LCM
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int lcm = 0, num1, num2, i = 1, gcd = 0, limit;
		System.out.print("Enter two numbers to find out their LCM: ");
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
		lcm = (num1 * num2) / gcd;
		System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
	}
}