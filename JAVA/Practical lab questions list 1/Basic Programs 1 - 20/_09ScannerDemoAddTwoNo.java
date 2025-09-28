import java.util.Scanner;
class _09ScannerDemoAddTwoNo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.print("Enter two nos.: ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a + " + " + b + " = " + (a + b));
	}
}