import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int n = 3;
        int m = 2;
        int[][] mat = new int[n][m];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Your Ans is:");
        System.out.println(countNegativeNumbers(mat));
        sc.close();
    }

    public static int countNegativeNumbers(int[][] mat) {
        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] < 0) {
                    count = count + (mat[0].length - j);
                    System.out.println(count + "= count at i=" + i + " j=" + j);
                    break;
                }
            }
        }
        return count;
    }
}
