import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) {
        String s = "AbcdEfgh";
        System.out.println(toLowerCase(s));
    }

    public static String toLowerCase(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            int ax = str.charAt(i);
            if (ax < 97) {
                arr[i] = (char) (ax + 32);
            } else {
                arr[i] = (char) ax;
            }
        }
        String ans = "";
        for (int i = 0; i < arr.length; i++) {
            ans = ans + arr[i];
        }
        return ans;
    }

}