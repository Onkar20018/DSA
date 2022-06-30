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
/////////////////////////////////////////
  struct node* CreateBST(struct node* t, int key){
        struct node* temp = (struct node*) malloc(sizeof(struct node));
        if (t == NULL)
        {
            t= temp;
            temp->data=key;
        }
        if (t->data > key)
        {
              t->left= CreateBST(t->left,key);
        }else{
            t->right= CreateBST(t->right,key);
        }
        printf("%d is Interted in BST\n",key);
        
        return t;
        
  }
///////////////////////////////////////
    Inorder(struct node* t){
      
        if(t == NULL){
            printf("Empty BST\n");
        }else
        {
            Inorder(t->left);
            printf("%d->",t->data);
            Inorder(t->right);
        }
        
    }
//////////////////////////////////////////////

//////////////////////////////////////////////

int main(int argc, char const *argv[])
{        


   root = CreateBST(root , 5);
   root = CreateBST(root , 6);
   root = CreateBST(root , 3);
   root = CreateBST(root , 10);
   root = CreateBST(root , 512);
   Inorder(root);
    return 0;
}
