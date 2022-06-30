import java.util.Scanner;

/// This is the Basic approach BigO(n^3)
// Here we are using every every sub array and selecting which ever gives us the max value
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
        max_array(a);
    }

    ////////////////////////////////////////////////////////////////////
    public static void max_array(int a[]) {

        int max = 0;
        

        for (int i = 0; i < a.length; i++) {  // First for loop goes from a[0] to a[n-1] to be the first
                                              //  start of the sub arrays from a[0] then a[1] like wise
            for (int j = i; j < a.length; j++) {// This also goes from goes from a[0] to a[n-1 to] add 
                                                // the other elements one by one sub array like first 0 then 0,1 then o.1.2 likewise
                int sum = 0;
                for (int k = i; k <= j; k++) { // This loop actualy adds the sub array using help of numbering from other for loops
                    sum = sum + a[k];
                }

                if (sum > max) {
                    max = sum;
                }
            }
            
        }
        System.out.println();
        System.out.println("Max is :" + max);
    }
}