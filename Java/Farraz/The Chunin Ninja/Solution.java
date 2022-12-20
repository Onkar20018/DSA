import java.util.*;
import java.util.Vector;

public class Solution {
    public static void main(String[] args) {
        int n = 2;
        int m = 3;
        int[][] arr = new int[n][m];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
            System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        Vector<Integer> ans = new Vector<>();
        ans = chuninNinja(n, m, arr);
        for (Integer r : ans) {
            System.out.println("In");
            System.out.println(r);
        }

        sc.close();
    }

    public static Vector<Integer> chuninNinja(int n, int m, int arr[][]) {
        Vector<Integer> row = new Vector<>();
        Vector<Integer> column = new Vector<>();
        Vector<Integer> ans = new Vector<>();
        int min = arr[0][0];
        int max = 0;
        // row
        for (int i = 0; i < n; i++) {
            min = arr[i][i];
            for (int j = 0; j < m; j++) {
                if (min > arr[i][j]) {
                    min = arr[i][j];
                }
            }
            row.add(min);
        }
        // clm
        for (int i = 0; i < m; i++) {
            max = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j][i] > max) {
                    max = arr[j][i];
                }
            }
            column.add(max);
        }
        for (int i = 0; i < n; i++) {
            if (row.get(i) == column.get(i)) {
                System.out.println("Yeah");
                ans.add(row.get(i));
                break;
            }
        }
        return ans;

    }
}