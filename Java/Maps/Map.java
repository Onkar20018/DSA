import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap<Character, Integer> as = new HashMap<>();
        as.put('a', 1);
        as.put('v', 1);
        as.put('c', 1);
        as.put('c', 1);

        System.out.print(as.containsKey('b'));

    }

}