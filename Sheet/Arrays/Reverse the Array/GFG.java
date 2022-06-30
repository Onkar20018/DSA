// // Iterative java program to reverse an
// // array
// public class GFG {

//     /* Function to reverse arr[] from
//         start to end*/
//         static void rvereseArray(int arr[],
//                         int start, int end)
//         {
//             int temp;

//             while (start < end)
//             {
//                 temp = arr[start];
//                 arr[start] = arr[end];
//                 arr[end] = temp;
//                 start++;
//                 end--;
//             }
//         }	

//         /* Utility that prints out an
//         array on a line */
//         static void printArray(int arr[],
//                                 int size)
//         {
//             for (int i = 0; i < size; i++)
//                 System.out.print(arr[i] + " ");

//             System.out.println();
//         }

//         // Driver code
//         public static void main(String args[]) {

//             int arr[] = {1, 2, 3, 4, 5, 6};
//             printArray(arr, 6);
//             rvereseArray(arr, 0, 5);
//             System.out.print("Reversed array is \n");
//             printArray(arr, 6);

//         }
//     }
import java.util.Scanner;

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
        while (start < end) {
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