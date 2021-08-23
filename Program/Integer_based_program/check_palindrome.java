package Git.integer_based_programs;

import java.util.Scanner;

public class check_palindrome {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y =x;

        int res =0;
        while(x!=0 ){
            res = res*10+x%10;

            x/=10;
        }

        System.out.println( (String.valueOf(y).equals(String.valueOf(res)) ?"Palindrome":"Not palindrome") );
    }
}
