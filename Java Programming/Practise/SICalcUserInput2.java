import java.util.Scanner;
class SICalcUserInput2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		double p, r, t;
		System.out.print("Enter principle: ");
		p = sc.nextDouble();
		System.out.print("Enter rate(%): ");
		r = sc.nextDouble();
		System.out.print("Enter time(years): ");
		t = sc.nextDouble();
		double SI = (p * r * t) / 100;
		System.out.println("Simple Interest: " + SI);
	}
}