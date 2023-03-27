#include<stdio.h>
int main(){
    int num;
    scanf("%d", &num);
    while(num--){
        int a, b, sum=0;

        scanf("%d %d", &a, &b); 
        
        if(a==0)
            a=a+2;

        else if(a==1)
            a+=1;

        for(int k=a;k<=b;k++){
            int cnt=0;
            for(int i=2;i<k;i++){
                if(k%i==0){
                    cnt=1;
                    break;
                }

            }
            
            if(cnt==0)
                sum = sum + k;

        }   

        printf("%d", sum);
    }
    return 0;
}