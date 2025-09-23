import java.util.Scanner;
class SortedArray
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int n, temp = 0;
		System.out.print("Enter size of array: ");
		n = sc.nextInt();
		int arr[] = new int [n];
		for(int i = 0; i < n; i++)
		{
			System.out.print("arr[" + i + "] = ");
			arr[i] = sc.nextInt();
		}
		System.out.println("Unsorted array");
		for(int i = 0; i < n; i++)
		{
			System.out.print(arr[i] + "\t");
		}
		for(int i = 0; i < n; i++)
		{
			for(int j = i + 1; j < n; j++)
			{
				if(arr[i] > arr[j])
				{
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println("\nSorted array");
		for(int i = 0; i < n; i++)
		{
			System.out.print(arr[i] + "\t");
		}
	}
}