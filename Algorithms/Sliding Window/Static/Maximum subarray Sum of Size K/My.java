
/* 
 *                  Here we are definig a Window 
 *           The windows length will be determined by comparing it with k 
 *           if the size of it is now equal to k then we will only shift end pointer and add it to sum
 *          when the value of windows is what we want only then we update the Max sum if it is max also
 *          we will reduce the value of Start index from sum and move start by 1 and end by 1
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
        System.out.print("\nEnter the size of subarray:");
        int k = sc.nextInt();
        sc.close();
        max_array(a, k);
    }

    ////////////////////////////////////////////////////////////////////
    public static void max_array(int a[], int k) {

        if (a.length == 1) {
            System.out.println("Max is:" + a[0]);
            
        }else{
        int max = 0;
        int start = 0;
        int end = 0;
        int sum = 0;
        int size = 0;
        while (end < a.length) {  // Condition to break the loop
            sum = sum + a[end];   // to add the sum
            if ((end - start + 1) < k) {  // To check size of windows
                end++;
            } else if ((end - start + 1) == k) { // When windows size is matched then perform actions
                max = Math.max(sum, max);    /// Max
                sum = sum - a[start];  // Sum reduced by start
                start++;
                end++;
            }
        }
        System.out.println();
        System.out.println("Max is :" + max);
    }
}
}