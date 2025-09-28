import java.util.Scanner;
class _25TwoDArrayInitialization
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][3];
		System.out.println("Enter 2-D array elements");
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				System.out.print("arr[" + i + "][" + j + "] = ");
				arr[i][j] = sc.nextInt();
			}
			System.out.println();
		}

		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				System.out.print("arr[" + i + "][" + j + "] = " + arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}