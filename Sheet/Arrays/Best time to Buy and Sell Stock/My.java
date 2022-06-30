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
        bs(a);
    }    
        /////////////////////////////////////////////////////////
      public static void bs(int a[]){
           int profit_current=0;
           int profit_max=0;
        for (int i = 0; i <a.length; i++) {
              for (int j = i; j <a.length; j++) {
                   profit_current=a[j]-a[i];  
                if (profit_current>0 && profit_current>profit_max) {
                      profit_max=profit_current;
                      System.out.println("At i="+i+"j ="+j);
                  }
              }
            }
            if (profit_max!=0){
                System.out.println("\nMax Profit is "+profit_max);
        }else{
            System.out.println("\nNo Profit since "+profit_max);
        }
    }
}