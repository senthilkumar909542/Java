package Git.Sorting_And_Searching;

import java.util.Scanner;

public class binary_Search {
    static  void test(int [] arr ,int len){

    }
    public static  void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();

        int [] arr = new int[len];

        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }

        test(arr,len);
    }
}
