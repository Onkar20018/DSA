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
        next_permu(a);
    }

    /////////////////////////////////////////////////////////
    public static void next_permu(int a[]) {
        if (a == null || a.length <= 1) {
            return;
        }
        int i = a.length - 2;
        while (i >= 0 && a[i] >= a[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = a.length - 1;
            while (a[j] <= a[i]) {
                j--;
            } 
            swap(a, i, j); 
        }
        reverse(a, i + 1, a.length - 1);
        int y = 0;
        System.out.println();
        System.out.print("Your Arrays is :[");
        while (y < a.length) {
            System.out.print(a[y] + ",");
            y++;
        }
        System.out.print("]");
    }

    public static void swap(int a[], int start, int end) {
        int c = a[start];
        a[start] = a[end];
        a[end] = c;
    }

    public static void reverse(int a[], int start, int end) {

        while (start < end) {
            swap(a, start, end);
            start++;
            end--;

        }
    }
}
