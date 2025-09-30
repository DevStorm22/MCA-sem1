import java.util.Scanner;
class _33MultiplicativeTable
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter a number to form a table: ");
		n = sc.nextInt();
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(n + " * " + i + " = " + n * i);
		}
	}
}