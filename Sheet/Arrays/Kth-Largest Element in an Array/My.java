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
        System.out.print("\nGive the kth Number:");
        int k = sc.nextInt();
        sc.close();

        k_th(a, k);
    }

    /////////////////////////////////////////////////////////
    public static void k_th(int a[], int k) {
        if (k > a.length) {
            System.out.println("K is exceeding the size of the Array");
            return;
        }
        int[] ks = new int[a.length];
        ks = bubble(a);
        System.out.println("\n" + k + "th Largest Element is :" + ks[ks.length - k]);
    }

    public static int[] bubble(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.print("Sorted Array:");
        for (int j = 0; j < a.length; j++) {
            System.out.print(" " + a[j]);
        }
        return a;
    }
}