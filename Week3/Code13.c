#include<stdio.h>
int main(){
    int n=7,a=1;
    //  scanf("%d", &n);
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++)
                 printf("    ");
            for(int j=1;j<=n;j++){
                printf("%d  ",a);
                a++;
            }
            n=n-2;
            printf("\n");
        }
    return 0;
}