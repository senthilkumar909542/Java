package Git.ionixx;

import java.util.*;
public class ionixx_2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int len =sc.nextInt();
        int flag =0;

        for(int i=0;i<len;i++){
            flag=0;


            for(int j =0;j<len;j++){

                if( i+1==j || flag==1){
                    flag =1;
                    System.out.print("#");
                }
                if( flag==0){
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }
}


