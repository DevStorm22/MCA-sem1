import java.util.Scanner;
class _10UserInputDiffVariables
{
	public static void main(String[] args)
	{
		byte b;
		short s;
		int i;
		long l;
		float f;
		double d;
		char c;
		String S;
		boolean B;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter byte value: ");
		b = sc.nextByte();

		System.out.print("Enter short value: ");
		s = sc.nextShort();

		System.out.print("Enter int value: ");
		i = sc.nextInt();

		System.out.print("Enter long value: ");
		l = sc.nextLong();

		System.out.print("Enter float value: ");
		f = sc.nextFloat();

		System.out.print("Enter double value: ");
		d = sc.nextDouble();

		System.out.print("Enter char value: ");
		c = sc.next().charAt(0);

		sc.nextLine();

		System.out.print("Enter String value: ");
		S = sc.nextLine();

		System.out.print("Enter Boolean value: ");
		B = sc.nextBoolean();


		System.out.println("Byte: " + b);
		System.out.println("Short: " + s);
		System.out.println("Int: " + i);
		System.out.println("Long: " + l);
		System.out.println("Float: " + f);
		System.out.println("Double: " + d);
		System.out.println("Char: " + c);
		System.out.println("String: " + S);
		System.out.println("Boolean: " + B);
	}
}