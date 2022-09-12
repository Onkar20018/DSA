/*
 * You are given a read only array of n integers from 1 to n.

Each integer appears exactly once except A, which appears twice and B which is missing.

Return A and B.
 */
/*                           Here,
                            we create a duplicate array using value if max in array1
                            Then using values in array 1 we update index of array2 by 1
                            like this all values will get 1 
                            except 2 values
                            which will be missing and repeated
                            repeated will get 2  and missing will get 0
                            Scan indecx haviing 0 and 2 that index value is ur Missing and Repreated Value
                            Respectively 
 *                                 APPROACH
 *                          1. Create a Duplicate array with length equal to max valur in arrays Plus 1.
 *                          2. Store all 0 in Array2
 *                          3. Scan array 1 and add 1 in array2 s index using value of array 1.
 *                          4. Scan array2 where 2 is present that index is repeated and where there is 0 that is 
 *                             Missing  
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
        sc.close();
        rep_dup(a);
    }

    /////////////////////////////////////////////////////////
    public static void rep_dup(int a[]) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) { // To Store the value of Max of array 1
            if (a[i] > max) {
                max = a[i];
            }
        }
        int[] array2 = new int[max + 1]; // Array2 length should be length of aaray1 plus 1 since arrays sart from 0
        for (int i = 0; i < array2.length; i++) { // to create a array of length MAx+1 with all 0s in It.
            array2[i] = 0;
        }

        int k = 0;
        for (int i = 0; i < a.length; i++) {
            k = a[i]; // TO store value of array 1 in k
            array2[k] = array2[k] + 1; // to update the array at index with plus 1 

        }
        int b = 2, ac = 0;
        for (int i = 1; i < array2.length; i++) {
            if (array2[i] == 0) {
                b = i; // To store the index at which value is Missing

            }
            if (array2[i] == 2) { // To check index at which value is Repeated
                ac = i;

            }
        }
        System.out.println("\nMissing is " + b);
        System.out.println("Repeated is " + ac);

    }
}