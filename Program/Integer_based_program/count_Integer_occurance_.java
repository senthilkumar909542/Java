package Git.integer_based_programs;

import java.util.Scanner;

public class count_Integer_occurance_ {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b  =a;
        int len = String.valueOf(a).length();
        int len1 = len;
        int rev   =0;
        int [] arr = new int[10];

        while(len>0) {
            rev = a % 10;
            arr[rev]++;
            a = a / 10;
            len--;

        }


        for(int i=0;i<len1;i++){
            int x = Integer.parseInt(String.valueOf(String.valueOf(b).charAt(i)));
            if(arr[x] !=-1){
                System.out.println(x+" count is "+" "+arr[x]+" times");
                arr[x]=-1;
            }
        }
    }
}
