/*
 *                      HERE ,
 *                              We will use  Linked List as it is east to Remove and maintain the array
 *              We will bring i one by one and check oif i+1 is same as i 
 *                IF YES then we will remove i+1 and make i-- as to check if 3 times a letter is repeated
 *                IF No will do nothing
 * 
 */
import java.util.Iterator;
import java.util.LinkedList;

public class My {
    public static void main(String[] args) {
        String s = new String("aabsss");
        System.out.println(removeConsecutiveCharacter(s));
    }

    public static String removeConsecutiveCharacter(String S) {
        LinkedList<Character> l1 = new LinkedList<>();
        char[] arr = S.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            l1.add(arr[i]);
        }
        for (int i = 0; i + 1 < l1.size(); i++) {
            if (l1.get(i) == l1.get(i + 1)) {
                l1.remove(i + 1);
                i--;
            }
        }
        String to_return = new String("");
        Iterator<Character> it = l1.iterator();
        while (it.hasNext()) {
            to_return = to_return + it.next();
        }

        return to_return;
    }
}
