import java.util.Scanner;
class _44SumOfEvenAndOdd
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int s, se = 0, so = 0;
		System.out.print("Enter size of the array: ");
		s = sc.nextInt();
		int[] arr = new int[s];
		System.out.println("Enter array elements");
		for(int i = 0; i < s; i++)
		{
			System.out.print("arr[" + i + "] = ");
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < s; i++)
		{
			if(i % 2 == 0)
			{
				se += arr[i];
			}
			else
			{
				so += arr[i];
			}
		}
		System.out.println("Sum of event numbers in array is: " + se);
		System.out.println("Sum of odd numbers in array is: " + so);
	}
}