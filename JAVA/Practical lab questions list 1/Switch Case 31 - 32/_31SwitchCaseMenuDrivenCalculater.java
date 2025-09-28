import java.util.Scanner;
class _31SwitchCaseMenuDrivenCalculater
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a, b, choice;
		System.out.print("Enter two nos.: ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.print("\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulus\n\nPress any other number to exit\n\nEnter your choice: ");
		choice = sc.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println(a + " + " + b + " = " + (a + b));
				break;
			case 2:
				System.out.println(a + " - " + b + " = " + (a - b));
				break;
			case 3:
				System.out.println(a + " * " + b + " = " + (a * b));
				break;
			case 4:
				System.out.println(a + " / " + b + " = " + (a / b));
				break;
			case 5:
				System.out.println(a + " % " + b + " = " + (a % b));
				break;
			default:
				System.out.println("Quitting...");
		}
	}
}