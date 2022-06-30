import java.util.Scanner;


public class Matrix {

    public static void main(String[] args) {
       
        
        System.out.println("Enter the rows:");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        System.out.println("Enter the Colomns:");
        int Colomns = sc.nextInt();
        int a[][] = new int [rows][Colomns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < Colomns; j++) {
                System.out.println("Enter value for rows:"+i+" Colomn:"+j);
                a[i][j]= sc.nextInt();
            }
        }

        System.out.printf("\nThis is a %dX%d Matrix\n2",rows,Colomns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < Colomns; j++) {
                System.out.print(a[i][j]);
                System.out.print(" ");
            }
            System.out.println("");

               sc.close();
                    }
    }

}