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
          System.out.print("\nEnter the key:");
          int key = sc.nextInt();
        sc.close();

        find(a,key);
    }    
        /////////////////////////////////////////////////////////
       public static void find(int a[],int key){
           int low=0;
           int high=a.length-1;
           while (low<=high) {
               
               int mid =(high+low)/2;
               if (a[mid]==key) {
                   System.out.println(key+" is present at Index:"+mid);
               }
               if (a[low]<a[mid]) {
                    if (key>=a[low] && key<a[mid]) {
                        high =mid-1;
                    }else{
                        low=mid+1;
                    }
            }else {
                if (key<=a[high] && key>a[mid]) {
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
       }
}