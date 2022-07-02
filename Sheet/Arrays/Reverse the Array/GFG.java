
import java.util.Scanner;
/* TC = BigO(log n)  */
public class GFG {
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

        //////////////////////////////////////////////
        reverse(a, n);
        sc.close();
    }

    ///////////////////////////////////////////////////////////////////////
    public static void reverse(int a[], int n) {
        int c;
        int start = 0;
        int end = n - 1;
        while (start < end) {// They are using for loop and a diff condition which compares till reaches 
                             // Middle of the Array 
            c = a[start];
            a[start] = a[end];
            a[end] = c;
            start++;
            end--;
        }
        ///////////////////////////////////////////////////////
        System.out.print("Your array is :[");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]);
            if (i != n - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}
