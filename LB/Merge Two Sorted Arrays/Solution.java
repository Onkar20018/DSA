
public class solution {
    public static void main(String[] args) {
        int[] arr1 = { 4, 5, 6, 0, 0, 0 };
        int[] arr2 = { 1, 2, 3 };
        // int[] ans = merge(arr1, arr1.length, arr2, arr2.length);
        // for (int i = 0; i < ans.length; i++) {
        // System.out.print(ans[i] + " ");
        // }
        merge(arr1, arr1.length - arr2.length, arr2, arr2.length);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int for_j = n - 1; // For nums2
        int for_i = m - 1; // For nums1
        int index = m + n - 1; // To maintain Index of nums1

        while (for_i >= 0 && for_j >= 0) {
            // To check if the nums2 is greater than nums 1 and swap and decrease nums2
            // index
            if (nums2[for_j] >= nums1[for_i]) {
                int temp = nums1[index];
                nums1[index] = nums2[for_j];
                nums2[for_j] = temp;
                for_j--;

            }
            // To check if the nums1 is greater than nums2 and swap and decrease nums1 index
            else if (nums1[for_i] >= nums2[for_j]) {
                int temp = nums1[index];
                nums1[index] = nums1[for_i];
                nums1[for_i] = temp;
                for_i--;
            }
            // Move index backwords
            index--;
        }
        // Incase any number is remaining from Smaller Array
        while (for_j >= 0) {
            nums1[index--] = nums2[for_j--];
        }
        // Print the Outpur
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }

        ///////////////////////////////////////////////////////////////////////////////////////////////////////
    }
}
