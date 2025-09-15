import java.util.Scanner;
class SumNNumbers
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a limit: ");
		int n = sc.nextInt();
		int s = 0;
		for(int i = 1; i <= n; i++)
		{
			s += i;
		}
		System.out.println("Sum: " + s);
	}
}