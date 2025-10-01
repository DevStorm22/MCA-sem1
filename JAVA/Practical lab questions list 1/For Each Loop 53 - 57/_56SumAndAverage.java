import java.util.Scanner;
class _56SumAndAverage
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int size, sum = 0;
		System.out.print("Enter size of the array: ");
		size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the array");
		for(int i = 0; i < size; i++)
		{
			System.out.print("arr[" + i + "] = ");
			arr[i] = sc.nextInt();
		}
		for(int i : arr)
		{
			sum += i;
		}
		System.out.println("Sum of element of array: " + sum);
		System.out.println("Average of elements of array: " + sum / size);
	}
}