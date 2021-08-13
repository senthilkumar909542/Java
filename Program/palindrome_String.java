package com.examples.palindrome;
import java.util.*;

public class palindrome_String {
boolean res = true;
    void test(String str){


        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i) == str.charAt(str.length()-1-i)){
                res = true;
            }else{
                res = false;
                break;
            }
        }
        System.out.println(res?"A palindrome":"not a palindrome");



        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        palindrome_String obj = new palindrome_String();

        obj.test(str);


    }
}

