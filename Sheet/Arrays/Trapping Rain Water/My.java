/*
 * Given n non-negative integers representing an elevation map where the width of each bar is 1, 
 * compute how much water it can trap after raining.
 */
/* Not optimal and not covers all tests */
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
        trap_water(a);
        sc.close();
    }    
        /////////////////////////////////////////////////////////
           public static void trap_water(int a[]){
               int back=0,front=0;
               int index_back=0,index_front=0;
               int water=0;
                  for (int i = 0; i < a.length; i++) {
                    if (a[i]==0) {
                        
                    }else if(back ==0 ){
                      back = a[i];
                      System.out.println("Back is "+back + " at i ="+i);
                      index_back=i;
                    }else if(a[i]>=back && i!=index_back){
                        front = a[i];
                        System.out.println("Front is "+front + "at i= "+i);
                        index_front=i;
                    }
                    if (front!=0 && back!= 0) {
                        for (int j = index_back+1; j <index_front ; j++) {
                           water += a[index_back]-a[j];
                           System.out.println("water added at j= "+j +" as "+(a[index_back]-a[j])); 
                        }
                        i=i-1;
                        back=0;
                        front=0;
                    }
                  }
                     System.out.println("Water Trapped is :"+water);
           }
}