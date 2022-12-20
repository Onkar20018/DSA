/* 
 *           Low Cost
 */
import java.util.PriorityQueue;

public class Heap {

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        System.out.println(he(a));
    }

    public static int he(int[] arr) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int cost = 0;
        for (int i = 0; i < arr.length; i++) {
            heap.add(arr[i]);
        }

        while (heap.size() > 1) {
            int a = heap.poll();
            int b = heap.poll();
            int k=a+b;
            cost = cost +k;
            heap.add(k);
        }

        return cost;
    }

}
