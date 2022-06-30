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
            if (a[i] < min) {
                min = a[i];
            } else {
                int profit_current = a[i] - min;
                if (profit_current > 0 && profit_current > profit) {
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