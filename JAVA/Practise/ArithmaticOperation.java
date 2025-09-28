class ArithmaticOperation{
	public static void main(String []args) {
		int a = 10, b = 20;
		float c = 100.50f, d = 50.25f;
		// int i = 10l; // This statement will give an error.
		byte b1 = 11, b2 = 22;
		byte b3 = (byte) (b1 + b2); // Type casting
		double d1 = 1000000.788, d2 = 1897387.9817489;

		if(a == 10) {
			int test = 100;
		}
		// System.out.println("test = " + test); // This statement will give an error because test variable is place inside if block so it can't access it out of the scope
		
		System.out.println("Arithmatic Calculations for integer numbers\n");
		System.out.println("Addition of " + a + " and " + b + " is = " + (a + b));
		System.out.println("Subtraction of " + a + " and " + b + " is = " + (a - b));
		System.out.println("Multiplication of " + a + " and " + b + " is = " + (a * b));
		System.out.println("Division of " + a + " and " + b + " is = " + (a / b));
		System.out.println("Modulus of " + a + " and " + b + " is = " + (a % b));

		System.out.println("\nArithmatic Calculations for floating numbers\n");
		System.out.println("Addition of " + c + " and " + d + " is = " + (c + d));
		System.out.println("Subtraction of " + c + " and " + d + " is = " + (c - d));
		System.out.println("Multiplication of " + c + " and " + d + " is = " + (c * d));
		System.out.println("Division of " + c + " and " + d + " i s= " + (c / d));
		System.out.println("Modulus of " + c + " and " + d + " is = " + (c % d));

		System.out.println("\nArithmatic Calculations for byte numbers\n");
		System.out.println("Addition of " + b1 + " and " + b2 + " is = " + (b1 + b2));
		System.out.println("Subtraction of " + b1 + " and " + b2 + " is = " + (b1 - b2));
		System.out.println("Multiplication of " + b1 + " and " + b2 + " is = " + (b1 * b2));
		System.out.println("Division of " + b1 + " and " + b2 + " is = " + (b1 / b2));
		System.out.println("Modulus of " + b1 + " and " + b2 + " is = " + (b1 % b2));

		System.out.println("\nArithmatic Calculations for double numbers\n");
		System.out.println("Addition of " + d1 + " and " + d2 + " is = " + (d1 + d2));
		System.out.println("Subtraction of " + d1 + " and " + d2 + " is = " + (d1 - d2));
		System.out.println("Multiplication of " + d1 + " and " + d2 + " is = " + (d1 * d2));
		System.out.println("Division of " + d1 + " and " + d2 + " is = " + (d1 / d2));
		System.out.println("Modulus of " + d1 + " and " + d2 + " is = " + (d1 % d2));
	}
}