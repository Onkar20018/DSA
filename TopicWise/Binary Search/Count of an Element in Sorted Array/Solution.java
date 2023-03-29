/* Ans1 is for first occ
  Ans2 is for last Occ
 */

public class Solution{
    public static void main (String args[]){
        int[] arr ={1,2,3,4,4,4,4,5,6};
        System.out.println(ans(arr,6));
    }

    public static int ans(int[]arr,int k){
        int c1=ans1(arr,k);
        int c2=ans2(arr,k);
        return c2-c1+1;
    }
    // Ans1 Gives first occurance
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
        // Ans2 Gives last occurance
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


