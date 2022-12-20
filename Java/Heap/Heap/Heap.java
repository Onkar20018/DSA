import java.util.PriorityQueue;
import java.util.Collections;

public class Heap {
    public static void main(String[] args) {
        PriorityQueue<Integer> a = new PriorityQueue<>(Collections.reverseOrder());
        a.add(5);
        System.out.println(a.peek());
        a.add(2);
        System.out.println(a.peek());
        a.add(3);
        System.out.println(a.peek());
        a.add(1);
        System.out.println(a.poll());
        System.out.println(a.peek());
        System.out.println();
        System.out.println(a.size());

    }

}