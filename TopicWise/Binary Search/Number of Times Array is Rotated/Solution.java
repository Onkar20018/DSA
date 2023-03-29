class Solution {
    public static void main(String[] args) {
        int[] arr = { 66, 72, 79, 86, 95, 104, 106, 110, 119, 123, 124, 129, 132, 136, 137, 142, 150, 2, 12, 14, 17, 26,
                30, 36, 38, 46, 52, 60 };
        int n = arr.length;
        int ans = findKRotation(arr, n);
        System.out.println();
        System.out.println(ans);

    }

    public static int findKRotation(int arr[], int n) {
        if (arr[0] < arr[n - 1]) {
            return 0;
        }
        int s = 0;
        int e = n - 1;
        int mid = 0;
        // while(s<=e){
        // mid=s+(e-s)/2;
        // if(mid!=0 && arr[mid]<=arr[mid-1]){
        // return mid;
        // }else if(mid!=n-1 && arr[mid]>arr[mid+1]){
        // return mid+1;
        // }
        // else if(arr[mid]<=arr[s]){
        // e=mid-1;
        // }
        // else if(arr[mid]>=arr[s]){
        // s=mid+1;
        // }
        // }
        // return 0;
        while (s <= e) {
            mid = s + (e - s) / 2;
            System.out.println(mid);
            int prev = (mid + n - 1) % n;
            int next = (mid + 1) % n;
            if (arr[mid] <= arr[prev] && arr[mid] <= arr[next]) {
                  return mid;
            }
            if (arr[0] <= arr[mid]) {
                s = mid + 1;
            } else if (arr[mid] <= arr[n - 1]) {
                e = mid - 1;
            }
        }
       
        return mid;
    }
}
