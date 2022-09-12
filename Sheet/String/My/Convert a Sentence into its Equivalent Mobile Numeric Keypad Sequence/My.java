
public class My {
    public static void main(String[] args) {
        String S = new String("AE");
        System.out.println(printSequence(S));
    }

    public static String printSequence(String S) {
        String[] ints = { "2", "22", "222", "3", "33", "333", "4", "44", "444", "5", "55", "555", "6", "66", "666", "7",
                "77", "777", "7777", "8", "88", "888", "9", "99", "999", "9999" };
        char[] ch = S.toCharArray();
        String s = "";
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ' ') {
                s = s + "0";
            } else {
                int index = ch[i] - 'A';
                s = s + ints[index];
            }
        }
        return s;
    }

}
