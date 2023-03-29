/* Ans1 is for first occ
  Ans2 is for last Occ
 */

public class Solution{
    public static void main (String args[]){
        int[] arr ={1,2,3,4,4,4,5,6};
        System.out.println(ans1(arr,4));
        System.out.print(ans2(arr,4));
    }
    public static int ans1(int[] arr,int k){
            int s=0;
            int e=arr.length-1;
            int mid=0;
            int ans=-1;
            while(s<=e){
             mid = s+(e-s)/2;
             if(arr[mid]==k){
            //    System.out.print("in");
                   ans=mid;
                   e=mid-1;
             }
             else if(arr[mid]<k){
                    s=mid+1;
             }
             else if(arr[mid]>k){
                    e=mid-1;
             }
            }
         return ans;
        }
    public static int ans2(int[] arr,int k){
            int s=0;
            int e=arr.length-1;
            int mid=0;
            int ans=-1;
            while(s<=e){
             mid = s+(e-s)/2;
             if(arr[mid]==k){
                   ans=mid;
                   s=mid+1;
             }
             else if(arr[mid]<k){
                    s=mid+1;
             }
             else if(arr[mid]>k){
                    e=mid-1;
             }
            }
         return ans;
        }
}