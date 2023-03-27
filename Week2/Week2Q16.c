#include<stdio.h>
int main(){
    char operator;
    float num1,num2;
    printf("Enter the operator ");
    scanf("%c",&operator);
    printf("\n Enter the 1st number ");
    scanf("%f",&num1);
    printf("\n Enter the 1st number ");
    scanf("%f",&num2);
    switch (operator)
    {
        case '+':
            printf("%f + %f = %f",num1,num2,num1+num2);
            break;
        case '-':
            printf("%f - %f = %f",num1,num2,num1-num2);
            break;
        case '*':
            printf("%f * %f = %f",num1,num2,num1*num2);
            break;
        case '/':
            printf("%f / %f = %f",num1,num2,num1/num2);
            break;
        default:
            printf("Invalid operator");
            break;
    }
    return 0;
}