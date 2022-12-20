/*
 *              TO FIND SMALLEST ELEMENT USE MAX HEAP
 *              TO FIND LARGEST ELEMENT USE MIN HEAP
 */

import java.util.Collections;
import java.util.PriorityQueue;

public class Hep {
    public static int He(int arr[], int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        int el = 0;
        
        for (int i = 0; i < arr.length; i++) {
            heap.add(arr[i]);
            if (heap.size() > k) {
                heap.poll();
                el = heap.peek();
            }
        }
        return el;

    }

    public static void main(String[] args) {
        int a[] = { 2, 7, 3, 5, 11, 4 }; // ][2,3,4,5,7,11]
        int k = 6;
        System.out.println(He(a, k));
    }

}