import java.util.* ;
import java.io.*; 

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println("Npw Array");
        int[][] mat = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j]=sc.nextInt();
            }
        }
          System.out.println("Array FInished");
          int r=sc.nextInt();
          int c=sc.nextInt();
        int [][] ans  = new int[r][c]; 
        System.out.println("Your Ans is:");
        ans=arrange(n, m, mat, r, c);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print( ans[i][j]+" ");
            }
            System.out.println();
        }
       sc.close();
    }
    public static int[][] arrange(int n, int m, int b[][], int r, int c) {
         if (n*m!=r*c) {
            return b;
         }else{
        ArrayList<Integer> list = new   ArrayList<>();
         int [][] ans = new int[r][c];
         for (int i = 0; i < n; i++) {
              for (int j = 0; j < m; j++) {
                 list.add(b[i][j]);
              }
          }
           int index=0;
          for (int i = 0; i < r; i++) {
              for (int j = 0; j < c; j++) {
                     ans[i][j]=list.get(index++);
              }
          }
          return ans;
    }
     }
}   