package com.examples.swapping;

import java.util.Scanner;

public class By_using_Multiple_divide {
    public static  void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number a=");
        int a = sc.nextInt();
        System.out.print("Enter the number b =");
        int b = sc.nextInt();
        System.out.printf("Before Swapping a=%d b =%d",a,b);


        a = a*b;
        b = a/b;
        a = a/b;
        System.out.printf("\nAfter Swapping a=%d b =%d",a,b);
    }
}
