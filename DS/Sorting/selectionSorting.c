#include<stdio.h>
int main()
{
	int i, j, temp ,arr[] = {9, 4, 1, 8, 2}, n = 5;
	printf("Array before sorting: ");
	for(i = 0; i < n; i++)
	{
		printf("%d ", arr[i]);
	}
	for(i = 0; i < n - 1; i++)
	{
		int smallestIndex = i;
		for(j = i + 1; j < n; j++)
		{
			if(arr[j] < arr[smallestIndex])
			{
				smallestIndex = j;
			}
		}
		temp = arr[smallestIndex];
		arr[smallestIndex] = arr[i];
		arr[i] = temp;
	}
	printf("\nArray after sorting: ");
	for(i = 0; i < n; i++)
	{
		printf("%d ", arr[i]);
	}
	return 0;
}