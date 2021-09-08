package Git.HackerRank;


import java.util.*;


public class Alternating_Characters {


    public static int alternatingCharacters(String s) {

        int x =0;
        int count=0;
        for(int i =0;i<s.length()-1;i++){
            x = Character.compare(s.charAt(i),s.charAt(i+1));

            if(x==0){
                count++;
            }
        }

        return count;


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int [] arr = new int[x];

        for(int i=0;i<x;i++){
            String s = sc.next();
            arr[i]= alternatingCharacters(s);
        }
        for(int result:arr){
            System.out.println(result);
        }

    }
}

