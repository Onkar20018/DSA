import java.util.*;
import java.io.*;
import java.util.ArrayList;
//public static void main(String[]args){ArrayList<Integer>a=new ArrayList<>();a.add(1);a.add(2);a.add(3);a.add(4);System.out.print(maximumProfit(a));}

public class Solution {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(5);
        a.add(83);
        a.add(34);
        a.add(27);
        a.add(56);
    
        System.out.print(maximumProfit(a));
    }

    // 5 83 34 27 56  
    public static int maximumProfit(ArrayList<Integer> prices) {
        int start = 0;
        int end = start + 1;

        int profit = 0;
        while (start < end && end < prices.size()) {
            if (prices.get(end) - prices.get(start) >= profit) {
                profit = prices.get(end) - prices.get(start);
             
            } else if (prices.get(end) - prices.get(start) <= 0) {
           
                start = end;
           
            }
            end++;
        }

        return profit;
    }
}
