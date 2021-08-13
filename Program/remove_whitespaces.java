package com.examples.removewhitespaces;

import java.util.Scanner;

public class remove_whitespaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();
        char[] c = str.toCharArray();
        StringBuilder obj = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if ((c[i] != ' ')&&(c[i]!='\t')){
                obj.append(c[i]);
            }
        }
        System.out.println(obj.toString());

    }
}

