class _01SimpleArithmaticOperations
{
	public static void main(String[] args)
	{
		int a = 87, b = 23;
		double x = 32.65, y = 27.79;
		int iAdd, iSub, iMul, iDiv, iMod;
		double dAdd, dSub, dMul, dDiv, dMod;
		iAdd = a + b;
		iSub = a - b;
		iMul = a * b;
		iDiv = a / b;
		iMod = a % b;

		dAdd = x + y;
		dSub = x - y;
		dMul = x * y;
		dDiv = x / y;
		dMod = x % y;

		System.out.println("Addition of integer values: " + a + " " + b + " = " + iAdd);
		System.out.println("Subtraction of integer values: " + a + " " + b + " = " + iSub);
		System.out.println("Multiplication of integer values: " + a + " " + b + " = " + iMul);
		System.out.println("Division of integer values: " + a + " " + b + " = " + iDiv);
		System.out.println("Modulus of integer values: " + a + " " + b + " = " + iMod);

		System.out.println("Addition of double values: " + a + " " + b + " = " + dAdd);
		System.out.println("Subtraction of double values: " + a + " " + b + " = " + dSub);
		System.out.println("Multiplication of double values: " + a + " " + b + " = " + dMul);
		System.out.println("Division of double values: " + a + " " + b + " = " + dDiv);
		System.out.println("Modulus of double values: " + a + " " + b + " = " + dMod);
	}
}