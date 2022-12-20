
public class Solution {
    public static void main(String[] args) {
        int arr1[] = { 3, 6, 10, 0, 0, 0, 0 };
        int arr2[] = { 2, 5, 8, 10 };
        int[] x = new int[arr1.length + arr2.length];
        x = ninjaAndSortedArrays(arr1, arr2, 3, 4);
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
    }

    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {

        int last = m + n - 1;
        while (m > 0 && n > 0) {
            if (arr1[m - 1] > arr2[n - 1]) {
                arr1[last] = arr1[m - 1];
                // System.out.println("1. Instered " + arr1[last]);
                m--;
            } else {
                arr1[last] = arr2[n - 1];
                // System.out.println("2. Instered " + arr1[last]);
                n--;
            }
            last--;

        }

        while (n > 0) {

            arr1[last] = arr2[n - 1];
          //  System.out.println("3. Instered " + arr1[last]);
            last--;
            n--;
        }
        return arr1;
    }
}
