import java.util.Scanner;
class _57SearchForElement
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int size, search;
		System.out.print("Enter size of the array: ");
		size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the array");
		for(int i = 0; i < size; i++)
		{
			System.out.print("arr[" + i + "] = ");
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter element to search: ");
		search = sc.nextInt();
		for(int i : arr)
		{
			if(search == i)
			{
				System.out.println("Element found");
			}
			
		}
	}
}