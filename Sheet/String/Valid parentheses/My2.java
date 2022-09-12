import java.util.Stack;

/*
     Q:Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
    An input string is valid if:
            Open brackets must be closed by the same type of brackets.
            Open brackets must be closed in the correct order.
            Every close bracket has a corresponding open bracket of the same type.
Input: s = "()"
Output: true
Input: s = "([]){}"
Output: true
Input: s = "(]"
Output: false

 /////////////////////////////////////////////////////////////////////////////////////////////////
            
           HERE WE ARE First creating Stack for storing all the Opening Brackets
            If Closing brackets comes we check the peek of the In Stack if matches do nothing 
            else return false
            Edge cases are if array starts at close bracket and array us less than 0

 */
public class My2 {

    public static void main(String[] args) {
        String s = new String("");
        System.out.println(isValid(s));

    }

    public static boolean isValid(String s) {
        if ((s.length() == 0)) {
            return false;
        }
        Stack<Integer> In = new Stack<>();

        int start = 0;
        char[] ch = s.toCharArray();
        int cha = ch[start];
        if (cha == 41 || cha == 93 || cha == 125) {
            return false;
        }
        while (start < ch.length) {
            cha = ch[start];
            if ((cha == 41 || cha == 93 || cha == 125)) { // Closing
                if (In.isEmpty()) {
                    return false;
                }
                int check_in = In.peek();
                if (check_in == 40) {
                    if (cha == 41) {
                        In.pop();
                        start++;
                    } else {
                        return false;
                    }
                } else if (check_in == 91) {
                    if (cha == 93) {
                        In.pop();
                        start++;
                    } else {
                        return false;
                    }
                } else if (check_in == 123) {
                    if (cha == 125) {
                        In.pop();
                        start++;
                    } else {
                        return false;
                    }
                }

            } else if (cha == 40 || cha == 91 || cha == 123) {
                In.push(cha);
                start++;
            }
        }

        if (In.isEmpty()) {

            return true;
        } else {
            return false;
        }
    }

}
