package Git.HackerRank;


import java.util.Scanner;

public class Sherlock_and_the_Valid_String {


    public static String isValid(String s) {
        int [] arr = new int[128];


        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)]++;
        }


        String s1 ="";
        for(int i=65;i<128;i++){
            if(arr[i]!=0){
                s1  = s1.concat(String.valueOf(arr[i]));
            }
        }

        int count =0;

        for(int i=0;i<s1.length();i++){
            if(Integer.parseInt(String.valueOf(s1.charAt(i)))%2!=0){
                count++;
            }
        }
        return count!=1 ?"NO":"YES";
    }


    public static void main(String[] args)  {
       Scanner sc  = new Scanner(System.in);
       String s = sc.nextLine();
       String res = isValid(s);
        System.out.println(res);
    }

}
