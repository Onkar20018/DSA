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
        System.out.print("Print the number of Students:");
        n = sc.nextInt();
        sc.close();
        calculate(a, n);
    }

    /////////////////////////////////////////////////////////
    public static void calculate(int a[], int n) {
        bubble(a);
        int min = a[n - 1] - a[0];
        
        for (int i = 0; i < a.length; i++) {
            if ((i + n - 1) > a.length - 1) {
                System.out.print("\nMinimum Diif is :" + min);

            } else {

                int sum = a[i + n - 1] - a[i];
                if (min > sum) {
                    min = sum;
                    System.out.println("Min is " + min + " at i=" + i + " and next is " + (i + n - 1));
                }
            }
        }

    }

    ///////////////////////////////////////////////////////
    public static int[] bubble(int a[]) {
        int temp;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {

                temp = a[j];
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    System.out.println("Sorted " + a[j] + " and " + a[i + 1]);
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