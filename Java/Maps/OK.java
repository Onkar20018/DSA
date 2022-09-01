import java.util.HashMap;
import java.util.Scanner;

import java.util.Scanner;

public class OK {

    public static void main(String[] args) {
        HashMap<Integer, Integer> oil = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Category Number");
        int N_of_Fuel = sc.nextInt();
        System.out.println("Enter Money");
        int Money = sc.nextInt();
        System.out.println(N_of_Fuel + " " + Money);
        int[] price = new int[N_of_Fuel];
        int[] volume = new int[N_of_Fuel];
        int min_money = 10000000;
      
        for (int i = 0; i < price.length; i++) {
            System.out.println("Enter Price");
            price[i] = sc.nextInt();
            if (price[i] < min_money) {
                min_money = price[i];
            }
        }
       
        for (int i = 0; i < price.length; i++) {
            System.out.println("Enter Volume");
            volume[i] = sc.nextInt();
        }

        //////////////////////////////////////////
        
        int volume_max = 0, price_max = 0;
        int oil_Get = 0;
        while (Money > min_money) {
            volume_max = 0;
            price_max = 0;
            for (int i = 0; i < volume.length; i++) {
                if (price[i] >= price_max && price[i] <= Money) {
                    price_max = price[i];
                    if (volume[i] > volume_max) {
                      
                        volume_max = volume[i];
                    }
                }
            }
          
            oil_Get = oil_Get + volume_max;
            Money = Money - price_max;
          
        }
        System.out.println("Oil is " + oil_Get);
    }
}