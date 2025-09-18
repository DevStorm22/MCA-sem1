#include <stdio.h>
#include <string.h>
int main()
{
    int i;
    char c, n[50], course[50];
    float f;
    printf("Enter your first name: ");
    scanf("%s", n);
    printf("Enter your course name: ");
    getchar();
    fgets(course, sizeof(course), stdin);
    int t = sizeof(course);
    course[strcspn(course, "\n")] = "\0";
    printf("Enter a roll number: ");
    scanf("%d", &i);
    printf("Enter gender (m/f): ");
    scanf(" %c", &c); //NOTE the space before %c to consume any leftover newline.
    printf("Enter marks in %: ");
    scanf("%f", &f);
    printf("\nName: %s\nCourse: %sRoll no.: %d\nGender: %c\nPercentage: %.2f %%", n, course, i, c, f);
    return 0;
}
