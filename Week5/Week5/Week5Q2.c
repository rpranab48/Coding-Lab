#include<stdio.h>
int main(){
    int a,swap=0;
    scanf("%d", &a);
    
    int arr[a];
    
    for(int i=0;i<a;i++){
        scanf("%d", &arr[i]);
    }
    
    for(int i=0;i<a;i++){
        for(int j=i+1;j<a;j++){
            if(arr[i]>arr[j]){
                swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
            }
        }
    }
    int length = sizeof(arr)/sizeof(arr[0]);
    for(int i=0;i<length/2;i++){
        printf("%d  ", arr[i]);
    }
    for(int i=length-1;i>=length/2;i--){
        printf("%d  ", arr[i]);
    }
    return 0;
}