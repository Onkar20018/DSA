
import java.util.PriorityQueue;

public class Heap {
    public static int[] He(int arr[], int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        int arr2[] = new int[arr.length];
        int val = 0;
        for (int i = 0; i < arr.length; i++) {
            heap.add(arr[i]);
            if (heap.size() > k) {
                arr2[val++] = heap.peek();
                heap.poll();
            }
        }
        int ks = heap.size();
        for (int i = 0; i < ks; i++) {
            arr2[val++] = heap.peek();
            heap.poll();
        }
        return arr2;

    }

    public static void main(String[] args) {
        int a[] = { 6, 5, 3, 2, 8, 10, 9 }; // ][2,3,5,6,8,9,10]
        int k = 3;
        a = He(a, k);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

}