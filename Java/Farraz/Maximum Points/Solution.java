import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int n = 3;
        int[][] mat = new int[n][n];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Your Ans is:");
        System.out.println(maximumPoints(n, mat));
        sc.close();
    }

    public static int maximumPoints(int n, int[][] grid) {

        int val = 0;
        int back = n;
        for (int i = 0; i < n; i++) {
            back = back - 1;

            val = val + grid[i][i];
            if (i != back) {
                val = val + grid[i][back];
            }
            System.out.println(grid[i][i] + " " + grid[i][back]);
        }

        System.out.println();
        System.out.println();
        return val;
    }
}
