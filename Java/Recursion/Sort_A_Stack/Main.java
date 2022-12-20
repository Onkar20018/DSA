
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> a = new Stack<>();
        a.push(2);
        a.push(0);
        a.push(5);
        a.push(6);
        a.push(13);
        a.push(8);
        a = sort(a);
        System.out.println(a);
    }

    public static Stack<Integer> sort(Stack<Integer> a) {
        if (a.size() == 1) {
            return a;
        }
        int val = a.pop();
        sort(a);
        put(a, val);
        return a;
    }

    public static Stack<Integer> put(Stack<Integer> a, int val) {
        if (a.size() == 0 || a.peek() < val) {
            a.push(val);
            return a;
        }
        int save = a.pop();
        put(a, val);
        a.push(save);
        return a;
    }
}
