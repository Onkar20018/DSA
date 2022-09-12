public class My {
    public static void main(String[] args) {
        String s = new String("PROGRAMMING");
       // String t = new String();
        StringBuilder c = new StringBuilder();
        s.chars().distinct().forEach(v -> c.append((char) v));
      //  s.chars().distinct().forEach(v -> t.concat((char) v));
        System.out.println(c);
             /// APPROACH 2
             // USER SET in java as it not allows Duplicates
    }
}
