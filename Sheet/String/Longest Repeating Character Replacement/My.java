import java.util.HashMap;

import javax.sound.midi.MidiChannel;

public class My {
    public static void main(String[] args) {
        String s = new String("ABBABA");
        int k = 2;
        System.out.println(s);
        System.out.println(characterReplacement(s, k));
    }

    public static int characterReplacement(String s, int k) {
        // HashMap<Character, Integer> mpp = new HashMap<>();
        int left = 0;
        int length = 0;
        int right = 1;
        int middle = 0;
        int remain = 0;
        boolean rem = false;
        char[] arr = s.toCharArray();
        char check = arr[0];
        while (right < arr.length) {
            System.out.println("Iteration " + right + " char is " + arr[right]);
            if (arr[right] != check) {
                if (rem == true) {
                    System.out.println("In true");
                    length = Math.max(left, right - left + 1);
                    remain = 0;
                    rem = false;
                    left = middle;
                    right = left + 1;
                    System.out.println("Lengthsss =" + length);
                }else{
                remain = remain + 1;
                System.out.println("Remain is:" + remain);
                if (remain == k) {
                    rem = true;
                    middle = right;
                    length = right - left + 1;
                    check = arr[middle];
                    length = Math.max(length, left - right);
                    System.out.println("Middle changes at " + arr[right] + " at " + right + " and length is " + length);
                } else {
                    length = Math.max(length, right - left + 1);
                    System.out.println("Ch =" + length);
                }
            }
            } else {
                length = right - left + 1;
                System.out.println("Big Else char is same as check :" + arr[right] + " index is :" + right
                        + " Length is " + length);
            }
            right++;
        }
        return length;
    }
}
