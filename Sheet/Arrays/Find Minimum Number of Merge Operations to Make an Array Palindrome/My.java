/*
 *                                  APPROACH
 *                  we first know that palindrome in palindrome array the first and last element must
 *                  be same 
 *                  1.In that case we keep two pointer one at start and one End
 *                  2. Now if start and end are eqaul no need to merge
 *                  3. If start is less then update start and its fourtcoming by merging them and 
 *                     storing that value in Fourtcoming index.
 *                  4. IF end is less then store end and its fourtcoming merge in its fourtcoming
 *                  5. Update value of merge at only where start and end are not equal 
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
        Min(a);
        sc.close();
    }

    /////////////////////////////////////////////////////////
    public static void Min(int a[]) {
       int low = 0;                     // This variable maintains start
        int high = a.length - 1;          // This variable maintains End
        int merge = 0;                     // This variable maintains Number of Merge Operations
        while (low <= high) {
            if (a[low] == a[high]) {   // Comparing if equal
                low++;
                high--;
            } else if (a[low] < a[high]) {  // comparing if low is less 
                a[low + 1] = a[low] + a[low + 1];  // MErging low and its next and storing at next
                low++;
                merge++;
            } else {
                a[high - 1] = a[high] + a[high - 1];// MErging high and its next and storing at its next
                high--;
                merge++;
            }
        }
        System.out.println("\nNumber of Meging Done are :" + merge);
    }
}