class _26MinMaxInArray
{
	public static void main(String[] args)
	{
		int arr[] = {23, 5, 98, 0, 87}, min = arr[0], max = arr[0];
		for (int i = 0; i < arr.length; i++)
		{
			if(min > arr[i])
			{
				min = arr[i];
			}
			if(max < arr[i])
			{
				max = arr[i];
			}
		}
		System.out.println("Minimum No.: " + min + "\tMaximum No.: " + max);
	}
}