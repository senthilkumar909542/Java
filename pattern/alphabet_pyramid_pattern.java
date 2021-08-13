package Git.pattern;
import java.util.Scanner;

public class alphabet_pyramid_pattern {

    static void palindrome(int r ){
        int a=0;
        for(int i =0;i<r;i++){
            int s = 64;

            for(int z =0;z<r-i;z++){
                System.out.print("  ");
            }
            for(int j =0;j<=i+i;j++) {
                if(j-1 == a){
                    int x;

                    for(x = 1;x<j;x++) {

                        System.out.print((char)--s +" ");

                    }
                    j = j+x;
                }else {

                    System.out.print((char)++s +" ");

                }
            }
            System.out.println();
            a++;

        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        palindrome(r);
    }
}
