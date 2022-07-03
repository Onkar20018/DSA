/*
 *                   Approach 
 *             1.Create an array which store for the index what is the max value in its left.
 *             2.Create an array which store for the index what is the max value in its Right.
 *             3.Run a loop , and Subtract for each iteration as whichever is min is Left and right 
 *               with a[i], thus gives you the Trapped water value at every index.
 *             4.Store it in water.
 */
/*
 * TC = BigO(n);
 * SC = BigO(n);
 */
import java.util.Scanner;

public class My2 {
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
        trap_water(a); 
        sc.close();
    }    
        /////////////////////////////////////////////////////////
            public static void trap_water(int a[]){
                int n = a.length;
                int left[]= new int[n];
                int right[]= new int[n];
                left[0]=a[0]; // Initiate first to a[0].
                for (int i = 1; i <n; i++) {
                    left[i]= Math.max(left[i-1], a[i]);
                    //Gets the value to each index which is max to its left
                }
                right[n-1]=a[n-1]; // Initiate last to last of a[].
                for (int i = n-2; i >= 0; i--) {
                    right[i]=Math.max(right[i+1], a[i]);
                    //Gets the value to each index which is max to its Right
                }
                   int water=0;
                   for (int i = 0; i < n; i++) {
                    water+=(Math.min(left[i],right[i])-a[i]);
                    // Traps water value is stored
                }
                    System.out.println("The trapped water is :"+water);
                }   

}