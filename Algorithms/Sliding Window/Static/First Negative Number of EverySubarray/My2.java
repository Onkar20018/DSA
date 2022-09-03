
import java.util.ArrayList;

public class My2 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) + " ");
        }
        a.remove(0);
        System.out.println();
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) + " ");
        }
    }

}
