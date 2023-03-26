
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int[][] grid = new int[5][5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print("Enter Value:");
                grid[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter k:");
        int k= sc.nextInt();
       int[] ans = new int[k];
       ans=kWeakestRows(grid, k);
       for (int i = 0; i < ans.length; i++) {
       System.out.print(ans[i]+" ");       
        } 
        
    }
    public static int[] kWeakestRows(int[][] mat, int k) {
                int col = mat.length;
                int [] count = new int[col];
                for (int i = 0; i < count.length; i++) {
                      int c = binary(mat[i]);  
                      count[i]=c;                  
                }
               
                return count;
                 


    }
    public static int binary(int[] x){
                int start=0;
                int end= x.length-1;
                int mid = start+(end-start)/2;
                int count=0;
                while (start<=end) {
                    if(mid>0 && x[mid]==0 && x[mid-1]==1){
                        count= count+mid;
                        break;
                    }else if(mid < x.length-1 && x[mid]==0 && x[mid-1]==0 ){
                                  end=end-1;
                    }else{
                        start=start+1;
                    }
                    mid=start+(end-start)/2;
                }
                return count;
    } 
}
