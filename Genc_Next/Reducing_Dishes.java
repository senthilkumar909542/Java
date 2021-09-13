package Git.Genc_Next;

import java.util.*;
public class Reducing_Dishes {

    public static void main(String []args) {


        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int [] input2 = new int[input1];

        for(int i=0;i<input1;i++){
            input2[i]=sc.nextInt();
        }
        int x =0,count=1;
        for(int i=1;i<=input1;i++){

            if(i-1==0){
                x+=count*input2[i-1];
                count++;
            }else if(input2[i-1]>=0){

                x+=count*input2[i-1];
                count++;
            }
        }
        System.out.println(x);
        }
    }



