#include <stdio.h>
int main()
{
    int n, i;
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
    printf("\nEntered array:\t");
    for(i = 0; i < n; i++)
    {
        printf("%d\t", arr[i]);
    }
    return 0;
}
