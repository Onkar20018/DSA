import java.util.ArrayList;
import java.util.List;

public class My {
    public static void main(String[] args) {
        int nw = 10;
        ArrayList<ArrayList<Integer>> n = new ArrayList<>();
        n.add(new ArrayList<>());
        n.add(new ArrayList<>());
        n.add(new ArrayList<>());
        n.get(0).add(1);
        n.get(0).add(2);
        n.get(0).add(100);
        n.get(1).add(2);
        n.get(1).add(5);
        n.get(1).add(100);
        n.get(2).add(3);
        n.get(2).add(4);
        n.get(2).add(100);
        long k = arrayManipulation(nw, n);
        System.out.println("Max value after Query is :" + k);

    }

    public static long arrayManipulation(int n, ArrayList<ArrayList<Integer>> queries) {
        List<Integer> sta = new ArrayList<>(n + 1);
        for (int i = 0; i < n + 1; i++) {
            sta.add(0);
        }

        for (int i = 0; i < queries.size(); i++) {
            int a = queries.get(i).get(0) + 1;
            int b = queries.get(i).get(1) + 1;
            int k = queries.get(i).get(2);

            while (a <= b) {
                int s = sta.get(a);
                sta.set(a, s + k);
                a++;
            }
        }
        long max = 0;
        for (int i = 0; i < sta.size(); i++) {
            if (sta.get(i) > max) {
                max = sta.get(i);
            }
        }
        return max;
    }
}
