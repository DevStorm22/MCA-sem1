import java.util.Scanner;
class _45CorrectPassword
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String pass;
		do
		{
			System.out.print("Enter a password: ");
			pass = sc.nextLine();
		}
		while(!pass.equals("Admin"));
	}
}