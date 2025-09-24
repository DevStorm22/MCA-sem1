#include <stdio.h>
int main()
{
    int i, j, temp, arr[] = {1,5,9,4,0,3};
    int n = 6;
    for(i = 1; i < n; i++)
    {
        temp = arr[i];
        j = i - 1;
        while(arr[j] > temp)
        {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = temp;
    }
    for (i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }
    return 0;
}
