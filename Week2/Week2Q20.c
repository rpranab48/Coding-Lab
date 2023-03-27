#include<stdio.h>
int main(){
    int n, m,gcd;
    scanf("%d", &m);
    scanf("%d", &n);

    for(int i=1;i<=n && i<=m;i++){
        if(m%i==0 && n%i==0)
        gcd = i;
    }
        printf("%d", gcd);
    return 0;
}