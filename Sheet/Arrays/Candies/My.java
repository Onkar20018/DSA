import java.util.ArrayList;
import java.util.List;

public class My {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>();
        // int val = 15;
        // for (int i = 0; i < 15; i++) {
        // arr.add(val);
        // val--;
        // }
        arr.add(2);
        arr.add(4);
        arr.add(3);
        arr.add(5);
        arr.add(2);
        arr.add(6);
        arr.add(4);
        arr.add(5);

        int n = 8;
        System.out.println("Your Array is:");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println("");
        System.out.print(candies(n, arr));
    }

    public static long candies(int n, List<Integer> arr) {
        long size = arr.size();
        long sum = 0;
        List<Integer> left_arr = new ArrayList<Integer>();
        List<Integer> right_arr = new ArrayList<Integer>();
        List<Integer> finall = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            left_arr.add(1);
        }
        for (int i = 0; i < size; i++) {
            right_arr.add(1);
        }
        for (int i = 0; i < size; i++) {
            finall.add(0);
        }
        ///// L-R
        for (int i = 0; i < size - 1; i++) {
            if (arr.get(i) < arr.get(i + 1)) {
                left_arr.set(i + 1, left_arr.get(i) + 1);
            } else if ((arr.get(i) > arr.get(i + 1)) && left_arr.get(i) <= left_arr.get(i + 1)) {
                left_arr.set(i, left_arr.get(i + 1) + 1);
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.print(left_arr.get(i) + " ");
        }
        System.out.println("<- L To R");
        //// R- L
        for (int i = arr.size() - 1; i > 1; i--) {
            if (arr.get(i) < arr.get(i - 1)) {
                right_arr.set(i - 1, right_arr.get(i) + 1);
            } else if ((arr.get(i) > arr.get(i - 1)) && (right_arr.get(i) <= right_arr.get(i - 1))) {
                right_arr.set(i, right_arr.get(i - 1) + 1);
            }
            //
        }
        for (int i = 0; i < size; i++) {
            System.out.print(right_arr.get(i) + " ");
        }
        System.out.println("<- R To L");

        for (int i = 0; i < finall.size(); i++) {
            finall.set(i, Math.max(left_arr.get(i), right_arr.get(i)));
        }
        for (int i = 0; i < size; i++) {
            System.out.print(finall.get(i) + " ");
        }
        System.out.println("<- FINAL");
        for (int i = 0; i < finall.size(); i++) {

        }
        for (int i = 0; i < size; i++) {
            sum = sum + finall.get(i);
        }
        System.out.print("Answer:");
        return sum;
    }
}
