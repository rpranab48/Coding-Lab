#include<stdio.h>
int main(){
    int n=9;
    //  scanf("%d", &n);
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++)
                 printf("  ");
            for(int j=1;j<=n;j++){
                printf("* ");
            }
            n=n-2;
            printf("\n");
        }
    return 0;
}