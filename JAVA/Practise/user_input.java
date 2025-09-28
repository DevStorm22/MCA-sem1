import java.util.Scanner;

class user_input {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer number:");
		int i = sc.nextInt();
		System.out.println("int i:" + i);
		
		sc.close();
	}
}