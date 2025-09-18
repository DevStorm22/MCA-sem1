#include<stdio.h>
int main()
{
    int i1, i2, c;
    printf("Enter 2 numbers: ");
    scanf("%d%d", &i1, &i2);
    printf("==============MENU==============\n");
    printf("1.Addition\n");
    printf("2.Subtraction\n");
    printf("3.Multiplication\n");
    printf("4.Division\n");
    printf("5.Modulus\n");
    printf("6.Exit\n\n");
    printf("Enter your choice: ");
    scanf("%d", &c);
    if(c == 1)
    {
        printf("%d + %d = %d", i1, i2, add(i1, i2));
    }
    else if(c == 2)
    {
        printf("%d - %d = %d", i1, i2, sub(i1, i2));
    }
    else if(c == 3)
    {
        printf("%d * %d = %d", i1, i2, mul(i1, i2));
    }
    else if(c == 4)
    {
        printf("%d / %d = %d", i1, i2, div(i1, i2));
    }
    else if(c == 5)
    {
        printf("%d %% %d = %d", i1, i2, mod(i1, i2));
    }
    else
    {
        exit(0);
    }
    return 0;
}

int add (int a, int b)
{
    return (a + b);
}

int sub (int a, int b)
{
    return (a - b);
}

int mul (int a, int b)
{
    return (a * b);
}

int div (int a, int b)
{
    return (a / b);
}

int mod (int a, int b)
{
    return (a % b);
}
