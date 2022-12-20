import java.util.* ;
import java.io.*; 
public class Solution {
             public static void main(String[] args) {
                int n=2;
                int m=3;
                int[][] mat = new int[n][m];
                Scanner sc = new Scanner(System.in);
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        mat[i][j]=sc.nextInt();
                    }
                }
                System.out.println("Your Ans is:");
               System.out.println(  maximumWeightRow(n,m,mat));
               sc.close();
             }
    public static int maximumWeightRow(int n, int m, int[][] mat) {
                 int max=0;
                  
                for (int i = 0; i < n; i++) {
                   int row=0;
                    for (int j = 0; j < m; j++) {
                        row=row+mat[i][j];
                    }
                   max=Math.max(max, row);
                 }
                 return max;
    }
}

