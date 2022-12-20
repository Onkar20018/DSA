import java.util.Collections;
import java.util.PriorityQueue;

public class Heap {
    public static int[] He(int arr[], int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        
        
        for (int i = 0; i < arr.length; i++) {
            heap.add(arr[i]);
            if (heap.size() > k) {
                heap.poll();
                    }
        }
         int ar[] = new int[k];
         for (int i = 0; i < ar.length; i++) {
                ar[i]=heap.poll();
         }

         return ar;
    }

    public static void main(String[] args) {
        int a[] = { 2, 7, 3, 5, 11, 4 }; // ][2,3,4,5,7,11]
        int k = 3;
         a = He(a,k);
         for (int i = 0; i < a.length; i++) {
             System.out.println(a[i]);
         }
    }

}