#include <stdio.h>

#define PI 3.14

int main()
{
    float radius = 5;
    float area;

    area = PI * radius * radius;

    printf("Area of Circle = %.2f\n", area);

    return 0;
}
