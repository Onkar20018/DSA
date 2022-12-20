import java.util.ArrayList;

public class My {
    public static void main(String[] args) {
        int nw = 10;
        ArrayList<ArrayList<Integer>> n = new ArrayList<>();
        n.add(new ArrayList<>());
        n.add(new ArrayList<>());
        n.get(0).add(10);
        n.get(1).add(11);
        n.get(0).add(11);
        n.get(1).add(12);
        System.out.println(n.get(0).get(0));
        System.out.println(n.get(1));

    }

}
