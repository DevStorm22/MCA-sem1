class JaggedArray
{
	public static void main(String [] args)
	{
		int arr[][] = new int[4][];
		int k = 0;
		for(int i = 0; i < 4; i++)
		{
			arr[i] = new int [i + 1];
		}
		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				arr[i][j] = k++;
			}
		}
		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}