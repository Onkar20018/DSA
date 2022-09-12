
/*
 *         APPROACH 
 *        In this we will be first reversing the string
 *        Then we willl store the ascii values in a numeric ARRAY
 *        Then we will store the diff of both adjecent numbers in an INT array
 *        Then we will compare the arrays
 *              IF Both array are same the return FUNNY 
 *            else return NOT FUNNY
 */

public class My {
    public static void main(String[] args) {
        String s = "bcxz";
        char[] first = s.toCharArray();
        char[] reverse = new char[s.length()];

        for (int i = first.length - 1, j = 0; i >= 0; i--) {
            reverse[j] = first[i];
            j++;
        }
        System.out.println();
        System.out.println(funnyString(s));
        System.out.println();
    }

    public static String funnyString(String s) {
        char[] first = s.toCharArray();
        char[] reverse = new char[s.length()];
        for (int i = first.length - 1, j = 0; i >= 0; i--) { // REVERSING THE ARRAY
            reverse[j] = first[i];
            j++;
        }
        int[] f_int = new int[s.length()];
        int[] r_int = new int[s.length()];
        for (int k = 0; k < s.length(); k++) { // CONVERTIG TO ASSCII NUMBERS
            f_int[k] = (int) first[k];
            r_int[k] = (int) reverse[k];
        }

        int[] f_dif = new int[s.length() - 1];
        int[] r_dif = new int[s.length() - 1];
        
        for (int l = 0; l < s.length(); l++) {        // SAVING THE DIFFERENCE
            if ((l + 1) < s.length()) {
                f_dif[l] = Math.abs(f_int[l + 1] - f_int[l]);
                r_dif[l] = Math.abs(r_int[l + 1] - r_int[l]);
            }
        }
        for (int m = 0; m < f_dif.length; m++) {
            if (f_dif[m] != r_dif[m]) {  // COMPARNG THE ARRAY
                return "Not Funny";
            }
        }
        return "Funny";

    }

}
