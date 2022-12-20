import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        int[] a = { 10 };
        int n = a.length;
        System.out.println(occursOnce(a, n));
    }

    public static int occursOnce(int[] a, int n) {
        HashMap<Integer, Integer> hp = new HashMap<>();
        // Iterator I=hp.entrySet().iterator();
        for (int i = 0; i < a.length; i++) {
            if (hp.containsKey(a[i])) {
                hp.put(a[i], hp.get(a[i]) + 1);
            } else {
                hp.put(a[i], 1);
            }
        }
        int val = 0;
        for (Map.Entry<Integer, Integer> i : hp.entrySet()) {

            if (i.getKey() != 0 && i.getValue() > (n / 2)) {
                // System.out.println("In at " + i.getKey() + " val is" + i.getValue());
                val = i.getKey();
            }
        }
        if (val != 0) {
            // System.out.println(val);
            return val;
        } else {
            int jadc j;
            ax i 
            return -1;
        }
    }
}
