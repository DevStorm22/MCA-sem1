#include<stdio.h>
int main()
{
    int n, i, s, p = -1, beg, end, mid;

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

    //Binary search
    beg = 0;
    end = n;
    while(beg <= end)
    {
        mid = (beg + end) / 2;
        if(arr[mid] == s)
        {
            p = mid;
            printf("\nElement found at %dth position", p);
            break;
        }
        else if(arr[mid] > s)
        {
            beg = mid + 1;
        }
        else
        {
            end = mid - 1;
        }

    }
    if(p == -1)
    {
        printf("\n404: element not found");
    }
    return 0;
}
