import java.util.Scanner;
class _28LinearSearch
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = {5, 6, 8, 0, 98, 35, 2}, search, pos = -1;
		System.out.print("Enter searching element: ");
		search = sc.nextInt();
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == search)
			{
				pos = i;
			}
		}
		if(pos != -1)
		{
			System.out.println("Element " + search + " found at index: " + pos);
		}
		else
		{
			System.out.println("Element not found");
		}
	}
}