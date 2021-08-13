
import java.util.Scanner;

public class star_pattern {
    static void test(int r){

        int a=1;

        for(int i=0;i<r-1;i++){
            int s=0;

            if(i<1) {
                s =1;
            }
            for(int z =i+s;z<=r;z++){
                System.out.print("*");
            }

            for(int j =0;j<=i;j++){
                System.out.print(a+"*");
            }
            for(int z =i+s;z<r;z++){
                System.out.print("*");
            }
            System.out.println();
            a++;
        }


    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int r =sc.nextInt();

        test(r);
    }
}
