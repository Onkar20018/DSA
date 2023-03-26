import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int[][] grid = new int[4][4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print("Enter Value:");
                grid[i][j] = sc.nextInt();
            }
        }

        System.out.println("Ans is :" + countNegatives(grid));

    }

    public static int countNegatives(int[][] grid) {
        int col = 0;
        int row = grid[0].length - 1;
        int ans = 0;
        while (col < grid.length && row >= 0) {
            if (grid[col][row] < 0) {
                System.out.println("in" + " col=" + col + " row=" + row);
                ans = ans + grid.length - col;
                System.out.println(ans);
                row = row - 1;
            } else {
                col = col + 1;
            }
        }
        return ans;
    }
}