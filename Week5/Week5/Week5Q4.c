#include<stdio.h>
#include<string.h>
int main(){
    char str[100];
    scanf("%s", &str);

    int length = strlen(str);

    for(int i=0;i<=length;i++){
        if(str[i+1]!='0'){
            for(int j=i+1;j<=length;j++){
                if(str[i]==str[j]){
                    //printf("%c", str[i]);
                    str[j]='\0';
                }
            }
        }
    }
    for(int i=0;i<=length;i++){
        if(str[i]!='\0')
        printf("%c", str[i]);
    }
    return 0;
}