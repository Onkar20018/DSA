public class Fibonacci{
    public static void main(String[] args) {
          print(5);
    }
    public static void print(int n){
         int  k=1;
        if(n==5){
            System.out.println(n);
            return;
        }
        System.out.println(k);
        print(k+1);
    }
}