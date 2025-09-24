#include <stdio.h>
#define PI 3.142
int main()
{
    float r, l, b;

    //Circle
    printf("Enter radius of  circle: ");
    scanf("%f", &r);
    printf("Area of circle = %f", (PI * r * r));

    //Rectangle
    printf("\nEnter length and breadth of rectangle: ");
    scanf("%f%f", &l, &b);
    printf("Area of rectangle = %.2f", (l * b));
    return 0;
}
