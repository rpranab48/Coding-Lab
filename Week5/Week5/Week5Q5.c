#include<stdio.h>
int main(){
    int num;
    float sum=0;
    scanf("%d", &num);
    for(int i=1;i<=num;i++){
        sum = sum +(1.0/i);
    }
    printf("%.lf", sum);
    return 0;
}