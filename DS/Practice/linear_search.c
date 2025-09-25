#include<stdio.h>
int main()
{
    int n, i, s, p = -1;

    //Taking input
    printf("Enter size of array: ");
    scanf("%d", &n);
    int arr[n];
    printf("Enter array element:\n");
    for(i = 0; i < n; i++)
    {
        printf("arr[%d] = ", i);
        scanf("%d", &arr[i]);
    }
    printf("Enter element to search: ");
    scanf("%d", &s);
    for(i = 0; i < n; i++)
    {
        if(arr[i] == s)
        {
            p = i;
            printf("\nElement found at %dth index", p);
            break;
        }
    }
    if(p == -1)
    {
        printf("\n404: element not found");
    }
    return 0;
}
