/*
                 Here,
                 since we have to fimd maximum profit we r updating min value since we have to sell it at highest
                 price and minimum but price  
                 we select minimum but price and render it with every forth coming element till max profit is
                found or updated.

 *                               APPROACH
 *                  1. Use a for loop
 *                  2. Maintain a Min to store Minimum value  and a Profit to store Ptofit
 *                  3. If current is less than min update Min
 *                  4. Subtract current and min if Current Profit is more update Profit
 *                                       
 */

 /* TC= BigO(n) */
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
        sc.close();
        bs(a);
    }

    /////////////////////////////////////////////////////////
    public static void bs(int a[]) {
        int min = a[0];
        int profit = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) { // To update Min 
                min = a[i];
            } else {
                int profit_current = a[i] - min; 
                if (profit_current > 0 && profit_current > profit) { // To update Profit 
                    profit = profit_current; 
                }
            }
            
        }
        if (profit > 0) {
            System.out.println("\nProfit is " + profit);
        } else {
            System.out.println(profit);
        }
    }
}