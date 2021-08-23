package Git.string_based_programs;

import java.util.Arrays;
import java.util.Scanner;

public class Check_anagram_of_String_2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first String:");
        String s1 = sc.nextLine();
        System.out.print("Enter the second String:");
        String s2 = sc.nextLine();
        int len1 = s1.length();
        int len2 = s2.length();


        if(len1 != len2){
            System.out.println("It is not anagram");
        }else{
            // using sorting method
            char [] temp = s1.toCharArray();
            char [] temp1 = s2.toCharArray();
            Arrays.sort(temp);
            Arrays.sort(temp1);
            boolean res = Arrays.equals(temp, temp1);
            System.out.println(res?"It is anagram":"It is not anagram");
        }
    }
}