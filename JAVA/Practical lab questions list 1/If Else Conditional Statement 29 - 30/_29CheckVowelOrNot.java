import java.util.Scanner;
class _29CheckVowelOrNot
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		char c;
		System.out.print("Enter character to check if it is vowel or not: ");
		c = sc.next().charAt(0);
		System.out.print("Element " + c + " is ");
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
		{
			System.out.print("a vowel");
		}
		else
		{
			System.out.print("not a vowel");
		}
	}
}