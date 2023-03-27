#include<stdio.h>
int main(){
        int a= 1;
        for(int i=1;i<=3;i++){
            
            for(int j=1;j<=i;j++){
                printf("*");
            }
            for(int j=i+a;j<=6;j++){
                printf(" ");
            }
            for(int j=7;j>7-i;j--){
                printf("*");
            }
                printf("\n");
                a=a+1;
        }
        for(int i=1;i<=7;i++){
                printf("*");
        }
       
    return 0;
}