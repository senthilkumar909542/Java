

import java.util.Scanner;

public class x_formation_string_pattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        for(int i =0;i<s.length();i++){
           for(int j =0;j<s.length();j++){
               if(j == i || j == s.length()-1-i) {

                   System.out.print(s.charAt(j));
               }
               System.out.print(" ");
           }
            System.out.println();
        }

    }
}
