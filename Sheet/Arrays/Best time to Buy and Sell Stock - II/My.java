/*
   Q:
   You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.

Find and return the maximum profit you can achieve.
Input: prices = [7,1,5,3,6,4]
Output: 7
Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
Total profit is 4 + 3 = 7.

///////////////////////////////////////////////////////////////////////////////////
                 Here,
                  Since we need to find all the possible profits also Best Profits and then sum then ,
                  We will use an array to store our Profits.
                  Now since we can only get a profit if the Price of next day is Greater than buy price,
                  So we will use two Pointers , start and end
                  We will check end-start  and store it in Sum ; whenever if the sum is more than Max for start at same position and end is variable we will add it to Max , now when for the same start , if sum which we got is less than Max , then we come to know that the Max profit was previous position , so now we store that profit which is in Max since it not updated and take our Buy position to End as Start=End and again new stock is Baught.

 *                               APPROACH
 *                  1. Use a while loop for iteration.
 *                  2. If the value of End is less than Start , move Start++. 
 *                  3. Maintain a Sum and a Max for each Window , Whenever the Max sum is got ,
 *                     update the Max.
 *                  4. If Sum is which we got is Less than Max, so store the max is array and change our
 *                     Start to End 
 *                  
 *                                       
 */

 /* TC= BigO(n) */
import java.util.ArrayList;
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
        sc.close();
        bs(a);
    }

    /////////////////////////////////////////////////////////
    public static void bs(int a[]) {
        ArrayList<Integer> profits = new ArrayList<>();
        int sum=0;
        int max=0;
        int start =0;
        int end=0;
         while(end<a.length){
            if (a[end]<a[start]) {
                 start++;
            }else {
                sum = a[end]-a[start];
                if (sum>max) {
                    max=sum;
                }else if(max!=0){
                    profits.add(max);
                    max=0;
                    start=end;
                    end++;
                }else{
                    end++;
                }
            }
         }
         int Total = 0;
         for (int i = 0; i < profits.size(); i++) {
             Total= Total+ profits.get(i);
         }
         System.out.println();
        System.out.println("Total is:"+Total);
    }
}