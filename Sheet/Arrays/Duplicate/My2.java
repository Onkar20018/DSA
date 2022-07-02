/* Wronf approch */
import java.util.Scanner;
public class My2 {
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
          System.out.println("");
        sc.close();
         duplicate(a);
    }  
    public static void duplicate(int a[]){
          int lengths = a.length; 
          System.out.println(lengths);
          int x[]= new int[lengths+1]; /* Make a new array same as length of array A[] Given  */
          boolean mark =false; 
          for (int i = 0; i < x.length; i++) {
              x[i]=0; /* Fill all the values to 0 */
          } 
          System.out.println();
          for (int i = 0; i < x.length; i++) {
             System.out.print(x[i]+" "); /* Fill all the values to 0 */
        }   
        System.out.println();
          for (int i = 0; i < x.length-1; i++) {
                 int index = a[i] ; /* Stores whatever value is in array a[] in index */
                 x[index]=x[index]+1; /* Index value is used to locate the place in array and is updated to +1  */
                 if(x[index]==2){
                    mark = true;
                 }
                }
            System.out.println("The value is repeated:"+mark);
                  
    }
}
