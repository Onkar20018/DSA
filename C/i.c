#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
struct node
{
    int data ;
    struct node* link;
};
struct node* root = NULL;
int main()
{
   int data;
 printf("Prog is Running");
  while(1)
{
   
    printf("1.Apend\n2.Append at First\n3.Append after\n4.Length\n5.Display\n6.Delete\n7.Delete After\n8.Reverse\n9.Swap\n10.Erase\n11.Sort\n12.Exit\n");
    printf("Enter The Number:");
    scanf("%d",&data);
    printf("Data is %d",data);
