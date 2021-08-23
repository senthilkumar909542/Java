package Git.string_based_programs;

import java.util.*;

public class duplicate_character_from_String_2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int [] arr = new int[128];
        for(int i=0;i<s.length();i++){
            int c = s.charAt(i);
            arr[c]++;
        }
        for(int i =0;i<s.length();i++) {
            int c = s.charAt(i);
            if(arr[c]!=0){
                System.out.println("Character is "+s.charAt(i)+" count is  "+arr[c]);
                arr[c]=0;
            }
        }
    }
}