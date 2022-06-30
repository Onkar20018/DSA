import java.util.Scanner;

public class Binary_Search {
     public static int  binary(int[] arr ,int size,int key){
               int start = 0;
               int end = size-1;
              int mid = start +((end-start)/2);
               while(start<=end){
                   if (arr[mid]==key) {
                        return mid;
                   }else if(key>arr[mid]){
                             start=mid+1;   
                   }else{
                        end=mid-1;
                   }
                   mid = (start+end)/2;
                }
                return -1;


     }
      public static void main(String args[]){
         
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the Array Size:");
          int n = sc.nextInt();
          int arr[] = new int[n];
          for (int i = 0; i < arr.length; i++) {
                  System.out.print("Enter the element :");
                   arr[i] = sc.nextInt();
          } 
          System.out.print("Your Array is:[ ");
          for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j]);
                System.out.print(" ");    
          }
          System.out.println("]");
         /////////////////////////////////////////////////////////
         System.out.print("Enter the value you want to Find:");    
                int value = sc.nextInt(); 
                int e= binary(arr, arr.length, value);
                if (e==-1) {
                    System.out.println("Element "+value+" does not exist in array");
                }else{
                    System.out.println("Element "+value+ " exist in array at "+e);
                }
      }
}
