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
  struct node* CreateBST(struct node* root, int key){
        struct node* temp = (struct node*) malloc(sizeof(struct node));
        temp->left=NULL;
        temp->right=NULL;
        if (root == NULL)
        {    
            root= temp;
            temp->data=key;
        }
        else if (root->data > key)
        {
              root->left= CreateBST(root->left,key);
        }else{
            root->right= CreateBST(root->right,key);
        }
       
       
        return root;
        
  }
///////////////////////////////////////
   void Inorder(struct node* root){
    
        if(root == NULL){
            return;
        }else
        {
            Inorder(root->left);
            printf("%d-",root->data);
            Inorder(root->right);
        }
        
    }
//////////////////////////////////////////////
struct node* Search(struct node* root, int key){
    if (root == NULL)
    {
        return NULL;
    }
        if (key < root->data)
       {
           return Search(root->left,key);
       }if(key > root->data){
           return Search(root->right,key);
       }
       
}
/////////////////////////////////////////////
 struct node* InorderSucc(struct node* root){
    struct node* curr = root ;
    while (curr && curr->left != NULL)
    {
        curr = curr->left;
    }
    return curr;
}
//////////////////////////////////////////////
struct node* Delete(struct node* root , int key){
            if (root->data > key )
            {
                root->left = Delete(root->left,key);
            }else if (root->data < key)
            {
                root->right = Delete(root->right,key);
            }
            else{
                if (root->left==NULL)
                 {
                    struct node* temp = root->right;
                    free(root);
                    return temp;
                    }
           
           else if(root->right==NULL) {
                 struct node* temp = root->left;
                 free(root);
                 return temp;
            }
            
            struct node* temp = InorderSucc(root->right);
                root->data = temp->data;
                root->right = Delete(root->right,temp->data);
            }
}
//////////////////////////////////////////////

int main(int argc, char const *argv[])
{        


   root = CreateBST(root , 5);
   root = CreateBST(root , 6);
   root = CreateBST(root , 3);
   root = CreateBST(root , 10);
   root = CreateBST(root , 512);
   root = CreateBST(root , 4);
   root = CreateBST(root , 2);
   printf("Binary Search Tree Is:<-");
   Inorder(root);
   printf(">\n");
  if( Search(root,6)== NULL){
      printf("Key does not Exist\n");
  }else{
      printf("Key Exist\n");
  }
  /////////
  if( Search(root,22)== NULL){
      printf("Key does not Exist\n");
  }else{
      printf("Key Exist\n");
      }
      ///////////////
      Inorder(root);
      root = Delete( root , 3);
      printf("\nAfter Deletion:\n");
       Inorder(root);
       
          return 0;
}
