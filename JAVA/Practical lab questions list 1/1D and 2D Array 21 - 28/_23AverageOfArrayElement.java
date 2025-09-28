class _23AverageOfArrayElement
{
	public static void main(String[] args)
	{
		int arr[] = {21, 2, 87, 98}, a = 0;
		for(int i = 0; i < arr.length; i++)
		{
			a += arr[i];
		}
		System.out.print("Average of elements: ");
		for(int i : arr)
		{
			System.out.print(i + " ");
		}
		System.out.println("is " + a / arr.length);
	}
}