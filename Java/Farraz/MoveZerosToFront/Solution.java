
public class Solution {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 2, 0 };
        int n = arr.length;
        moveZerosToLeft(arr, n);
    }

    public static void moveZerosToLeft(int[] arr, int n) {
        
        int count =arr.length-1;
        for (int i = arr.length-1; i >=0 ; i--) {
             if(arr[i]!=0){
                 arr[count--]=  arr[i];  
             }   
            }
            while (count>=0) {
                 arr[count--]=0;
            }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
