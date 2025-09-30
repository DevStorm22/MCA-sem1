import java.util.Scanner;
class _34PrintFirstNNo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter a limit: ");
		n = sc.nextInt();
		for(int i = 1; i <= n; i++)
		{
			System.out.println(i);
		}
	}
}
