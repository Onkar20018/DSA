
import java.util.ArrayList;
import java.util.List;
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
        sum3(a);
        sc.close();
    }

    /////////////////////////////////////////////////////////
    public static void sum3(int arr[]) {
        Integer a, b, d;
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                a = arr[i];
                b = arr[j];
                nums.add(a);
                nums.add(b);

            }
        }

        System.out.println("Nums");
        System.out.println(nums);

         for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] = -nums.get(i)-nums.get(i+1)){
                    
                }
            }
         }

    }
}