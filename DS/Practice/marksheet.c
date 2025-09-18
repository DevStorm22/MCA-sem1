#include<stdio.h>
int main()
{
    int s1, s2, s3,  avg;
    printf("Enter marks of 3 subject: ");
    scanf("%d%d%d", &s1, &s2, &s3);
    avg = (s1 + s2 + s3) / 3;
    printf("Average: %d\nGrade: ", avg);
    if(avg <= 100 && avg >= 80)
    {
        printf("A+");
    }
    else if(avg <= 79 && avg >= 70)
    {
        printf("A");
    }
    else if(avg <= 69 && avg >= 60)
    {
        printf("B+");
    }
    else if(avg <= 59 && avg >= 50)
    {
        printf("B");
    }
    else
    {
        printf("Fail");
    }
}
