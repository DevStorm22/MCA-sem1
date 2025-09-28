import java.util.Scanner;
class CalculatorUserInput {
	public static void main(String [] args) {
		Integer i = Integer.parseInt(args[0]);
		Integer j = Integer.parseInt(args[1]);
		System.out.println("Addition: " + (i + j));
		System.out.println("Subtraction " + (i - j));
		System.out.println("Multiplication: " + (i * j));
		System.out.println("Division: " + (i / j));
		System.out.println("Modulus: " + (i % j));
	}
}