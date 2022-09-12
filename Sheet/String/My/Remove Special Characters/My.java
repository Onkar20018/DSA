
public class My {
    public static void main(String[] args) {

        String s = new String("!0java &*( by#$@Omkar");
        String n = s.replaceAll("[^a-zA-Z]", "");
        System.out.println(n);
    }
    // HERE
    // ^Represents not and other - are ranges a-z small a to z A-Z capital a to
    // Capital Z and 0 to 9
}
