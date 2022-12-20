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
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        int[][] x = new int[n][n];
        x = getFinalGrid(mat, n);
        System.out.println("Your Ans is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    public static int[][] getFinalGrid(int a[][], int n) {
        int temp = 0;
        // Swaping 
        for (int i = 0; i < n; i++) {
            int back = n;
            for (int j = 0; j < n / 2; j++) {
                back--;
                temp = a[i][j];
                a[i][j] = a[i][back];
                a[i][back] = temp;
                
            }
        }
        // Complemeting 1 to 0 and 0 to 1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n ; j++) {
                    if (a[i][j]==0) {
                        a[i][j]=1;
                    }else{
                        a[i][j]=0;
                    }
                
            }
        }

        return a;
    }
}
