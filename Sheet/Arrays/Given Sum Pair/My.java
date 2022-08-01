/*
 *             Approach
 *        we have a sorted array so first we find max value index and min value index since they
 *          are beside each other.
 *        now we add them check if we gor it then retuen else check
 *         if sum is less move max to lower side else move min to higher side 
 *         ////// TO MOVE IN A ROTATED FASHION 
 *                  WE USE % so that remainder never goes above length and below 0
 *             if want to increase index by add array of length n =>  (n+index+add)%n
 *             if want to decrease index by add array of length n =>  (n+index-add)%n
 */
/* TC = BigO(n) */

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
        System.out.println("Enter the value to Check:");
        int x= sc.nextInt();
        boolean y= check(a,a.length,x);
        if (y) {
            System.out.println("Elements is present");
        }else{
            System.out.println("Elements is not present");
        }
        sc.close();
    }    
        /////////////////////////////////////////////////////////
          public static boolean check(int arr[],int n,int x){
            // Find the pivot element
            int i;
            for (i = 0; i < n - 1; i++)
                if (arr[i] > arr[i+1])
                    break;
                     
            int l = (i + 1) % n; // l is now index of                                         
                                // smallest element
                              
            int r = i;       // r is now index of largest
                             //element
          
            // Keep moving either l or r till they meet
            while (l != r)
            {
                 // If we find a pair with sum x, we
                 // return true
                 if (arr[l] + arr[r] == x)
                      return true;
          
                 // If current pair sum is less, move
                 // to the higher sum
                 if (arr[l] + arr[r] < x)
                      l = (l + 1) % n;
                       
                 else  // Move to the lower sum side
                      r = (n + r - 1) % n;
            }
            return false;
        }
}