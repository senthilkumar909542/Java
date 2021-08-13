
import java.util.Scanner;

public class Invert_right_triangle {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for(int i=0;i<a;i++){
            int count=a;
            for(int j=a-i;j>0;j--){
                System.out.print(count+" ");
                count--;
            }
            System.out.println();
        }
    }
}
