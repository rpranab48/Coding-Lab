#include<stdio.h>
int main(){
    int n, b=0;
    scanf("%d", &n);
    for(int i=1;i<=n;i++){
        b=b+i;
    }
    printf("%d", b);
        
    return 0;
}