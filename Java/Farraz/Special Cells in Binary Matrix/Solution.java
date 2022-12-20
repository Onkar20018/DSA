import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("Npw Array");
        int[][] mat = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int v = sc.nextInt();
                if (v == 0 || v == 1) {
                    mat[i][j] = v;
                } else {
                    System.out.println("Value should be 0 or 1");
                    j--;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Ans is:" + specialCellInBinaryMatrix(n, m, mat));
    }

    public static int specialCellInBinaryMatrix(int n, int m, int mat[][]) {
        int val = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                   
                    Boolean check = checker(i, j, mat, n, m);
                   
                    if (check == true) {
                        val++;
                    }
                }
            }
        }
        return val;
    }

    public static boolean checker(int i, int j, int[][] mat, int n, int m) {
        // Upward
        int up = i-1;
        while (up >= 0) {
            if (mat[up][j] == 1) {
                return false;
            }
            up--;
        }
        // Down
        int down = i+1;
        while (down < n) {
            if (mat[down][j] == 1) {
                return false;
            }
            down++;
        }
        // right
        int right = j+1;
        while (right < m) {
            if (mat[i][right] == 1) {
                return false;
            }
            right++;
        }
        int left = j-1;
        while (left >= 0) {
            if (mat[i][left] == 1) {
                return false;
            }
            left--;
        }
        return true;
    }

}