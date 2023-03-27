#include<stdio.h>
int isprime(int x){
    int cnt=0;
    if(x<2){
        return 0;
    }
    for(int i=2; i<x; i++){
        if (x%i==0)
            cnt++;     
    }
    if(cnt==0){
        return 1;       // for prime
    }else{
        return 0;       // for not prime
    }
}
int main(){
    int n,a,b,cnt=0;
    scanf("%d", &n);        // Enter the sum number
    
    for(int i=2;i<(n+1)/2;i++){
        a = isprime(i);
        b = isprime(n-i);
    
        if(a==1 && b==1){
            printf("%d=%d+%d", n,i,n-i);
            cnt++;
        }
    }
    if(cnt==0){
        printf("No ");
    }
    // loop 2 - n
    // p,q --> isPrime(i), (n-i)
    // if(p,q == 1)
    // cout << i << n-i
    return 0;
}