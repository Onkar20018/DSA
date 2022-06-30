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
        sc.close();
        rep_dup(a);
    }

    /////////////////////////////////////////////////////////
    public static void rep_dup(int a[]) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        int[] array2 = new int[max + 1];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = 0;
        }

        int k = 0;
        for (int i = 0; i < a.length; i++) {
            k = a[i];
            array2[k] = array2[k] + 1;

        }
        int b = 2, ac = 0;
        for (int i = 1; i < array2.length; i++) {
            if (array2[i] == 0) {
                b = i;

            }
            if (array2[i] == 2) {
                System.out.println("in at i=" + i);
                ac = i;

            }
        }
        System.out.println("\nMissing is " + b);
        System.out.println("Repeated is " + ac);

    }
}