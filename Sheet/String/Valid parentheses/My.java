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
            
           HERE WE ARE First creating two arrays which will store IN and Out Brackets
            If Out bracket comes then for tht instance only we compare if Not true false if true
            make In array index -- 
            Edge cases are if array starts at close bracket and array us less than 0

 */
public class My {

    public static void main(String[] args) {
        String s = new String("(())");
        System.out.println(isValid(s));

    }

    public static boolean isValid(String s) {
        if (s.length() < 2) { // Check if Length is less than 2
            return false;
        }
        char[] arr = s.toCharArray();
        int i = 0;
        int for_in = -1;
        int for_out = -1;
        int[] in = new int[s.length()];
        int[] out = new int[s.length()];
        boolean Out_flag = false;
        //////////////////////////////////////////
        while (i < arr.length) {
            int a = (int) arr[i]; // Convert to Int
            if (for_in == -1 && (a == 41 || a == 93 || a == 125)) {
                return false;
            } else if (a == 40 || a == 91 || a == 123) { // For IN Brackets
                // System.out.println(" in for a=" + a + " for in is " + for_in);
                for_in++;
                in[for_in] = a;
                Out_flag = false; // Make condition to check compare False
            } else if (a == 41 || a == 93 || a == 125) { // For OUT Brackets
                for_out++;
                out[for_out] = a;
                Out_flag = true; // Since Close bracket comes make condition to compare TRue
            }
            if (Out_flag == true) { // For Checking
                if (for_in != -1 && in[for_in] == 40) {
                    System.out.println("for in at 40");
                    for_in--;
                    if (out[for_out] != 41) {

                        return false;
                    }
                } else if (for_in != -1 && in[for_in] == 91) {
                    System.out.println("for in at 91");
                    for_in--;
                    if (out[for_out] != 93) {
                        Out_flag = false;
                        return false;
                    }
                } else if (for_in != -1 && in[for_in] == 123) {
                    System.out.println("for in at 123");
                    for_in--;
                    if (out[for_out] != 125) {
                        System.out.println("in 125");
                        Out_flag = false;
                        return false;
                    }
                } else {
                    Out_flag = false;// To make

                }
            }
            i++;

        }
        if (for_in != -1) { // To check if the elements are empty or not in IN if not empty then not closed
            return false;
        }
        return true;
    }
}