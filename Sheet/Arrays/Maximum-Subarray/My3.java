import java.util.Scanner;

// This is The Best Approch for This problem 
// We are using Kadanes's Algorithm 
// Which uses only 1 for loop
// It has time complexity as BigO(n)
// DYNAMIC PRPGRAMMING 
public class My3 {
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
        kadane(a);
    }
    ///////////////////////////////////////////////////////////////
          public static void kadane(int a[]){
              int max_final =0;
             
              int curr =0;
              for (int i = 0; i < a.length; i++) { // Loop goes from 0 to n-1
                         curr+=a[i]; // stores sum one by one everytime
                   if (curr>max_final) { // check if curr sum is greater than the Yet Best Sum
                        max_final=curr; 
                   }
              }
              System.out.println("\nMax is :"+max_final);
          }}