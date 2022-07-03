/*
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

 
 */
/* TC=BigO(n) 
 * SC=n
*/
/*
 *                              APPROACH
 *                          1.First we create an array and multiply it by left of it using rp.
 *                          2. Then we multiply from left and save it in res
 *                          3. That res is final 
 *         ex. {1,2,3,4}
 *          left is  {1,1,2,6}
 *          right is {24,12,4,1}
 *          multiplication of both is our ans
 *               [24,12,8,6]
 */                                   
 import java.util.Scanner;

public class My2 {
    //////////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        int n;
        System.out.print("Enter the Length of The Array:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the element at " + i + ":");
            a[i] = sc.nextInt();
        }
        ////////////////////////////////////////////
        System.out.print("Your array is :[");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]);
            if (i != n - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
        System.out.println(""); 
         product(a);
        sc.close();
    }    
        /////////////////////////////////////////////////////////
      public static void product(int a[]){
         if(a== null || a.length==0){
            return ;
         }
         int res[] = new int [a.length];

         int rp=1;
           // Left 
         for (int i = 0; i < res.length; i++) {
                res[i]=rp;
               rp= rp*a[i];
         }
         // Right is multiplied directly 
         rp=1;
         for (int j = a.length-1; j >=0; j--) {
            res[j]=res[j]*rp;
            rp=rp*a[j];
         }
         System.out.print("New Array is:");
         for (int i = 0; i < res.length; i++) {
            
             System.out.print(res[i]+ " ");
         }
    }
    }