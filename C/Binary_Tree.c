#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
/////////////////////
struct node
{   
    struct node* left;
    int data ;
    struct node* right;
};
struct node* root=NULL;
////////////////////////////////////////////////////////
struct node* create(){
    int x=0;
    struct node* temp = (struct node* )malloc(sizeof(struct node));
    printf("Enter the Data for Node (-1 for Null): ");
    scanf("%d",&x);
    if (x==-1)
    {
        return 0;
    }
    else{
        temp->data=x;
        printf("Enter the Data for Left Node of %d\n",x);
        temp->left=create();
        printf("Enter the Data fro Right Node of %d\n",x);
        temp->right=create();
        return temp;
    }
}
///////////////////////////////////////////////////
inorder(struct node *temp){
    
       if (temp==NULL)
    {
        return NULL;
    }else
    {
    
    inorder(temp->left);
    printf("%d->",temp->data);
    inorder(temp->right);
    }
}
///////////////////////////////////////////////////
preorder(struct node* temp){
    
          if (temp==0)
     {
            return 0 ;
     }
     else
     {
         
     
     printf("%d->",temp->data);
     preorder(temp->left);
     preorder(temp->right);
     }
   
     
}
///////////////////////////////////////////////////
postorder(struct node* temp){
       
    if (temp==0)
    {
        return ;
    }
    else
    {
    
    
        postorder(temp->left);
       postorder(temp->right);
       printf("%d->",temp->data);
    }
       
      
}
///////////////////////////////////////////////////
void main(){
       struct node*  root=create();
     printf("root is %d\n",root);
      while (1)
      {
          printf("1. Inorder 2.Preorder 3.Postorder 4.Exit\n");
          printf("Your Choice:");
          int x;
          scanf("%d",&x);
          switch (x)
          {
          case 1:
                 printf("Inorder is \n");
                    inorder(root);
                    printf("\n");
              break;
          case 2:       
                     printf("Preorder is \n");
                      preorder(root);
                      printf("\n");
                      break;
            case 3 : 
                    printf("Postorder is \n");
                       postorder(root);
                       printf("\n");
                       break;
            case 4 :  printf("Exitted Succesfullly\n");
                       exit(1);
            default: 
            printf("Enter the Number AGain\n");
                  break;
          }
      }
      
}