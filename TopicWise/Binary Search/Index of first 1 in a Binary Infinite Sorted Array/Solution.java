
public class Solution {
    public static void main(String[] args) {
        int[] arr = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        System.out.println(find(arr));
    }
   /// Since it is an Infinite Array we must crop a Window
    public static int find(int[] arr) {
        int s = 0;
        int e = 1;
        while (arr[e] < 1) {
            s = e;
            e = e * 2;
        }
        int mid = s + (e - s) / 2;
        System.out.println("s=" + s + " e=" + e);
        return binary(arr, s, e, mid);
    }

       // Now we got our window cropped , Now search for the First occurance
    public static int binary(int[] arr, int s, int e, int mid) {
        int ans = -1;
        while (s <= e) {
            if (arr[mid] == 1) {
                ans = mid;
                e = mid - 1;
            }else  if (arr[mid] < 1) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
            mid = s + (e - s) / 2;
        }
        return ans;
    }
}
