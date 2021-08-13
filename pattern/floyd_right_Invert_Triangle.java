
import java.util.Scanner;

public class floyd_right_Invert_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c, b;
        c = a * (a + 1) / 2;


        for (int i = 0; i < a; i++) {
            b = c--;
            int dec = a - 1;
            for (int j = 0; j <a-i; j++) {

                System.out.print(b + " ");
                b = b - dec;
                dec--;


            }

            System.out.println();
        }


    }
}

