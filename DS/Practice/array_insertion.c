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
    printf("\nEnter number to insert in array: ");
    scanf("%d", &n);
    printf("Enter position on which you want to insert your element: ");
    scanf("%d", &pos);
    pos--;
    if(pos >= s + 2)
    {
        printf("\nInvalid Position");
    }
    else if(pos == s + 1)
    {
        arr[i + 1] = n;
    }
    else
    {
        for(i = n + 1; i > pos; i--)
        {
            arr[i] = arr[i - 1];
        }
        arr[pos] = n;
        s++;
    }
    printf("\nModified array: ");
    for(i = 0; i < s; i++)
    {
        printf("\t%d", arr[i]);
    }
    return 0;
}
