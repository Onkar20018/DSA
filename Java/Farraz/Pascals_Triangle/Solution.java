
import java.util.*;

public class Solution {
    public static void main(String[] args) {
         ArrayList<ArrayList<Long>> az=   printPascal(5) ;
         for (ArrayList<Long> arrayList : az) {
            System.out.println(arrayList);
         }
    }

    public static ArrayList<ArrayList<Long>> printPascal(int n) {
        // Created Matrix long
        ArrayList<ArrayList<Long>> ans = new ArrayList<>();
        ArrayList<Long> preRow = null;
        Long N = (long) n;
        for (long i = 0; i < N; i++) {
            ArrayList<Long> row = new ArrayList<>();
            for (long j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add((long) 1);
                } else {
                 //   System.out.println("I =" + i + " J=" + j);
                    long to = preRow.get((int) j - 1) + preRow.get((int) j);
                    row.add(to);
                }
            }
            preRow = row;
            ans.add(row);
        }

        return ans;
    }
}
