import java.util.Scanner;
class EvenOdd
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int i = sc.nextInt();
		System.out.println(i % 2 == 0 ? "Even" : "Odd");
	}
}