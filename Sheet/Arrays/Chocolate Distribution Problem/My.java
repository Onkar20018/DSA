/*
 * Given an array of n integers where each value represents the number of chocolates in a packet.
 *  Each packet can have a variable number of chocolates. There are m students, the task is to distribute 
 * chocolate packets such that: 
                        Each student gets one packet.
                        The difference between the number of chocolates in the packet with maximum chocolates and 
                        packet with minimum chocolates given to the students is minimum.
 */

  /*  APPROACH :{
                       1.First we Sort the array in Ascending Order
                       2.Then we subtract the values at xth and x+2th place and we store the value in curr
                       3. Check if curr is less than Min 
                       4. If yes Update the Min
                       5.Return
                  }
  */

 /* TC= BigO(n^2)  */
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
        System.out.print("\nPrint the number of Students:");
        n = sc.nextInt();
        sc.close();
        calculate(a, n);
    }

    /////////////////////////////////////////////////////////
    public static void calculate(int a[], int n) {
       
         a = bubble(a);       /* Store Sorted array in a  */
        
        int min = a[n - 1] - a[0]; // Initiate Min value 
        
        for (int i = 0; i < a.length; i++) { // Initiate For Loop 
            if ((i + n - 1) > a.length - 1) { /* This is make sure that x+2th place doesnt foo out pf array length
                                                 as it will create runtime Error   */
            } else {
                int sum = a[i + n - 1] - a[i]; // Here we store the  Current sum
                if (min > sum)  {  // Here we Check if Current Sum is Less than Min
                    min = sum;   
                }
            }
        }
        System.out.print("\nMinimum Difference is :" + min);
    }

    ///////////////////////////////////////////////////////
    public static int[] bubble(int a[]) { /* This is to Sort and return the Sorted Array */
        int temp;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {

                temp = a[j];
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    
                }
            }
        }
        System.out.println("Array is Sorted :");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
        return a;
    }
}