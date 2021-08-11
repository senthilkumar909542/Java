package com.zoho;
import java.util.Scanner;

public class zoho_pattern {

    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int y =0;
        int s;
        int x=0;
        //         1
        //       2 3 2
        //     3 4 5 4 3
        //   4 5 6 7 6 5 4
        // 5 6 7 8 9 8 7 6 5

        for(int i =1;i<=a;i++){
            s=0;
            int x1=i;

            for(int j=0;j<a -i;j++){
                System.out.print("  ");
            }
            for(int z = 0;z <i+y;z++){

                if(i ==z-s){
                    s++;
                    System.out.print(--x+" ");
                }else {
                    x=x1++;
                    System.out.print(x+" ");
                }
            }
            y++;


            System.out.println();
        }
    }
}
