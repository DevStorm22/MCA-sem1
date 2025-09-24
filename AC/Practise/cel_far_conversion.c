#include <stdio.h>
int main()
{
    float c, f;
    printf("Enter temperature in Celsius: ");
    scanf("%f", &c);
    printf("Celsius to Fahrenheit = %.2f", (c * 9 / 5) + 32);
    printf("\nEnter temperature in Fahrenheit: ");
    scanf("%f", &f);
    printf("Fahrenheit to Celsius = %.2f", ((f - 32) * 5 / 9));
}
