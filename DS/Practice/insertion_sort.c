#include <stdio.h>
int main()
{
    int i, j, k, n, temp;
    printf("Enter size of array: ");
    scanf("%d", &n);
    int arr[n];
    printf("Enter array element\n");
    for(i = 0; i < n; i++)
    {
        printf("arr[%d] = ", i);
        scanf("%d", &arr[i]);
    }
    printf("\nArray before sorting: ");
    for(i = 0; i < n; i++)
    {
        printf("\t%d", arr[i]);
    }
    for(i = 1; i < n; i++)
    {
        printf("\n\ni = %d", i);
        temp = arr[i];
        printf("\ntemp = %d", temp);
        j = i - 1;
        printf("\nj = %d", j);
        while((temp <= arr[j]) && (j >= 0))
        {
            printf("\n%d < - > %d", arr[j + 1], arr[j]);
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = temp;
        printf("\nPass %d: ", i);
        for(k = 0; k < n; k++)
        {
            printf("\t%d", arr[k]);
        }
    }
    printf("\nArray after sorting: ");
    for(i = 0; i < n; i++)
    {
        printf("\t%d", arr[i]);
    }
    return 0;
}
