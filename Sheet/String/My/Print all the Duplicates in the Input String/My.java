/*      
 * 
 *                                                      HERe , We are using arrays
 *           First we make all characters to Uppercase
 *           Then we create an array of 26 intehers AS USING HASHING
 *          we will add 1 everytime a char index comes 
 *         later we will check which char is repated how many Times
 */

import java.util.ArrayList;

public class My {
    public static void main(String[] args) {
        String s = "Omkarr";
        System.out.printf("Input is %s\n", s);
        ArrayList<String> k = Duplicate(s);
        for (int i = 0; i < k.size(); i++) {
            System.out.println(k.get(i));
        }
    }

    public static ArrayList<String> Duplicate(String s) {
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) { // TO Convert to Uppper case
            ch[i] = Character.toUpperCase(ch[i]);
        }
        int[] arr = new int[26]; // To Store Duplicates
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
        for (int i = 0; i < ch.length; i++) { // To Get Index
            if ((int) ch[i] == 32) { // if Space Comes
                continue;
            } else {

                int index = ch[i] - 65; // Using this a is stored at 0 b is at 1 and likewise
                arr[index] = arr[index] + 1;
            }
        }

        ArrayList<String> ax = new ArrayList<>();
        boolean repeated = false;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 1) { // To check which element is repeated and how many times
                String x = ((char) (i + 65)) + " >Repeated >" + arr[i] + "-Times";
                ax.add(x);
                repeated = true;
            }

        }
        if (repeated == false) {
            ax.add(" No Element is Repeated");
            return ax;
        } else
            return ax;
    }
}