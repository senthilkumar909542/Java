package Git.string_based_programs;


import java.util.*;

public class Check_anagram_of_String_1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first String:");
        String s1 = sc.nextLine();
        System.out.print("Enter the second String:");
        String s2 = sc.nextLine();
        int len1 = s1.length();
        int len2 = s2.length();
        int [] arr = new int [128];
        int [] arr1 = new int[128];
        boolean res = true;

        if(len1 != len2){
            System.out.println("It is not anagram");
        }else{

            for(int i =0;i<len1;i++){
                arr[s1.charAt(i)]++;
                arr1[s2.charAt(i)]++;
            }
            for(int i =0;i<128;i++){
                if(arr[i] != arr1[i] ){
                    res = false;
                    break;
                }
            }
            System.out.println(res?"It is anagram":"It is not anagram");

        }

    }
}