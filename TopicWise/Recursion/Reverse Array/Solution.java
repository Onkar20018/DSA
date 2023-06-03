
public class Solution {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5 };
        int[] ax = sol(arr, 0, arr.length - 1);
        for (int i : ax) {
            System.out.print(i + " ");
        }
    }

    public static int[] sol(int[] arr, int s, int e) {
       // Base 
        if (s > e) {
            return arr;
        }
       
        // Body
        int swap = arr[s];
        arr[s] = arr[e];
        arr[e] = swap;
        
        // Funtion Call
        sol(arr, s + 1, e - 1);
        return arr;

    }
}
