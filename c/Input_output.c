#include<stdio.h>
int main(){
    char name[20];
    printf("plse enter your name :");
    scanf("%s",name);
    int age;
    printf("enter your age : ");
    scanf("%d",&age);
    printf("name is %s \nand age is %d\n",name,age);
    return 0;
}