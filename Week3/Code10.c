#include<stdio.h>
int main(){
    int n=3,a=9,temp=a;
    int j,i;
    //scanf("%d", &n);
        for( i=0;i<4;i++){
            for( j=0;j<=n;j++){
                printf("%d ",a);
                a++;
            }
            printf("\n");
            a=temp-n;
            temp=a;
            n--;
        }
    return 0;
}