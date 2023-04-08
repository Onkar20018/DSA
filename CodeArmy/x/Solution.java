
public class Solution {
    public static void main(String[] args) {
        int[] arr = { 9, 4, -2, -1, 5, 0, -5, -3, 2 };
        rearrange(arr, arr.length);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void rearrange(int arr[], int n) {
        int cp = 0;
        int cn = 0;
        int i = 0;
        while (i < n) {
            if (arr[i] < 0) {
                cn++;
            } else {
                cp++;
            }
            i++;
        }
        int[] ps = new int[cp];
        int[] nv = new int[cn];
        int pi = 0;
        int ni = 0;
        i = 0;
        while (i < n) {
            if (arr[i] < 0) {
                nv[ni] = arr[i];
                ni++;
            } else {
                ps[pi] = arr[i];
                pi++;
            }
            i++;
        }
        i = 0;
        pi = 0;
        ni = 0;
        while (pi < cp && ni < cn) {
            if (i % 2 == 0) {
                arr[i] = ps[pi++];
            } else {
                arr[i] = nv[ni++];
            }
            i++;
        }
        while (pi < cp) {
            arr[i++] = ps[pi++];
        }
        while (ni < cn) {
            arr[i++] = nv[ni++];
        }

    }
}
