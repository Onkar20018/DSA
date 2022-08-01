/*
 * TC=BigO(log n)
 */

 /* 
                  Here,
                   we know that in mid if diff between mid and left is greater then elements is on left
                    if diff between mid and right is more then element is on right
                    else element is mid and left and right = mid

 *                   APPROACH
 *                1.create binary search algorithm 
 *                2. But instead of changing right to Mid-1 change it to mid.
 *                3. So all elements will ve covered.
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
        int min = Min(a);
        System.out.println("Minimum is :" + min);
        sc.close();
    }

    /////////////////////////////////////////////////////////
    public static int Min(int a[]) {
        int left = 0;
        int right = a.length - 1;
        int mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if (a[mid]>a[right]) {
                left=mid+1;
            }else if(a[mid]<a[right]){
                right=mid;
            }else{
                return a[mid];
            }
        }
        return 0;
    }
}