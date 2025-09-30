#include<stdio.h>
int main()
{
    int n, i, j, pos, s;
    printf("Enter size of the array: ");
    scanf("%d", &s);
    int arr[s];
    printf("Enter array elements\n");
    for(i = 0; i < s; i++)
    {
        printf("arr[%d] = ", i);
        scanf("%d", &arr[i]);
    }
    printf("Original array: ");
    for(i = 0; i < s; i++)
    {
        printf("\t%d", arr[i]);
    }
    printf("\nEnter position on which you want to delete your element: ");
    scanf("%d", &pos);
    pos--;
    if(pos > s + 1)
    {
        printf("\nInvalid Position");
    }
    else
    {
        for(i = pos; i < s - 1; i++)
        {
            arr[i] = arr[i + 1];
        }
        s--;
    }
    printf("\nModified array: ");
    for(i = 0; i < s; i++)
    {
        printf("\t%d", arr[i]);
    }
    return 0;
}
