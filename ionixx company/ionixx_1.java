package Git.ionixx;

import java.util.*;
public class ionixx_1 {

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int s =sc.nextInt();
        int count =0;

        while(s!=0){

            if(s>=5 ){
                s-=5;
            }else if(s>=4) {
                s-=4;
            }else if(s>=3){
                s-=3;

            }else if(s >= 2){
                s-=2;

            }else if(s>=1){
                s-=1;
            }
            count++;


        }
        System.out.println(count);
    }
}

// one step the robot can move 1,2,3,4,5
// sample input 1:  10
// output:       :   2

// sample input 2:  12
// output        :  3
