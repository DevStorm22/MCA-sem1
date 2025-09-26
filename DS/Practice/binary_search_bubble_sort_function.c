#include <stdio.h>
void binary_search(int *arr, int n, int s)
{
    int beg, end, mid, p = -1;
    beg = 0;
    end = n;
    while(beg <= end)
    {
        mid = (beg + end) / 2;
        if(arr[mid] == s)
        {
            p = mid;

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
    if(p != -1)
    {
        printf("\nElement found at index %d", p);
    }
    else
    {
        printf("\n404: element not found");
    }
}

void bubble_sort(int *arr, int size, int search)
{
    int n = size, i, j, temp;
    for(i = 0; i < n - 1; i++)
    {
        for (j = 0; j < n - i - 1; j++)
        {
            if(arr[j] > arr[j + 1])
            {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
    binary_search(arr, n, search);
}

int main()
{
    int n, i, search;
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
    scanf("%d", &search);
    //Bubble sorting
    bubble_sort(arr, n, search);
    return 0;
}
