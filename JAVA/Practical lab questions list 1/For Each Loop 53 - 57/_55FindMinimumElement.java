import java.util.Scanner;
class _55FindMinimumElement
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int size, min;
		System.out.print("Enter size of the array: ");
		size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the array");
		for(int i = 0; i < size; i++)
		{
			System.out.print("arr[" + i + "] = ");
			arr[i] = sc.nextInt();
		}
		System.out.print("Minimum element in array: ");
		min = arr[0];
		for(int i : arr)
		{
			if(i < min)
			{
				min = i;
			}
		}
		System.out.print(min);
	}
}