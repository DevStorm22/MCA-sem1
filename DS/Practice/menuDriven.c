#include<stdio.h>
int main()
{
    int choice, op1, op2;
    do
    {
        printf("==============MENU==============\n");
        printf("1.Addition\n");
        printf("2.Subtraction\n");
        printf("3.Multiplication\n");
        printf("4.Division\n");
        printf("5.Modulus\n");
        printf("6.Exit\n\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);
        switch(choice)
        {
        case 1:
            printf("Enter 2 no.s: ");
            scanf("%d%d", &op1, &op2);
            printf("%d + %d =  %d\n", op1, op2, (op1 + op2));
            break;
        case 2:
            printf("Enter 2 no.s: ");
            scanf("%d%d", &op1, &op2);
            printf("%d - %d =  %d\n", op1, op2, (op1 - op2));
            break;
        case 3:
            printf("Enter 2 no.s: ");
            scanf("%d%d", &op1, &op2);
            printf("%d * %d =  %d\n", op1, op2, (op1 * op2));
            break;
        case 4:
            printf("Enter 2 no.s: ");
            scanf("%d%d", &op1, &op2);
            printf("%d / %d =  %d\n", op1, op2, (op1 / op2));
            break;
        case 5:
            printf("Enter 2 no.s: ");
            scanf("%d%d", &op1, &op2);
            printf("%d %% %d =  %d\n", op1, op2, (op1 % op2));
            break;
        default:
                exit(0);
        }
    } while(choice != 6);
}
