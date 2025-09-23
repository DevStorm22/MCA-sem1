import java.util.Scanner;
class LinearSearch
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int n, s, pos = -1;
		System.out.print("Enter size of array: ");
		n = sc.nextInt();
		int arr[] = new int [n];
		for(int i = 0; i < n; i++)
		{
			System.out.print("arr[" + i + "] = ");
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter searching element: ");
		s = sc.nextInt();
		for(int i = 0; i < n; i++)
		{
			if(arr[i] == s)
			{
				pos = i;
				break;
			}
		}
		if(pos == -1)
		{
			System.out.println("Element not found");
		}
		else
		{
			System.out.println("Element found at " + pos + " th index");
		}
	}
}