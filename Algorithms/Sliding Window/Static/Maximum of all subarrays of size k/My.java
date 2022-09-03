
/* 
 *                  Here we are definig a Window 
 *           The windows length will be determined by comparing it with k 
 *           if the size of it is now equal to k then we will only shift end pointer and add it to sum
 *          when the value of windows is what we want only then we update the Max sum if it is max also
 *          we will reduce the value of Start index from sum and move start by 1 and end by 1
 */

import java.util.ArrayList;
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
        int start = 0;
        int end = 0;
        ArrayList<Integer> store = new ArrayList<Integer>();
        ArrayList<Integer> mainarray = new ArrayList<Integer>();
        while (end < a.length) {
            if (store.isEmpty()) {
                store.add(a[end]);
                System.out.println("Empty +" + a[end]);
            } else {
                
                while (0< store.size() && store.get(store.size()-1) < a[end]) {
                    System.out.println(" Storensize ia " + store.size());
                        System.out.println("Removed " + store.get(0) + " for " + end);
                        store.remove(0);

                }
                store.add(a[end]);
                System.out.println(" Also " + a[end] + " is added");
            }

            if (end - start + 1 < k) {
                end++;
            } else if (end - start + 1 == k) {
                mainarray.add(store.get(0));
                System.out.println(" Maina array " + store.get(0) + " at " + end + " as" + a[end]);
                if (store.get(0) == a[start]) {
                    System.out.println(a[start] + " is removed");
                    store.remove(0);
                }
                start++;
                end++;
            }

        }

        System.out.print("List is:[");
        for (int i = 0; i < mainarray.size(); i++) {
            System.out.print(mainarray.get(i) + ",");
        }
        System.out.println("]");
    }
}
