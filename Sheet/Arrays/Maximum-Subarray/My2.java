import java.util.Scanner;

/// This is the Basic approach BigO(n^2)
// Here we are using every every sub array and selecting which ever gives us the max value using 2 loops
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
        max_array(a);
    }

    ////////////////////////////////////////////////////////////////////
    public static void max_array(int a[]) {

        int max_final = 0;

        for (int i = 0; i < a.length; i++) { // First for loop goes from a[0] to a[n-1] to be the first
                                             // start of the sub arrays from a[0] then a[1] like wise
            int sum = 0;
            for (int j = i; j < a.length; j++) {// This loop is used to  store all the sum values reduces 
                                                // use of other loop
                sum =sum + a[j];
                max_final = Math.max(sum, max_final);
            }

        }
        System.out.println("\nMax is :" + max_final);
    }
}