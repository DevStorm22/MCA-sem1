import java.util.Scanner;
class _54FindMaximumElement
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int size, max;
		System.out.print("Enter size of the array: ");
		size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the array");
		for(int i = 0; i < size; i++)
		{
			System.out.print("arr[" + i + "] = ");
			arr[i] = sc.nextInt();
		}
		System.out.print("Maximum element in array: ");
		max = arr[0];
		for(int i : arr)
		{
			if(i > max)
			{
				max = i;
			}
		}
		System.out.print(max);
	}
}