#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
/////////////////////
struct node
{
    int data ;
    struct node* link;
};
struct node* root=NULL;
struct node* tail;
void Append(){
 
  struct node* temp;
  
   temp = (struct node*)malloc(sizeof(struct node));  
   printf("Enter Data:");
    scanf("%d",&temp->data);
     
  if (root == NULL)
  {
    root=temp;
    tail=temp;
    temp->link=temp;
  }
  else
  {
    struct node* t;
    t=root;
    while (t->link!=root)
    {
      t=t->link;
    }
       t->link=temp;
       temp->link=root;
       tail=temp;
  }
}
////////////////////////////
void Display(){
  struct node* temp=NULL;
     temp=root;
  
  if (temp == NULL)
  {
    printf("Empty\n");
  }
  else
  {
  do
  {
        printf("%d->",temp->data);
        temp=temp->link;
  } while (temp->link!=root);
     // temp=temp->link;
      printf("%d",temp->data);
  printf("\n");
  }
}
////////////////////////////
int Length(){
 int count =0;
 struct node* temp;
 temp=root;
 if (root==NULL)
 {
     printf("Empty\n");
 }
 else
 {
     while (temp->link!=root)
    {
        count++;
        temp=temp->link;
    }  
    count++;
 }
 return count;
}
///////////////////////////////
Append_at_First(){
  struct node* temp ;
  temp = (struct node*)malloc(sizeof(struct node));
  temp->link=root;
  root=temp;
  tail->link=temp;
  printf("Enter Data at First:");
  scanf("%d",&temp->data);
}
//////////////////////////////
Append_after(){
     struct node * temp;
     temp = (struct node*)malloc(sizeof(struct node));
       int a = Length();
      int k;
      printf("Enter Number after to Add:");
      scanf("%d",&k);
      
     if (a<k && a<=0)
     {
      printf("Element Does not Exist.\n");
     }
     else
     {
       struct node* p;
       p=root;
       for (int i = 1; i < k; i++)
       {
         p=p->link;
       }
         temp->link=p->link;
         p->link=temp;
        printf("Enter the Data:");
      scanf("%d",&temp->data);     
      if (k==a)
      {
          tail=temp;
      }
     }
}
////////////////////////////////////
 Delete_After(){
  struct node * temp;
       int a = Length();
      int k;
      printf("Enter Number after to Delete:");
      scanf("%d",&k);
      
     if (a<k && a<= 0)
     {
      printf("Element Does not Exist.\n");
     }
     else if (a==k)
     {
         
     }else
     {
       struct node* p;
       struct node* d;
       p=root;
       for (int i = 1; i < k; i++)
       {
         p=p->link;
       }
       d = p->link;
       d->link=NULL;
         temp=p->link;
         p->link=temp->link;
         if (a==k)
         {
             tail=temp;
         }
         
     }
     
    
 }
 /////////////////////////////////////////////////
void Erase()
{
   root=NULL;
}
///////////////////////////

void main()
{
   int data;
  while(1)
{
   int a;
    printf("1.Apend   2.Append at First   3.Append after  4.Length  5.Display   6.Erase  7.Delete After  8.Reverse  9.Swap  10.Sort   11.Exit\n");
    printf("Enter The Number:");
    scanf("%d",&data);
    switch (data)
    {
    case 1:   
          Append();
        break;
    case 2:
         Append_at_First();
        break;
   case 3:
          Append_after();
        break;
    case 4:
          a = Length();
         printf("Length is %d\n",a);
        break;
    case 5:
          Display();
        break;
    case 6:
          Erase();
        break;
   case 7:
          Delete_After();
        break;
   /* case 8:
          Reverse();
        break;
    case 9:
          Swap();
        break;
    case 10:
          Sort();
        break;*/
    case 11:printf("Exited Successfully.");
          exit(1);
        break;
    
    default:
    printf("Invalid Output\n");
        break;
    }



}
}