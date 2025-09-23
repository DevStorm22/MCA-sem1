import java.util.Scanner;
class MaxMinInArray
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter size of array:");
		n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++)
		{
			System.out.print("arr[" +  i + "] = ");
			arr[i] = sc.nextInt();
		}
		int min = 0, max = 0;
		for (int i = 0; i < n; i++)
		{
			for (int j = i + 1; j < n; j++)
			{
				if(arr[i] > arr[j])
				{
					max = arr[i];
				}
				if(arr[i] < arr[j])
				{
					min = arr[i];
				}
			}
		}
		System.out.println("Maximum no is: " + max + "\nMinimum no is: " + min);
	}
}