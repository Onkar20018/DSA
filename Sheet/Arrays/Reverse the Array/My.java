import java.util.Scanner;
/* TC = BigO(log n) */
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
                                             
        //////////////////////////////////////////////
        reverse(a, n);
        sc.close();
    }
///////////////////////////////////////////////////////////////////////
    public static void reverse(int a[], int n) {
        int c;
        for (int j = a.length-1, i = 0; i < a.length / 2; i++)// i Begins from Start and j Begins from End 
                                                              // No of comparisions are till Middle of the array  
        { 
            c = a[i];
            a[i] = a[j];
            a[j] = c;
            j--;
        }
        ///////////////////////////////////////////////////////
        System.out.print("Your array is :[");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]);
            if (i != n - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
    
    }
}