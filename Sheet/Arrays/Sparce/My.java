
/*
 *                EX:
 *          stringlist = [ab,ab,abc];
 *          querislist = [ab,abc,bc];
 * There are  instances of 'ab', 2 of 'abc' 1  and  of 'bc' 0;
 * So we must return List with [2,1,0]
 *                     APPROACH
 *                1. First we will create a Map and store all the Keys to Query string and Integer value
 *                   set to 0.
 *                2. Now we will compare it wih our String List , if the value in String is in the key
 *                   of the map then we update the Key value in map by 1. 
 *                3. If it does not match then we dont do anything.
 *                4. Lastly we store all the values of Hashmap in a List and Return it .
 * 
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class My {
    public static void main(String[] args) {
        List<String> stringlist = new ArrayList<>();
        List<String> queries = new ArrayList<>();
        int str = 3;
        int qu = 3;
        stringlist.add("ab");
        stringlist.add("ab");
        stringlist.add("abc");
        queries.add("ab");
        queries.add("abc");
        queries.add("bc");
        List<Integer> sx = new ArrayList<>();
        sx = matchingStrings(stringlist, queries);
        for (int i = 0; i < sx.size(); i++) {
            System.out.println(sx.get(i) + " ");
        }
    }

    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        HashMap<String, Integer> compare = new HashMap<>();
        for (int j = 0; j < queries.size(); j++) {
            String check = queries.get(j); // Create Hashmap using Query List
            compare.put(check, 0);
        }

        for (int i = 0; i < stringList.size(); i++) {
            String check = stringList.get(i);
            if (compare.containsKey(check)) {
                compare.put(check, (compare.get(check) + 1)); // To update the value when
                                                              // a query is found in list
            }
        }
        List<Integer> toreturn = new ArrayList<>(queries.size());
        for (int i = 0; i < queries.size(); i++) {
            String ke = queries.get(i);
            int val = compare.get(ke);
            toreturn.add(val); // Store all the values of keys in the List
        }
        return toreturn;

    }
}
