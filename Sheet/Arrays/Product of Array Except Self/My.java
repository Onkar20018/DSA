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
        System.out.println(""); 
         product(a);
        sc.close();
    }    
        /////////////////////////////////////////////////////////
      public static void product(int a[]){
            int total_product=1;
            boolean x=false;
            boolean all_nul = true; 
                for (int i = 0; i < a.length; i++) {
                if(a[i]==0){
                  x = true;
                }
            }
                 for (int i = 0; i < a.length; i++) {
                    if (a[i]>0) {
                        all_nul=false;
                    }
                 }
                 if (all_nul==true) {
                    for (int i = 0; i < a.length; i++) {
                        a[i]=0;
                    }
                 }else{

                     if(x==true){
                         int y =1;
                for (int i = 0; i < a.length; i++) {
                    if(a[i]!=0){
                        y=y*a[i];
                    }       
                }    
                for (int i = 0; i < a.length; i++) {
                    if(a[i]!=0){
                        a[i]=0;
                    }else{
                        a[i]=y;
                    } 
            }
            System.out.print("\nNew Arrays is:[ ");
                for (int i = 0; i < a.length; i++) {
                    System.out.print(a[i]+" ");
                }  
                System.out.print("]");
        }
            else{
                for (int i = 0; i < a.length; i++) {
                    total_product=total_product*a[i];
                }
                for (int i = 0; i < a.length; i++) {
                    
                    a[i]= total_product/a[i];
                }
                System.out.print("\nNew Arrays is:[ ");
                for (int i = 0; i < a.length; i++) {
                    System.out.print(a[i]+" ");
                }  
                System.out.print("]");
            }
        }
    }
    }