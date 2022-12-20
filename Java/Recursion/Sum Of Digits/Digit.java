public class Digit {

    public static void main(String[] args) {
        System.out.println(Digits(1243));
    }

    public static int Digits(int n) {
        if (n - 9 < 1) {
            return n;
        }
        int x = n % 10;
        System.out.println(x);
        return x + Digits(n / 10);
    }
}