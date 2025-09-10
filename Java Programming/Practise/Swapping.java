import java.util.Scanner;
class Swapping {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value for a = ");
		int a = sc.nextInt();
		System.out.print("Enter value for b = ");
		int b = sc.nextInt();
		System.out.println("Before swapping: \na = " + a + "\nb = " + b);
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping: \na = " + a + "\nb = " + b);
	}
}