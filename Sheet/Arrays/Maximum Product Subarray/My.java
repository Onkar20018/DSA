/*
 *                  Here, 
 * we create 2 for loops 
 * 1 stores the max sub array from left 1 stores from right 
 * we initiat a Common max prodcur for both 
 * since both max sub array from left and right will be comapred and onnly max is stored
 */

 /* TC=BigO(n)
  * SC= n
  */
import java.util.Scanner;

public class My {
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
            int product_max= Integer.MIN_VALUE;
            int cprod=1;
            for (int i = 0; i < a.length; i++) {
                cprod*=a[i];
                product_max = Math.max(product_max, cprod);
                if (cprod==0) {
                    cprod=1;
                }
            }
            cprod=1;
             for (int i = a.length-1; i >=0 ; i--) {
                cprod*=a[i];
                product_max = Math.max(product_max, cprod);
                if (cprod==0) {
                    cprod=1;
                }
            }
            System.out.println("Product is: "+product_max);
          }
}