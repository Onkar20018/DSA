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
int len = 0;
///////////////////////////////
void Append(){
 
  struct node* temp;
   temp = (struct node*)malloc(sizeof(struct node));  
   printf("Enter Data:");
    scanf("%d",&temp->data);
     temp->link=NULL;
  if (root == NULL)
  {
    root=temp;
  }
  else
  {
    struct node* t;
    t=root;
    while (t->link!=NULL)
    {
      t=t->link;
    }
  t->link=temp;
  }
}
/////////////////////////////
void Display(){
  struct node* temp=NULL;
     temp=root;
  
  if (temp == NULL)
  {
    printf("Empty\n");
  }
  else
  {
  while (temp!=NULL)
  {
        printf("%d->",temp->data);
        temp=temp->link;
       
  }
  printf("\n");
  }
}
////////////////////////////
int Length(){
 int count =0;
 struct node* temp;
 temp=root;
 while (temp!=NULL)
 {
   count++;
   temp=temp->link;
 }
 
 return count;
}
///////////////////////////////
Append_at_First(){
  struct node* temp ;
  temp = (struct node*)malloc(sizeof(struct node));
  temp->link=root;
  root=temp;
  printf("Enter Data at First:");
  scanf("%d",&temp->data);

}
////////////////////////////
Append_after(){
     struct node * temp;
     temp = (struct node*)malloc(sizeof(struct node));
       int a = Length();
      int k;
      printf("Enter Number after to Add:");
      scanf("%d",&k);
      
     if (a<k)
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
     }
}
////////////////////////////
void Erase()
{
   root=NULL;
}
////////////////////////////
 Delete_After(){
  struct node * temp;
       int a = Length();
      int k;
      printf("Enter Number after to Delete:");
      scanf("%d",&k);
      
     if (a<k)
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
         temp=p->link;
         p->link=temp->link;
     }
    
 }
////////////////////////////

////////////////////////////
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


