
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> a = new Stack<>();
        a.push(1);
        a.push(2);
        a.push(3);
        a.push(4);
        a.push(5);
        a.push(6);
        a.push(7);
        System.out.println(a);
        a = sort(a, a.size());
        System.out.println(a);
    }

    public static Stack<Integer> sort(Stack<Integer> a, int k) {

        int s = (k / 2) + 1;
        put(a, s);
        return a;
    }

    public static Stack<Integer> put(Stack<Integer> a, int k) {
        if (k == 1) {
            a.pop();
            return a;
        }
        int val = a.pop();
        put(a, k - 1);
        a.push(val);
        return a;

    }
}
