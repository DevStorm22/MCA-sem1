//Relational Operators
import java.util.Scanner;
class RelationalOperators {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = sc.nextInt();
		System.out.print("Enter b: ");
		int b = sc.nextInt();
		System.out.println("a == b : " + (a == b) + 
		"\na != b: " + (a != b) +
		"\na < b: " + (a < b) +
		"\na > b: " + (a > b) +
		"\na >= b: " + (a >= b) +
		"\na <= b: " + (a >= b));
	}
}