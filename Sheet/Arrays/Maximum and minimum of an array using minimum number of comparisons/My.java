import java.util.Scanner;

public class My {
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
        System.out.print("Your array is :[ ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("]");
        sc.close();
               min_max(a,n);
    }
    public static void min_max(int a[],int n){
              int max=a[0], min=a[0];///////////Make
        for (int i = 0; i < n; i++) {
            if(max<=a[i]){
                max=a[i];
            }if(min >= a[i]){
                min=a[i];
            }
        }              
        System.out.println();
        System.out.println("Min is "+min + "\nMax is "+max);
    }
}