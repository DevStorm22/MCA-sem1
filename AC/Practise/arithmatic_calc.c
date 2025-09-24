#include <stdio.h>
int main()
{
    int a, b;
    printf("Enter two nos: ");
    scanf("%d%d", &a, &b);
    printf("Addition = %d", (a + b));
    printf("\nSubtraction = %d", (a - b));
    printf("\nMultiplication = %d", (a * b));
    printf("\nDivision = %d", (a / b));
    printf("\nModulus = %d", (a % b));
    return 0;
}
