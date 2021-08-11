package Git.pattern;
import java.util.Scanner;

public class double_triangle {
    public static  void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int a;


        for(int i =0;i<r;i++){
            a=1;
            for(int j =i;j<r;j++){
                System.out.print(a++ +" ");
            }
            System.out.println();
        }
        for(int i=1;i<r;i++){
            a =1;
            for(int j=0;j<=i;j++){
                System.out.print(a++ +" ");
            }
            System.out.println();
        }
    }
}
