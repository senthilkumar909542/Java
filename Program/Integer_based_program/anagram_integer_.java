package Git.integer_based_programs;

import java.util.Scanner;

public class anagram_integer_ {
    public static void main(String [] args){
        Scanner sc = new Scanner( System.in);
        System.out.print("Enter the number_1:");
        int x = sc.nextInt();
        System.out.print("Enter the number_2:");
        int y = sc.nextInt();

        String s1 = String.valueOf(x);
        String s2 = String.valueOf(y);

        int len1 = s1.length();
        int len2 = s2.length();
        boolean res = true;

        if(len1 != len2 ){
            System.out.println("Not an anagrams");
        }else{
            int [] arr = new int[10];
            int [] arr1 = new int[10];

            while(len1>0){
                int temp = x%10;
                int temp1 = y%10;
                arr[temp]++;
                arr1[temp1]++;
                len1--;
                x/= 10;
                y/=10;
            }

            for(int i =0;i<10;i++){
                if (arr[i] != arr1[i]) {
                    res = false;
                    break;
                }
            }

            System.out.println((res)?"Anagrams":"Not an anagrams");
        }




    }
}
