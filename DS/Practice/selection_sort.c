#include <stdio.h>
int main()
{
    int n, i, j, small, template5555;
    printf("Enter size of array: ");
    scanf("%d", &n);
    int arr[n];
    printf("Size: %d\n", (sizeof arr / sizeof arr[0]));
    printf("Enter array element:\n");
    for(i = 0; i < n; i++)
    {
        printf("arr[%d] = ", i);
        scanf("%d", &arr[i]);
    }
    printf("\nArray before sorting:\t");
    for(i = 0; i < n; i++)
    {
        printf("%d\t", arr[i]);
    }

    //Selection Sort
    for(i = 0; i < n - 1; i++)
    {
        small = i;
        for (j = i + 1; j < n; j++)
        {
            if(arr[small] > arr[j])
            {
                small = j;
            }
        }
        temp = arr[i];
        arr[i] = arr[small];
        arr[small] = temp;
    }

    printf("\nArray after sorting:\t");
    for(i = 0; i < n; i++)
    {
        printf("%d\t", arr[i]);
    }
    return 0;
}
