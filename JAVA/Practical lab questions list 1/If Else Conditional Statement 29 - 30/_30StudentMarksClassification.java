import java.util.Scanner;
class _30StudentMarksClassification
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int marks;
		System.out.print("Enter marks to check remark: ");
		marks = sc.nextInt();
		if(marks >= 35 && marks < 50)
		{
			System.out.println("Pass");
		}
		else if(marks >= 50 && marks < 75)
		{
			System.out.println("First Class");
		}
		else if(marks >= 75 && marks <= 100)
		{
			System.out.println("Distinction");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}