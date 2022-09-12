
public class My {

    public static void main(String[] args) {
        String s = new String("Omkar");

        char[] as = s.toCharArray();
        System.out.println("LENGTH IS :" + as.length);
        for (int i = 0; i < as.length; i++) {
            System.out.print(as[i] + " ");
        }
        System.out.println();
        for (int i = as.length - 1; i >= 0; i--) {
            System.out.print(as[i] + " ");
        }

    }

}