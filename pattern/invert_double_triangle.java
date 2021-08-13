
import java.util.Scanner;

public class invert_double_triangle {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int a;


        for(int i=0;i<r;i++){
            a = i;

            for(int z =0;z<i;z++){
                System.out.print("  ");
            }
            for(int j =0;j<r-i;j++){
                System.out.print(++a +" ");
            }
            System.out.println();
        }
        int x =1;
        for(int i=r-1;i>0;i--){
            a =i;

            for(int z =i-1;z>0;z--){
                System.out.print("  ");
            }

            for(int j=0;j<=x;j++){
                System.out.print(a +" ");
                a++;
            }


            System.out.println();
            x++;
        }


    }
}
