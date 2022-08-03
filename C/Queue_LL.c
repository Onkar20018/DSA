#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
/////////////////////
struct node
{
    int data ;
    struct node* link;
};
//////////////////////////
struct node* root = NULL;
struct node* tail = NULL;
struct node* front = NULL;
struct node*  rear = NULL;

int len = 0;
///////////////////////////////
void Append(){
 
  struct node* temp;
   temp = (struct node*)malloc(sizeof(struct node));  
   printf("Enter Data:");
    scanf("%d",&temp->data);
     temp->link=NULL;
  if (front == NULL && rear == NULL)
  {
    root=temp;
    front=temp;
    tail=temp;
    rear=temp;
    temp->link=temp;
  }
  
  else
  {
        rear->link=temp;
        temp->link=front;
        rear=temp;
  }
}
/////////////////////////////
void Display(){
  struct node* temp=NULL;
     temp=front;
  
  if (front == NULL && rear == NULL)
  {
    printf("Empty\n");
  }
  
  else
  {
  while (temp->link!=front)
  {
        printf("%d->",temp->data);
        temp=temp->link;
       
  }
  printf("%d",temp->data);
  printf("\n");
  }
}
////////////////////////////
int Length(){
 int count =1;
 struct node* temp;
 temp=front;
 while (temp->link!=front)
 {
   count++;
   temp=temp->link;
 }
 
 return count;
}
///////////////////////////////

void Erase()
{
   front=NULL;
}
////////////////////////////
 Delete(){
            struct node* temp;
               temp=front;
    if (front == rear)
  {
      front=NULL;
      rear=NULL;
  }else
  {
            front=front->link;
            tail->link=front;
            free(temp);
 }
 }
////////////////////////////

void main()
{
   int data;
  while(1)
{
   int a;
    printf("1.Apend   2.Length  3.Display   4.Erase  5.Delete  6.Exit\n");
    printf("Enter The Number:");
    scanf("%d",&data);
    switch (data)
    {
    case 1:   
          Append();
        break;
    case 2:
         a = Length();
         printf("Length is %d\n",a);
        break;
    case 3:
          Display();
        break;
    case 4:
          Erase();
        break;
   case 5:
          Delete();
        break;
  
    case 6:printf("Exited Successfully.");
          exit(1);
        break;
    
    default:
    printf("Invalid Output\n");
        break;
    }



}
}


