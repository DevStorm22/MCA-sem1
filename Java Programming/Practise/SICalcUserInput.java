import java.util.Scanner;
class SICalcUserInput {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		Integer p = Integer.parseInt(args[0]);
		Integer r = Integer.parseInt(args[1]);
		Integer t = Integer.parseInt(args[2]);
		double SI = (p * r * t) / 100;
		System.out.println("Simple Interest: " + SI);
	}
}