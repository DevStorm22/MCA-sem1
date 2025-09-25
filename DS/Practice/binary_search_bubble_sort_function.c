#include <stdio.h>
void binary_search(int arr[], int n, int s)
{
    int beg, end, mid, p;
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
}

void bubble_sort(int arr[], int size)
{
    int n = size, i, j, temp, pass = 0, comp = 0;
    for(i = 0; i < n - 1; i++)
    {
        pass++;
        printf("\nPass %d\t", pass);
        for (j = 0; j < n - i - 1; j++)
        {
            comp++;
            if(arr[j] > arr[j + 1])
            {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        for(j = 0; j < n; j++)
        {
            printf("%d\t", arr[j]);
        }
    }
    printf("\nNo. of passes: %d\nNo. of comparision: %d", pass, comp);
    printf("\nArray after sorting:\t");
    for(i = 0; i < n; i++)
    {
        printf("%d\t", arr[i]);
    }
    binary_search(arr, n, )
}

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
    //Bubble sorting
    bubble_sort(arr, n);
    return 0;
}
