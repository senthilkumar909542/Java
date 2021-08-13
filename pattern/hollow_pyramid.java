
import java.util.Scanner;

public class hollow_pyramid {

    static void hollow(int r){
        int a=0;
        for(int i=0;i<r;i++){

            for(int z =i;z<r;z++){
                System.out.print("  ");
            }
            for(int j=0;j<=i+a;j++){
                if(j ==0||j == i+a || i == r-1) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            a+=1;
            System.out.println();
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        hollow(r);
    }
}
