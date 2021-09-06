package Git.Rits;

import java.util.Scanner;
public class advanced_prime_numbers {

    static  int test(int x ){

        int count =1;
        int value = 0;

        for(int i =2;i<=x;i++){
            if(x%i==0){
                if(count==1){
                    value=i;
                }
                count++;
            }
            if(count==3){
                break;
            }


        }
        return (count==3)?(value):(1);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int res = test(x);
        System.out.println(res);


    }
}
