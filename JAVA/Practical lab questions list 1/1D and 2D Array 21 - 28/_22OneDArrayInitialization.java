import java.util.Scanner;
class _22OneDArrayInitialization
{
	public static void main(String[] args)
	{
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print("arr[" + i + "] = ");
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print("arr[" + i + "] = " + arr[i] + "\t");
		}
	}
}