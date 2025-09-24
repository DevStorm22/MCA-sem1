#include<stdio.h>
int main()
{
	int i, j, temp, arr[] = {9, 3, 8, 1, 0, 6}, n = 6;
	printf("Before sorting: ");
	for(i = 0; i < n; i++)
	{
		printf("%d ", arr[i]);
	}
	for(i = 0; i < n - 1; i++)
	{
		for(j = 0; j < n - i - 1; j++)
		{
			if(arr[j] > arr[j + 1])
			{
				temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
		}
	}
	printf("\nAfter sorting: ");
	for(i = 0; i < n; i++)
	{
		printf("%d ", arr[i]);
	}
	return 0;
}