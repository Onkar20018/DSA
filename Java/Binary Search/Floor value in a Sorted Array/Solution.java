public class Solution {
    public static void main(String[] args) {
        long[] arr = { 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86 };
        int n = arr.length;
        int x = 77;
        System.out.println(findFloor(arr, n, x));
    }

    static int findFloor(long arr[], int n, long target) {
        int start = 0;
        int end = n - 1;
        int mid = start + (end - start) / 2;
        int floor = -1;
        while (start <= end) {
            if (arr[mid] == target) {
                return (int) arr[mid];
            } else if (target < arr[mid]) {
                {
                    end = mid - 1;
                }
            } else if (target > arr[mid]) {
                {
                    floor = (int) arr[mid];  // Store the Possible Floor Value
                    start = mid + 1;
                }
            }

            mid = start + (end - start) / 2;
        }
        return floor;
    }
}