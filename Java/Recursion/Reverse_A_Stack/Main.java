import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(3);
        stack.add(4);
        stack.add(5);
        stack.add(2);
        System.out.println(stack);
        System.out.println(Reverse(stack));
    }

    public static Stack<Integer> Reverse(Stack<Integer> a) {
        if (a.size() == 1) {
            return a;
        } else {
            int temp = a.pop();
            Reverse(a);
            return Sort(a, temp);

        }
    }

    public static Stack<Integer> Sort(Stack<Integer> stack, int temp) {
        if (stack.size() == 0) {
            stack.push(temp);
            return stack;
        } else {
            int save = stack.pop();
            Sort(stack, temp);
            stack.push(save);
            return stack;
        }
    }

}