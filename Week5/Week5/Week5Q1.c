#include<stdio.h>
#include <math.h>
int main(){
    int x,a=0,z=0,b,oct=0,c=0,count=0;
    printf("Enter the number : ");
    scanf("%d", &x);
    if(x>0){
        while(x>0){
        int y = x%10;
        z += (y*pow(2,a));
        if(y>1 || y<0){
        count++;
        }
        x=x/10;
        a++;
    }
    a = 1;
    while(z>0){
        c= z%8;
        oct = oct + c*a; // for reverse the number we can use the a = 1; and a = a*10;
        z = z/8;
        a = a*10;
    }
    if(count>0){
       printf("Invalid Input");
    }else{
        printf("%d", oct);
    }
    
    }else{
        printf("Invalid Input");
    }
    
    return 0;
}