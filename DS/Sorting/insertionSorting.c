#include <stdio.h>
int main()
{
    int arr[] = {9, 8, 0, 3, 10}, i, j, k, n = 5;
    printf("\nArray before sorting: ");
    for(i = 0; i < n; i++)
    {
        printf("\t%d", arr[i]);
    }
    for(i = 1; i < n; i++)
    {
        k = arr[i];
        j = i - 1;
        while((k <= arr[j]) && (j >= 0))
        {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = k;
    }
    printf("\nArray after sorting: ");
    for(i = 0; i < n; i++)
    {
        printf("\t%d", arr[i]);
    }
    return 0;
}
