public class Coin {
    public static void main(String[] args) {
        c(14);
    }

    public static void c(int n) {
        int total = n;
        int i = 1;
        int j = 1;
        int k = 1;
        int ans = 0;
        while (total > 0) {
            j = 1;
            k = i;
            System.out.print(i + " ");
            while (j <= i && total > 0) {
                System.out.print("*" + " ");
                total--;
                k--;
                j++;
            }
            System.out.println();
            if (k == i - i) {
                ans = i;
            } else {
                ans = i - 1;
            }
            i++;
        }
        // System.out.println();
        System.out.println("Ans is=" + ans);
    }
}
