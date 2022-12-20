import java.util.*;
import java.io.*;

/*
    The higherlower(int n) function can be called from guesser object
    @api: guesser.higherlower(n)
    return value will be -1 if n is lower, 0 is n is equal or 1 if n is higher.
*/
/**
 * Guesser
 */
class Guesser {
    public int higherlower(int n) {
        int hidden = 8;
        if (n > hidden) {
            return 1;
        } else if (n < hidden) {
            return -1;
        } else {
            return 0;
        }
    }

}

public class Solution {
    public static void main(String[] args) {
        Guesser g = new Guesser();
        System.out.println(numberGuess(9, g));
    }

    public static int numberGuess(int n, Guesser guesser) {
        int boundry = n;
        int catchs = 0;
        while (n >= 0 && n <= boundry) {
            catchs = guesser.higherlower(n);
            // System.out.println(catchs);
            if (catchs == 0) {
                return n;
            } else if (catchs == 1) {
                n = n - 1;
            } else {
                n = n + 1;
            }
        }
        return -1;
    }

}