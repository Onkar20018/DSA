import java.util.Scanner;

public class My {
    //////////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        int n;
        System.out.print("Enter the Length of The Array:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the element at " + i + ":");
            a[i] = sc.nextInt();
        }
        ////////////////////////////////////////////
        System.out.print("Your array is :[");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]);
            if (i != n - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
        System.out.println("");
        water(a);
        sc.close();
    }

    /////////////////////////////////////////////////////////
    public static void water(int arr[]) {
        int a, b, c;
        int i = 0, j = arr.length - 1;
        int water = 0;
        if (arr.length <= 1) {
            System.out.println("Water is 0");
        } else if (arr.length == 2) {
            if (arr[0] < arr[1]) {
                System.out.println("Water is :" + arr[0]);
                ;
            } else 
                System.out.println("water is:" + arr[1]);
        } else {

            while (i < j) {
                a = arr[i];
                b = arr[j];
                if (a > b) {
                    c = b * (j - i);
                    water = Math.max(c, water);
                    j--;

                } else if (b > a) {
                    c = a * (j - i);
                    water = Math.max(c, water);
                    i++;

                } else {
                    c = a * (j - i);
                    water = Math.max(c, water);
                    i++;
                }
            }
            System.out.println("Water is:" + water);
        }
    }

}