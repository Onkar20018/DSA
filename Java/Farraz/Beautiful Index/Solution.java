 
public class Solution {
    public static void main(String[] args) {
        int[] a ={1 ,7 ,3 ,6 ,5 ,6}; //4 ,  sum is=28
        int n =6;
        System.out.println(beautifulIndex(n, a));
    }
    public static int beautifulIndex(int N, int[] A)
    {
        int result =0;
        int sum =0;
        int prev=0;
        for (int i : A) {
               sum=sum+i;
        }
        for (int i = 0; i < A.length; i++) {
                sum=sum-A[i];
                if (prev==sum) {
                  result=i+1;
                  break;
                }else{
                  prev=prev+A[i];              
                     }
            }
      if (result!=0) {
        return result;
      }
      else{
       return -1;
       }
    }
}