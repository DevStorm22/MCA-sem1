#include<stdio.h>
int main()
{
    int i, j, temp, arr[] = {1,5,9,4,0,3};
    int n = 6;
    for (i = 0; i < n; i++)
    {
        for(j = 0; j < n - i; j++)
        {
            if(arr[j] > arr[j + 1])
            {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
    for (i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }
    return 0;
}
