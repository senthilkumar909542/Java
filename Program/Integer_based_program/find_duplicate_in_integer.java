package Git.integer_based_programs;


import java.util.Scanner;

public class find_duplicate_in_integer {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int b  =num;

        int len = String.valueOf(num).length();
        int len1 = len;
        int rev   =0;
        int [] arr = new int[10];

        while(len>0) {
            rev = num % 10;
            arr[rev]++;
            num /= 10;
            len--;

        }

        for(int i=0;i<len1;i++){
            int x = Integer.parseInt(String.valueOf(String.valueOf(b).charAt(i)));
            if(arr[x]>=2){
                System.out.print(x+" ");
                arr[x]=-1;
            }
        }
    }
}
