package com.examples.sorting;

import java.util.Scanner;

public class sortingstring {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1="";
        int len = str.length();
        char [] a = new char[len];
        char temp;

        for(int i =0;i<len;i++){

            a[i]=str.charAt(i);
        }

        for(int i =0 ; i < str.length();i++){
            for(int j=i+1;j<str.length();j++ ){
                if(a[i]>a[j]){
                   temp = a[i];
                   a[i]=a[j];
                   a[j]=temp;

                }
            }
        }

        for(char b:a){

             str1=str1.concat(String.valueOf(b));

        }
        System.out.println(str1);


    }
}
