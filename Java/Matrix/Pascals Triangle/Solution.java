import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Long> ans = new ArrayList<>();
        ans = nthRowOfPascalTriangle(5);
        for (long x : ans) {
            System.out.print(x + " ");
        }
    }

    public static ArrayList<Long> nthRowOfPascalTriangle(int n) {
        int[][] pascal = new int[n][n];
        ArrayList<Long> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    pascal[i][j] = 1;
                } else {
                    pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
                }
            }
            if (i == n - 1) {
                int index = 0;
                while (index < n) {
                    ans.add((long) pascal[i][index]);
                    index++;
                }
            }
        }
        return ans;

    }
}
