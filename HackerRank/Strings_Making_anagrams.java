package Git.HackerRank;


import java.util.*;

public class Strings_Making_anagrams {



    public static int makeAnagram(String a, String b) {
        int [] arr = new int[128];
        int [] arr1 = new int[128];

        for(int i =0;i<a.length();i++){
            arr[a.charAt(i)]++;
        }
        for(int i=0;i<b.length();i++){
            arr1[b.charAt(i)]++;
        }

        int count=0;



        for(int i=65;i<128;i++){
            int res =0;


            if(arr[i]!=arr1[i]){
                res = Math.abs(arr[i]-arr1[i]);
                count += res;
            }
        }


        return count;



    }


    public static void main(String[] args) {

      Scanner sc = new Scanner (System.in);
      String s  = sc.nextLine();
      String s1 = sc.nextLine();
      int res = makeAnagram(s,s1);
        System.out.println(res);



    }
}
