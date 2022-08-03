public class My {

    public static void main(String[] args) {
        String s = "Hackeraaavsfvrfsvank";
        String ans = hackerrankInString(s);
        System.out.println(ans);
    }
                  
    public static String hackerrankInString(String s) {
        char[] sc = s.toCharArray(); // Stores in cHar array of string
        for (int k = 0; k < sc.length; k++) {
            sc[k] = Character.toLowerCase(sc[k]); // Convert capital all to small
        }
        char[] hack = { 'h', 'a', 'c', 'k', 'e', 'r', 'r', 'a', 'n', 'k' };
        
        int i = 0, j = 0;
        while (i < sc.length && j < hack.length) {
            if (sc[i] == hack[j]) {
                i++;
                j++; // Move j only when element is Caught else dont move J
                if (j == hack.length) {
                    return "YES";// If all the elements are calculated that means Hackerrank EXISTS.
                }
            } else {
                i++;
            }
        }
        return "NO";
    }
}
