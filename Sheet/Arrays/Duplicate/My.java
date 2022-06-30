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
         duplicate(a);
    }  
        /////////////////////////////////////////////////////////
         public static void duplicate(int a[]){
               int dup;
               boolean f =false;
               for (int i = 0; i < a.length; i++) {
                    dup=a[i];   
                for (int j = i+1; j < a.length; j++) {
                        
                    if (dup==a[j]) {
                         System.out.println("Dup is "+dup+" at i+"+ i+" j = "+j);
                        f=true;
                       } 
                   }
               }
               System.out.println("\nDuplicate is Present: "+f);
         }           
    
}