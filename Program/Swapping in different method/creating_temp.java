package com.examples.swapping;

import java.util.Scanner;

public class creating_temp {
    public static  void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number a=");
        int a = sc.nextInt();
        System.out.print("Enter the number b =");
        int b = sc.nextInt();
        System.out.printf("Before Swapping a=%d b =%d",a,b);

        int temp = a;
        a = b;
        b =temp;
        System.out.printf("\nAfter Swapping a=%d b =%d",a,b);
    }
}
