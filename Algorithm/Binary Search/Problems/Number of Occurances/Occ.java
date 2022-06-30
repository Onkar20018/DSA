/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Occ {

      public static void search(int []arr ,int size , int key_index){
                   
                     int key_index_back = key_index;
                     int key_index_forward = key_index;
                    while (arr[key_index_back-1]==arr[key_index]) {
                      
                          key_index_back--;
                    }
                    while (arr[key_index_forward+1]==arr[key_index]) {
                          key_index_forward++;
                    }
                    
                    System.out.println("First Occurance is at "+key_index_back+" Last Occuracnce is at "+key_index_forward);
      }

    public static void  binary(int[] arr ,int size,int key){
        int start = 0;
        int end = size-1;
       int mid = start +((end-start)/2);
        while(start<=end){
            if (arr[mid]==key) {
                
                search(arr,size,mid);
                break;
            }else if(key>arr[mid]){
                      start=mid+1;   
            }else if(key<arr[mid]){
                 end=mid-1;
            }else{
                System.out.println("Key does not exist");
                break;
            }
            mid = (start+end)/2;
         }
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
         binary(arr, arr.length, value);
                 
    
}
}