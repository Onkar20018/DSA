import java.util.* ;
import java.io.*; 
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int m = 3;
        String stones ="abAAc";
        String jewels="Acd";
        System.out.println("Ans is:"+treasureAndJewels(n, m, stones, jewels));
    }
    public static int treasureAndJewels(int n, int m, String stones, String jewels) {
       int count=0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<m;i++){
            map.put(jewels.charAt(i),0);
        }
        for(int i=0;i<n;i++){
            if(map.containsKey(stones.charAt(i))){
             count++;
            }
        }
        return count;
    }

    }

