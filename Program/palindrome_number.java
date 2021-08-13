package com.examples.palindrome;

import java.util.Scanner;

public class palindrome_number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number=");
        int a=sc.nextInt();
        int original=a;

        int rev=0;
        while(a!=0){
            rev=rev*10+a%10;
            a=a/10;
        }

        if(original==rev){     //   if(original.equals(rev))
            System.out.println(original+" is palindrome");

        }
        else{
            System.out.println("Is not a palindrome");
        }


    }
}
