#include<stdio.h>
int main(){
    int n, b=1;
    scanf("%d", &n);
    for(int i=1;i<=n;i++){
        b=b*i;
    }

    printf("%d",b);
    return 0;
}