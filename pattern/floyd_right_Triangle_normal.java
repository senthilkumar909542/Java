package Git.pattern.floyd;
import java.util.Scanner;

public class floyd_right_Triangle_normal{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result=1;


        for(int i =0; i< a;i++){
            for(int j=0;j<=i;j++){
                System.out.print((result++)+" ");
            }
            System.out.println();
        }
    }
}
